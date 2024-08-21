package FileCreateWriteAndRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void fileCreate(){
        try{
            File myFile = new File("C:\\Users\\Acer\\IdeaProjects\\MyCode.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            FileWriter myFileWriter = new FileWriter("C:\\Users\\Acer\\IdeaProjects\\MyCode.txt");
            myFileWriter.write("I am programmer and I write the code so that computer can run in my way.");
            myFileWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void readFile(){
        try {
            File myFile = new File("C:\\Users\\Acer\\IdeaProjects\\MyCode.txt");
            Scanner myFileReader = new Scanner(myFile);
            while(myFileReader.hasNextLine()){
                String data = myFileReader.nextLine();
                System.out.println(data);
            }
            myFileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        fileCreate();

        writeFile();

        readFile();
    }
}

