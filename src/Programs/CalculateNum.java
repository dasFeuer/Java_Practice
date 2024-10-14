package Programs;

import java.util.Scanner;
public class CalculateNum {

    public static void addEven(int num) {
        int digit = 0;
        for (int i = 1; i <= num; i++) {

            if(i % 2 == 0){
                digit += i;
            }
        }
        System.out.println("The addition of upto " + num + " for even number is " + digit);
    }

    public static void printEven(int num) {
        for (int i = 1; i <= num; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void addOdd(int num) {
        int digit = 0;
        for (int i = 1; i <= num; i++) {

            if(i != 2){
                digit += i;
            }
        }
        System.out.println("The addition of upto " + num + " for odd number is " + digit);
    }

    public static void printOdd(int num) {
        for (int i = 1; i <= num; i++) {
            if(i != 2){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter number to which you want even: ");
            int num = sc.nextInt();

            addEven(num);
            System.out.println("-----------------------");
            printEven(num);

            System.out.println();

            System.out.println("Do you also want to add and print odd number same as even (y/n): ");
            try {
                String action = sc.next().toLowerCase();
                if(action.equals("n")) {
                    System.out.println("See you again!");
                    break;
                } else if(action.equals("y")) {
                    addOdd(num);
                    System.out.println("------------------");
                    printOdd(num);
                } else {
                    System.out.println("Invalid input!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input please try again!");
            }

            System.out.println("Do you want to continue or end the program (y/n): ");
            try {
                String action = sc.next().toLowerCase();
                if(action.equals("n")) {
                    System.out.println("Thank you and see you again!");
                    break;
                } else {
                    System.out.println("Welcome back to the program!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input please try again!");
            }

        }

    }
}
