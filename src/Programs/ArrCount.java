package Programs;

import java.util.Scanner;

public class ArrCount {
    public static void countNum(int[] arr) {
        int evenCount=0;
        int oddCount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("OddCount: " + oddCount + "\n" + "EvenCount: " + evenCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2, 1, 7, 9, 4, 8, 3};

         countNum(arr);
    }
}
