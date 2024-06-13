import java.util.Scanner;

public class Function_Practice {
    public  static void calcAge (int age){
        if(age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("Sorry but you are not eligible to vote!");
        }
    }
//    public static void calcOdd (int maxNumber) {
//        int oddSum = 0;
//        for (int i = oddSum; i <= maxNumber ; i++) {
//            if (i % 2 != 0) {
//                oddSum = oddSum + i;
//            }
//        }
//        System.out.println("The off sum upto " + maxNumber + "is" + oddSum);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number to add the odd numbers upto: ");
//        int maxNumber= sc.nextInt();
//        calcOdd(maxNumber);
        System.out.print("Enter your age please: ");
        int age = sc.nextInt();
        calcAge(age);
        sc.close();
    }
}

