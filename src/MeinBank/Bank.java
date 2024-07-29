package MeinBank;

import java.util.Scanner;

public class Bank {

    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Willkommen bei der Barun’s Bank-------");
        Integer Options = 0;

        while (Options != 4) {
            System.out.println("1. Wert ueberpruefen");
            System.out.println("2. Einzahlungsguthaben");
            System.out.println("3. Guthaben abheben");
            System.out.println("4. Beenden");
            System.out.print("Geben Sie die Option 1/2/3/4: ");
            Options = sc.nextInt();

            switch (Options) {
                case 1 ->
                        checkBalance();
                case 2 ->
                        depositBalance();
                case 3 ->
                        withdrawBalance();
                case 4 ->
                        exit();
                default -> System.out.println("UNGÜLTIGE OPTION!! Bitte geben Sie die richtige Option ein.");
            }
            System.out.println();
        }

    }

    public static void checkBalance() {
        System.out.println("Ihr aktuelles Guthaben wird $" + balance);
        System.out.println();
    }

    public static void depositBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viel moechten Sie einzahlen: ");
        double amount = sc.nextDouble();
        balance += amount; //balance = balance + amount;
        System.out.println("Sie haben erfolgreich: $" + amount + " eingezahlt");
        checkBalance();
        System.out.println();
    }


    public static void withdrawBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viel moechten Sie abheben: ");
        double amount = sc.nextDouble();

        if (balance < amount) {
            System.out.println("Ungenuegendem Guthaben!");
        } else {
            balance -= amount; //balance = balance - amount;
            System.out.println("Sie haben erfolgreich $" + amount + " eingezogen");
        }
        checkBalance();
        System.out.println();
    }

    public static void exit() {
        System.out.println("Vielen Dank für die Nutzung von Barun’s Bank. Bis bald!");
        System.out.println();
    }

}
