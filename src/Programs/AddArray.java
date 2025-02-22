package Programs;

import java.util.Arrays;

public class AddArray {
    public static void addTheArray(){
        int[] array = {3, 1, 5, 6, 7};
        int num = array.length;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += array[i];
            array[i] = sum;
        }
        System.out.println("Running added array: " + Arrays.toString(array));
        System.out.println("Total added array: " + sum);

    }
    public static void main(String[] args) {
        addTheArray();
    }
}
