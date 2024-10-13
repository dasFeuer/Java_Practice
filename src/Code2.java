import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 1st number: ");
            double int1 = sc.nextDouble();
            System.out.print("Enter action, +, -, *, /: ");
            String action = sc.next();
            System.out.print("Enter 2nd number: ");
            double int2 = sc.nextDouble();
            Calculator1 calculator1 = new Calculator1(int1, int2);

            switch (action) {
                case "+" -> System.out.println("Addition: " + int1 + " + " + int2 + " = " + calculator1.addition());
                case "-" -> System.out.println("Subtraction: " + int1 + " - " + int2 + " = " + calculator1.subtraction());
                case "*" -> System.out.println("Subtraction: " + int1 + " * " + int2 + " = " + calculator1.multiply());
                case "/" -> {
                    try {
                        System.out.println("Division: " + int1 + " / " + int2 + " = " + calculator1.division());
                    } catch (ArithmeticException e) {
                        System.out.println("Invalid action " + e.getMessage());
                    }

                }

                default -> System.out.println("Invalid action");

            }
        }
    }
}
