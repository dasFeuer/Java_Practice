package Programs;

import java.util.Scanner;

public class ReverseNumbers {
    public static void printNum(int startNum, int endNum){
        while (startNum >= endNum){
            System.out.println(startNum);
            startNum--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Starting Number : ");
        int startNum = sc.nextInt();

        System.out.print("Enter The Ending Number : ");
        int endNum = sc.nextInt();

        printNum(startNum, endNum);
    }
}
