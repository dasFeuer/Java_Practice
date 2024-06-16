import java.util.Scanner;

public class Arrays_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of your name: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < size ; i++) {
            System.out.print("Input your name: ");
            names[i] = sc.next();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + " is: " + names[i]);
        }

    }
}
