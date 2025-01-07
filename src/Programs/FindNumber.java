package Programs;

import java.util.Scanner;

public class FindNumber {
    static void findNum(int[] arr, int target) {
        for (int element : arr) {
            if (target == element) {
                System.out.println("Number is present in Array: " + target);
                return;
            }
        }
        System.out.println("NOT FOUND --> The number you are search for, is not present in the array: " + target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 5, 8, 1};

        System.out.println("Enter the number that you want to found: ");
        int target = sc.nextInt();

        findNum(arr, target);
    }
}
