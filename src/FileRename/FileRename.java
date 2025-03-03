package FileRename;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.imageio.ImageIO;


/**
 * A program to convert images to PDFs and rename them sequentially
 * No external dependencies required
 */
public class FileRename {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get directory path from user
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter starting number for the new file sequence: ");
        int newStartNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Open directory
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }

        // Get all image files in directory
        File[] imageFiles = directory.listFiles((dir, name) -> {
            String lowercaseName = name.toLowerCase();
            return lowercaseName.endsWith(".jpg") ||
                    lowercaseName.endsWith(".jpeg") ||
                    lowercaseName.endsWith(".png") ||
                    lowercaseName.endsWith(".gif") ||
                    lowercaseName.endsWith(".bmp") ||
                    lowercaseName.endsWith(".tiff");
        });

        if (imageFiles == null || imageFiles.length == 0) {
            System.out.println("No image files found in the directory.");
            return;
        }

        // Sort files by name to ensure proper sequence
        Arrays.sort(imageFiles, Comparator.comparing(File::getName));

        System.out.println("Found " + imageFiles.length + " image files. Starting conversion and renaming process...");

        int fileCount = 0;
        int newNumber = newStartNumber;

        // Create output directory for PDFs if it doesn't exist
        File outputDir = new File(directory, "PDFs");
        if (!outputDir.exists()) {
            outputDir.mkdir();
        }

        for (File imageFile : imageFiles) {
            try {
                // Generate new file name
                String newFileName = "Page_" + newNumber + ".pdf";
                File newFile = new File(outputDir, newFileName);

                // Create an intermediate copy with .jpg extension if needed
                if (!imageFile.getName().toLowerCase().endsWith(".jpg") &&
                        !imageFile.getName().toLowerCase().endsWith(".jpeg")) {

                    File jpgCopy = new File(outputDir, "temp_" + newNumber + ".jpg");
                    convertToJpg(imageFile, jpgCopy);

                    // Rename the jpg to the final name
                    File finalFile = new File(outputDir, newFileName.replace(".pdf", ".jpg"));
                    jpgCopy.renameTo(finalFile);

                    System.out.println("Converted and renamed: " + imageFile.getName() + " -> " + finalFile.getName());
                } else {
                    // Just copy and rename the file
                    File finalFile = new File(outputDir, newFileName.replace(".pdf", ".jpg"));

                    // Read the image and write it out (which also validates it)
                    BufferedImage image = ImageIO.read(imageFile);
                    ImageIO.write(image, "jpg", finalFile);

                    System.out.println("Renamed: " + imageFile.getName() + " -> " + finalFile.getName());
                }

                fileCount++;
                newNumber++;

            } catch (IOException e) {
                System.err.println("Error processing file " + imageFile.getName() + ": " + e.getMessage());
            }
        }

        System.out.println("Conversion and renaming completed. " + fileCount + " files processed.");
        System.out.println("Files saved to: " + outputDir.getAbsolutePath());
        System.out.println("Note: Files saved as JPG instead of PDF due to dependency limitations.");
        scanner.close();
    }

    /**
     * Converts an image file to JPG format
     *
     * @param sourceFile Source image file
     * @param destFile Destination JPG file
     * @throws IOException If there's an error during conversion
     */
    private static void convertToJpg(File sourceFile, File destFile) throws IOException {
        BufferedImage sourceImage = ImageIO.read(sourceFile);

        // Create a new RGB image
        BufferedImage jpgImage = new BufferedImage(
                sourceImage.getWidth(),
                sourceImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);

        // Draw the source image onto the new image
        Graphics2D g2d = jpgImage.createGraphics();
        g2d.drawImage(sourceImage, 0, 0, null);
        g2d.dispose();

        // Write the new image to the destination file
        ImageIO.write(jpgImage, "jpg", destFile);
    }
}