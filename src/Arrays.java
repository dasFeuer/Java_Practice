import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//      int[] marks= new int[3];
//     int[] marks = new int[3];
//        marks[0] = 99;
//        marks[1] = 97;
//        marks[2] = 92;
//        int []marks = {98, 89, 77};
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        //Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("X found at index: " + i);
            }
        }
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//
//        //Input
//        for (int i = 0; i < size; i++) {
//            numbers[i] = sc.nextInt();
//        }

//      System.out.println(marks[0]);
//      System.out.println(marks[1]);
//      System.out.println(marks[2]);

//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }
        //Output
//        for (int i = 0; i < size; i++) {
//            System.out.println(numbers[i]);
//        }
    }
}
