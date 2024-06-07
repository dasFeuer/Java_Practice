import java.util.*;

public class loops {
    public static void main(String[] args) {
        System.out.println("This is loops code.");
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + "X" + i  + "=" + n * i);
        }

//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println("SUM: " + sum);


//        int i = 0;
//        do {
//            System.out.println("Number: " + i);
//            i++;
//        } while (i < 11);

//        int i = 0;
//        while (i < 11) {
//            System.out.println("Number: " + i);
//            i++; // i = i + 1
//
//        }
//      for (int i = 0; i < 11; i++) {
//            System.out.println("Number: " + i);
//        }
    }
}
