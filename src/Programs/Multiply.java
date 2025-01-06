package Programs;

import java.util.Scanner;

public class Multiply {
    static void theMultiply(int start, int num, int range) {
        for (int i = start; i <= range; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start multiply from 0 or 1, or your choice: ");
        int start = sc.nextInt();
        System.out.println("Enter the number that you want the multiply: ");
        int num = sc.nextInt();
        System.out.println("Up to which range you want the multiply: ");
        int range = sc.nextInt();

        System.out.println("------------------------------");
        System.out.println("The multiply of " + num + ": ");
        theMultiply(start, num, range);

    }
}
