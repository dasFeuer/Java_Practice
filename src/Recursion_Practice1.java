//Print keypad combination
public class Recursion_Practice1 {
    public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static  void printCombination(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.print(combination);
            return;
        }
        char currChar = str. charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx+1, combination+mapping.charAt(i));

        }
    }
    public static void main(String[] args) {
        String str = "4";
        printCombination(str, 0, "");
    }
}



// No repeat subsequence
//import java.util.HashSet;
//
//public class Recursion_Practice1 {
//    public static void NoRepeatSubSequences(String str, int idx, String newString, HashSet<String> set){
//        if(idx == str.length()){
//            if(set.contains(newString)) {
//                return;
//            } else  {
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//        }
//        char currChar = str.charAt(idx);
//
//        //to be
//        NoRepeatSubSequences(str, idx+1, newString+currChar, set);
//
//        //not to be
//        NoRepeatSubSequences(str, idx+1, newString, set);
//
//    }
//    public static void main(String[] args) {
//        String str = "aaa";
//        HashSet<String> set = new HashSet<>();
//        NoRepeatSubSequences(str, 0, "", set);
//    }
//}



//Subsequence
//public class Recursion_Practice1 {
//    public static void subSequences(String str, int idx, String newString){
//        if(idx == str.length()) {
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//
//        //to be
//        subSequences(str, idx+1, newString+currChar);
//
//        //not to be
//        subSequences(str, idx+1, newString);
//
//    }
//    public static void main(String[] args) {
//        String str = "abc";
//        subSequences(str, 0, "");
//
//    }
//}

//Remove Duplicates
//public class Recursion_Practice1 {
//    public static boolean [] map = new boolean[26];
//
//    public static void removeDuplicates(String str, int idx, String newString){
//        if(idx == str.length()) {
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(map[currChar - 'a']) {
//            removeDuplicates(str, idx+1, newString);
//        } else {
//            newString += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicates(str, idx+1, newString);
//        }
//    }
//    public static void main(String[] args) {
//        String str = "abbccda";
//        removeDuplicates(str, 0, "");
//    }
//}


// Moving all x at the end
//public class Recursion_Practice1 {
//    public static void moveAllX(String str, int idx,  int count, String newString) {
//        if(idx == str.length()) {
//            for (int i = 0; i < count; i++) {
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar == 'x') {
//            count++;
//            moveAllX(str, idx+1, count, newString);
//        } else {
//            newString += currChar;
//            moveAllX(str, idx+1, count, newString);
//        }
//    }
//    public static void main(String[] args) {
//     String str = "axbcxxd";
//     moveAllX(str, 0, 0, "");
//    }
//}

//public class Recursion_Practice1 {
//    public static boolean isSorted(int [] arr, int index){
//        if(index == arr.length-1){
//            return true;
//        }
//        if(arr [index] >=  arr [index+1]) {
//            //array is unsorted.
//            return false;
//        }
//        return  isSorted(arr, index+1);
//    }
//    public static void main(String[] args) {
//        int [] arr = {1, 3, 3};
//        System.out.println(isSorted(arr, 0));
//    }
//}

//public class Recursion_Practice1 {
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void findOccurance(String str, int index, char element){
//        if(index == str.length()) {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//
//        char currChar = str.charAt(index);
//        if (currChar == element) {
//            if(first == -1) {
//                first = index;
//            } else {
//                last = index;
//            }
//        }
//        findOccurance(str, index+1, element);
//    }
//    public static void main(String[] args) {
//        String str = "abaacdaefaah";
//        findOccurance(str, 0, 'a');
//    }
//}

//Reverse String
//public class Recursion_Practice1 {
//    public static void printReverse( String str, int index){
//        if(index == 0){
//            System.out.println(str.charAt(index));
//            return;
//        }
//        System.out.print(str.charAt(index));
//        printReverse(str, index-1);
//    }
//    public static void main(String[] args) {
//        String str = "dcba";
//        printReverse(str, str.length()-1);
//    }
//}


//public class Recursion_Practice1 {
//    public static void towerofHanoi(int n, String src, String helper, String destination){
//        if(n == 1) {
//            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
//            return;
//        }
//        towerofHanoi(n-1, src, destination, helper);
//        System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
//        towerofHanoi(n-1, helper, src, destination);
//    }
//    public static void main(String[] args) {
//         int n = 3;
//         towerofHanoi(n, "S", "H", "D");
//    }
//}
