public class Recursion_Practice1 {
    public static boolean isSorted(int [] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr [index] >=  arr [index+1]) {
            //array is unsorted.
            return false;
        }
        return  isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 3};
        System.out.println(isSorted(arr, 0));
    }
}

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
