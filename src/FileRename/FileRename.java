package FileRename;

import java.io.File;
import java.util.Scanner;

public class FileRename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String directoryPath = "C:\\Users\\Acer\\Eric"; //Path directory

        System.out.print("Enter starting number for the current file sequence: ");
        int startNumber = sc.nextInt();

        System.out.print("Enter starting number for the new file sequence: ");
        int newStartNumber = sc.nextInt();

        //Open directory
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }

        // Getting files list
        File[] files = directory.listFiles((dir, name) -> name.startsWith("Scan_20241126"));
        if (files == null || files.length == 0) {
            System.out.println("No files found matching the pattern in the directory.");
            return;
        }

        System.out.println("Found " + files.length + " files. Starting renaming process...");

        int currentNumber = startNumber;
        int newNumber = newStartNumber;

        for (File currentFile : files) {
            // Generating new file name
            String newFileName = "Page_" + newNumber + ".pdf";
            File newFile = new File(directoryPath, newFileName);

            if (currentFile.renameTo(newFile)) {
                System.out.println("Renamed: " + currentFile.getName() + " -> " + newFileName);
            } else {
                System.out.println("Failed to rename: " + currentFile.getName());
            }

            currentNumber++;
            newNumber++;
        }

        System.out.println("Renaming process completed.");
    }
}
