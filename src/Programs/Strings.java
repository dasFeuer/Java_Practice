package Programs;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.print("Your name is: " + name);

        //Concatenation
//        String firstName = "Barun";
//        String lastName = "Panthi Sharma";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
//        System.out.println(fullName.length());
//
          //charAt
//        for (int i = 0; i < fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));
//        }

        //Compare the Strings
//        String name1 = "Barun";
//        String name2 = "Barun1";

//        if (name1.compareTo(name2) == 0) {
//            System.out.println("Strings are equal.");
//        } else {
//            System.out.println("Strings are not equal.");
//        }

//        if (name1 == name2) {
//            System.out.println("Strings are equal.");
//        } else {
//            System.out.println("Strings are not equal.");
//        } // Not recommended for comparison

//        if(new String("Barun") == new String("Barun")) {
//            System.out.println("Strings are equal.");
//        } else {
//            System.out.println("Strings are not equal.");
//        }

//        String sentence = "Mein Name ist Barun Panthi Sharma";
//        String name = sentence.substring(14, sentence.length());
        String sentence = "BarunPanthiSharma";
//        String name = sentence.substring(0, 5); // (beginIndex, endIndex)
        String name = sentence.substring(5);
        System.out.println(name);

        //STRINGS ARE IMMUTABLE
    }
}
