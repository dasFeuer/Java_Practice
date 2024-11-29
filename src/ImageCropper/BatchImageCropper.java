package ImageCropper;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BatchImageCropper {

    public static void main(String[] args) {
        //File directory
        String folderPath = "C:\\Users\\Acer\\Pictures\\NeedToCrop";
        String outputFolderPath = "C:\\Users\\Acer\\Pictures\\Cropped";

        //Crop measurement
        int topCrop = 50;
        int bottomCrop = 120;
        int leftCrop = 50;
        int rightCrop = 50;

        File folder = new File(folderPath);
        File outputFolder = new File(outputFolderPath);

        //Create output folder if not
        if (!outputFolder.exists()) {
            outputFolder.mkdirs();
        }

        File[] imageFiles = folder.listFiles((dir, name) -> {
            String lowerName = name.toLowerCase();
            return lowerName.endsWith(".jpg") || lowerName.endsWith(".jpeg") || lowerName.endsWith(".png");
        });

        if (imageFiles != null && imageFiles.length > 0) {
            for (File imageFile : imageFiles) {
                try {
                    System.out.println("Processing file: " + imageFile.getAbsolutePath());

                    BufferedImage originalImage = ImageIO.read(imageFile);
                    int originalWidth = originalImage.getWidth();
                    int originalHeight = originalImage.getHeight();

                    System.out.println("Original size: " + originalWidth + "x" + originalHeight);

                    if (topCrop + bottomCrop < originalHeight && leftCrop + rightCrop < originalWidth) {
                        int newWidth = originalWidth - leftCrop - rightCrop;
                        int newHeight = originalHeight - topCrop - bottomCrop;

                        BufferedImage croppedImage = originalImage.getSubimage(leftCrop, topCrop, newWidth, newHeight);

                        File outputFile = new File(outputFolder, imageFile.getName());
                        boolean isSaved = ImageIO.write(croppedImage, "jpg", outputFile); // Save as JPG
                        if (isSaved) {
                            System.out.println("Cropped and saved: " + outputFile.getAbsolutePath());
                        } else {
                            System.err.println("Failed to save: " + outputFile.getAbsolutePath());
                        }
                    } else {
                        System.err.println("Crop dimensions exceed image bounds for: " + imageFile.getName());
                    }
                } catch (Exception e) {
                    System.err.println("Failed to process " + imageFile.getName() + ": " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No image files found in the folder: " + folderPath);
        }
    }
}
