public class Recursion1 {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1; //base case 1
        }
        if (x == 0) {
            return 0; //base case 2
        }
        //If n is even.
        if (n % 2  == 0) {
            return calcPower(x,n/2) * calcPower(x, n/2);
        } else { // n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x ,n);
        System.out.println(ans);
    }
}

//public class Recursion1 {
//    public static int calcPower(int x, int n) {
//        if (n == 0) {
//            return 1; //base case 1
//        }
//        if (x == 0) {
//            return 0; //base case 2
//        }
//        int xPownm1 = calcPower(x, n-1); // work
//        int xPown = x * xPownm1;
//        return xPown;
//    }
//    public static void main(String[] args) {
//        int x = 2, n = 5;
//        int ans = calcPower(x ,n);
//        System.out.println(ans);
//    }
//}

//public class Recursion1 {
//    public static void printfib(int a, int b, int n) {
//        if (n == 0){
//            return;
//        }
//        int c = a + b;
//        System.out.println(c);
//        printfib(b, c, n-1);
//    }
//    public static void main(String[] args) {
//      int a = 0, b =1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printfib(a, b, n-2);
//    }
//}

//public class Recursion1 {
//    public static int calcfactorial(int n) {
//        if (n == 1 || n == 0){
//            return  1;
//        }
//        int fact_nm1 = calcfactorial(n-1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        int ans = calcfactorial(n);
//        System.out.println(ans); // Factorial n = 5 --> 5 X 4 X 3 X 2 X 1 X 0 = 120
//    }
//}


//public class Recursion1 {
//    public static void printSum(int i, int n, int sum) {
//        if (i == n) {
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1, n, sum);
////        System.out.println(i);
//    }
//    public static void main(String[] args) {
//        printSum(1, 5, 0); // Print sum of first n natural numbers
//    }
//}


//public class Recursion1 {
//    public static void printNumber(int n) {
//        if (n == 6){
//            return;
//        }
//        System.out.println(n);
//        printNumber(n+1);
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        printNumber(n); // Print 1 to 5
//    }
//}


//public class Recursion1 {
//    public static void printNumber(int n) {
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNumber(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        printNumber(n); //n = 5 // Print 0 to 5
//    }
//}
