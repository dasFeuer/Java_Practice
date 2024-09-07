package Programs;

import java.util.*;

public class Functions {
//    public static void callMyName(String name) {
//        System.out.println(name);
//        return;
//
//    public static int calcSum(int a, int b) {
//            int sum = a + b;
//            return sum;
//            }
//    public static int calcProduct(int a, int b) {
//        return a * b;
//
//    public static void printFactorial(int n){
//        if(n < 0) {
//            System.out.println("Ungültige Nummer, Syntax Fehler!");
//            return;
//        }
//       int factorial = 1;
//        for(int i=n; i>=1; i--){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);
//        return;
    public static double avgNum(int a, int b, int c){
        return (double) (a + b + c) /3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie erste Integer ein: ");
        int a = sc.nextInt();
        System.out.print("Geben Sie zweite Integer ein: ");
        int b = sc.nextInt();
        System.out.print("Geben Sie dritte Integer ein: ");
        int c = sc.nextInt();

        double avg = avgNum(a, b, c);

        System.out.println("Der Durchschnitt von drei Zahlen ist " + avg);


//        System.out.print("Geben Sie erste Integer ein: ");
//        int n = sc.nextInt();
//
//        printFactorial(n);

//        System.out.print("Geben Sie erste Integer ein: ");
//        int a = sc.nextInt();
//        System.out.print("Geben Sie zweite Integer ein: ");
//        int b = sc.nextInt();
//        System.out.println("Die Produkte von a und b ist " + calcProduct(a, b) + ".");

//        System.out.print("Geben Sie erste Integer ein: ");
//        int a = sc.nextInt();
//        System.out.print("Geben Sie zweite Integer ein: ");
//        int b = sc.nextInt();
//
//        int sum = calcSum(a, b);
//        System.out.println("Die Summe von a und b ist " + sum);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Wie heißen Sie?: ");
//        String name = sc.nextLine();
//        callMyName("Ich heiße " + name + ".");
    }
}
