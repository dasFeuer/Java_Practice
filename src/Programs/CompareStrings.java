package Programs;

import java.util.Scanner;

public class CompareStrings {
    public static void compareStrings(String str1, String str2){
        System.out.println(str1.equals(str2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st string: ");
        String str1 = sc.next();
        System.out.print("Input 2st string: ");
        String str2 = sc.next();

        compareStrings(str1, str2);
    }
}
