import java.util.*;

public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button 1, 2 or 3: ");
        int btn = sc.nextInt();

        switch (btn) {
            case 1 -> System.out.println("Namaste");
            case 2 -> System.out.println("Guten Tag");
            case 3 -> System.out.println("Hello");
            default -> System.out.println("Invaild button");
        }
        // switch (btn) {
        //     case 1:
        //         System.out.println("Namaste");
        //         break;
        //     case 2:
        //         System.out.println("Guten Tag");
        //         break;
        //     case 3:
        //         System.out.println("Hello");
        //         break;
        //     default: System.out.println("Invaild button");
        // }

        // if (btn == 1) {
        //     System.out.println("Namaste");
        // } else if (btn == 2) {
        //     System.out.println("Guten Tag");
        // } else if (btn == 3) {
        //     System.out.println("Hello");
        // } else {
        //     System.out.println("Invaild button");
        // }
        // System.out.println("Enter the 1st number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the 2nd number: ");
        // int b = sc.nextInt();
        // if (a == b) {
        //     System.out.println("Equal");
        // } else if (a > b) {
        //         System.out.println("a is greater than b");
        // } 
        //  else {
        //         System.out.println("b is greater than a");
        // }
        // if (a == b) {
        //     System.out.println("Equal");
        // } else {
        //     if (a > b) {
        //         System.out.println("a is greater than b");
        //     } else {
        //         System.out.println("b is greater than a");
        //     }
        // }
        // int x = sc.nextInt();
        // if (x % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
        // int age = sc.nextInt();
        // if(age > 18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not adult");
        // }
    }
}