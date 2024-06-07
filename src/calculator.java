import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        String operators = "+" + "-" + "*" + "/";
        System.out.println("Enter the operator +, -, /, *: ");
        String op = sc.next();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        switch (op) {
            case "+" -> System.out.println("Addition: " + (a + b));
            case "-" -> System.out.println("Subtraction :" + (a - b));
            case "/" -> System.out.println("Division: " + (a / b));
            case "*" -> System.out.println("Multiply: " + (a * b));
            default -> System.out.println("Invalid operator");
        }

//        if (op.equals("+")) {
//            System.out.println("Addition: " + (a + b));
//        } else if (op.equals("-")) {
//            System.out.println("Subtraction: " + (a - b));
//        } else if (op.equals("/")) {
//            System.out.println("Division: " + (a / b));
//        } else if (op.equals("*")) {
//            System.out.println("Multiply: " + (a * b));
//        } else {
//            System.out.println("Invalid operator");
//        }
    }
}
