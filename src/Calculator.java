import java.util.*;
//Calculator
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter the operator +, -, /, *: ");
        String op = sc.next();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        switch (op) {
            case "+" -> System.out.println("Addition: " + (a + b));
            case "-" -> System.out.println("Subtraction :" + (a - b));
            case "/" -> {
                if(b != 0) {
                    double result = (double) a / b;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            case "*" -> System.out.println("Multiply: " + (a * b));
            default -> System.out.println("Invalid operator");
        }
        sc.close();

// This IF-ELSE code can also be used to make simple calculator program.

//        if (op.equals("+")) {
//            System.out.println("Addition: " + (a + b));
//        } else if (op.equals("-")) {
//            System.out.println("Subtraction: " + (a - b));
//        } else if (op.equals("/")) {
//            if (b != 0) {
//              double result = (double) a / b;
//              System.out.println("Division: " + result);
//            } else {
//                System.out.println("Error: Division by zero is not allowed.");
//            }
//        } else if (op.equals("*")) {
//            System.out.println("Multiply: " + (a * b));
//        } else {
//            System.out.println("Invalid operator");
//        }
//        sc.close();

    }
}
