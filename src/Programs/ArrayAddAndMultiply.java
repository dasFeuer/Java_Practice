package Programs;

import java.util.Scanner;

public class ArrayAddAndMultiply {
    public static void print_addedArray(int [][] matrix1, int [][] matrix2, int[][]sum, int row, int column){
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Added result:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print_MultiplyArray(int [][] matrix1, int [][] matrix2, int[][] multiply, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                multiply[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("Multiplied result:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input row: ");
        int row = sc.nextInt();
        System.out.print("Input column: ");
        int column = sc.nextInt();

        int [][] matrix1 = new int[row][column];
        int [][] matrix2 = new int [row][column];
        int [][] sum = new int[row][column];
        int [][] multiply = new int[row][column];

        System.out.println("Print the elements for first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        print_addedArray(matrix1, matrix2, sum, row, column);

        System.out.println("------------------------------------");
        print_MultiplyArray(matrix1, matrix2, multiply, row, column);
    }
}

// import java.util.Scanner;

// public class ArrayAddandMultiply {

//     public static void addArray(int[][] firstMatrix, int[][] secondMatrix, int[][] twoD_Matrix, int row, int column) {
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 twoD_Matrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//             }
//         }

//         for (int[] rowArray : twoD_Matrix) {
//             for (int columnValue : rowArray) {
//                 System.out.print(columnValue + "  ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };
//         int[][] secondMatrix = { { 7, 8, 9 }, { 6, 8, 4 } };
//         int row = 2;
//         int column = 3;

//         int[][] twoD_Matrix = new int[row][column];

//         addArray(firstMatrix, secondMatrix, twoD_Matrix, row, column);
//     }
// }
