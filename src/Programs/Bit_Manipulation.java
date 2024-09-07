package Programs;

import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {
        // For 1 --> AND with NOT and For 0 --> OR
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        // operation = 1 : SET and operation = 0 : CLEAR
        int n = 5;
        int position = 1;

        int bitMask = 1<<position;
        if (operation == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }


        //AND with NOT
//        int n = 5;
//        int position = 2;
//        int bitMask = 1<<position;
//
//        int notBitmask = ~(bitMask);
//
//        int newNumber = notBitmask & n;
//        System.out.println(newNumber);

        //OR
//        int n = 5;
//        int position = 1;
//        int bitMask = 1<<position;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

        // AND
//        int n = 5;
//        int position = 2;
//        int bitMask = 1<<position;
//
//        if((bitMask & n) == 0) {
//            System.out.println("Bit was 0.");
//        } else {
//            System.out.println("Bit was 1.");
//        }
    }
}
