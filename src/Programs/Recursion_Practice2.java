package Programs;

import java.util.*;

//Print all the subsets of a set of first n natural numbers
public class Recursion_Practice2 {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n == 0) {
            printSubset(subset);
            return;
        }
        // add
        subset.add(n);
        findSubset(n-1, subset);

        // no add
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}


//Invite people to a party, single or pairs
//public class Recursion_Practice2 {
//    public static int callGuests(int n){
//        if(n <= 1) {
//            return 1;
//        }
//
//        //Single
//        int ways1 = callGuests(n-1);
//
//        //Pair
//        int ways2 = (n-1) * callGuests(n-2);
//
//        return ways1 + ways2;
//    }
//    public static void main(String[] args) {
//        int n = 4;
//        System.out.println(callGuests(n));
//    }
//}

//Place Tiles of size 1xm in a floor of size nxm

//public class Recursion_Practice2 {
//    public static int placeTiles(int n, int m){
//        if(n == m) {
//            return 2;
//        }
//        if(n < m) {
//            return 1;
//        }
//
//        //vertically
//        int vertPlacements = placeTiles(n-m, m);
//
//        //horizontally
//        int horPlacements = placeTiles(n-1, m);
//
//        return vertPlacements + horPlacements;
//
//
//    }
//    public static void main(String[] args) {
//        int n = 4, m = 2;
//        System.out.println(placeTiles(n, m));
//    }
//}

// Count total paths in a maze to move from (0, 0) to (n, m)
//public class Recursion_Practice2 {
//    public static int countPath(int i, int j, int n, int m) {
//        if(i == n || j == m) {
//            return 0;
//        }
//        if(i == n-1 && j == m-1) {
//            return 1;
//        }
//
//        // move downwards
//        int downPaths = countPath(i+1, j, n, m);
//
//        //move upwards
//        int rightPaths = countPath(i, j+1, n, m);
//        return downPaths + rightPaths;
//    }
//    public static void main(String[] args) {
//        int n = 3, m = 3;
//        int totalPaths = countPath(0, 0, n, m);
//        System.out.println(totalPaths);
//    }
//}



// Permutation
//public class Recursion_Practice2 {
//    public static void printPem(String str, String permutation) {
//        if(str.length() == 0) { // if(str.isEmpty()) {___}
//            System.out.println(permutation);
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0, i) + str.substring(i+1);
//            printPem(newStr,permutation + currChar);
//        }
//    }
//    public static void main(String[] args) {
//        String str = "abc";
//        printPem(str, "");
//    }
//}
