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
                System.out.print(i + "");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to which you want even: ");
        int num = sc.nextInt();

        addEven(num);
        printEven(num);

    }
}
