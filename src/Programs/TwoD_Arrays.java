package Programs;

import java.util.*;

public class TwoD_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number for columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        //Input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x =sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x){
                    System.out.println("X found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number for rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter the number for columns: ");
//         int cols = sc.nextInt();
//
//         int[][] numbers = new int[rows][cols];
//         //Input
//         //rows
//         for (int i = 0; i < rows; i++) {
//             //columns
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//
//         //Output
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }