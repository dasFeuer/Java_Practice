package Programs;

import java.util.Arrays;

public class AddTheNumberInArray {
    public static void addTheNumber(){
        int []array = {2, 3, 4, 5};
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            number += array[i];
            array[i] = number;
        }
        System.out.println("Total: " + number);
        System.out.println(Arrays.toString(array) + " => " + number);
    }
    public static void main(String[] args) {
        addTheNumber();
    }
}
