package OOPS.new1.BasicConcepts;

import java.util.Scanner;

class Calculator{
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        if(num2 != 0){
            return num1/num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

}

public class Calculator_OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueProgram = "y";

        while (continueProgram.equalsIgnoreCase("y")){

            System.out.print("Enter 1st number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter 2nd number: ");
            double num2 = sc.nextDouble();

            Calculator calculator = new Calculator(num1, num2);

            System.out.println("Choose operation: +, -, *, /");
            String operation = sc.next();

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case "+" -> result = calculator.add();

                case "-" -> result = calculator.subtract();

                case "*" -> result = calculator.multiply();

                case "/" -> {
                    try {
                        result = calculator.divide();
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        validOperation = false;
                    }
                }
                default -> {
                    System.out.println("Invalid operation");
                    validOperation = false;
                }
            }

            if(validOperation){
                System.out.println("The result is: " + result);
            }
            System.out.print("Do you want to perform another calculation(y/n): ");
            continueProgram = sc.next().toLowerCase();
            System.out.println();
        }

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}
