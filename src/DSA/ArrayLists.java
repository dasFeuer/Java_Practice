package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
//        ArrayList<String>list2 = new ArrayList<String>();
//        ArrayList<Boolean>list3 = new ArrayList<Boolean>();

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println("1. " + list);

        // get elements
        int element = list.get(2);
        System.out.println("2. " + element);

        // add the elements in between
        list.add(1, 1);
        System.out.println("3. " + list);

        // set element
        list.set(0, 5);
        System.out.println("4. " + list);

        // delete element
        list.remove(3);
        System.out.println("5. " + list);

        // size
        int size = list.size();
        System.out.println("6. " + size);
        
        // for loops
        System.out.print("7. ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting the list
        Collections.sort(list);
        System.out.println("8. " + list);
    }
}
