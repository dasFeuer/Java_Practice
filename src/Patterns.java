//import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Patterns Questions: ");

//        int n = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                int sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();

        } // 0 - 1 bank.Triangle

//        int n = 5;
//        int number = 1;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i ; j++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        } // Floyd's triangle

//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i+1 ; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        } // Inverted half pyramid with number

//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i ; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        } // Half pyramid with number

//        int n = 4;
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }// Inverted half Pyramid (rotated 180 deg)

//        int n = 4;
//
//        for (int i = n; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        } // Inverted half Pyramid

//        int n = 4;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        } // Half Pyramid

//        int n = 4;
//        int m = 5;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= m ; j++) {
//                if(i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        } // Hallow rectangle


//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next();
//        for (int i = 1; i <= 4 ; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(userInput);
//            }
//            System.out.println(userInput);
//        } // Solid rectangle
    }
}
