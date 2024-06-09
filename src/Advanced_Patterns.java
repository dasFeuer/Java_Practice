public class Advanced_Patterns {
    public static void main(String[] args) {
//        int n = 5;
//
//        //Butterfly Patterns
//        //Upper half
//        for (int i=1; i<=n; i++){
//            //1st part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            //Spaces
//            int spaces = 2 * (n-i);
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            //2nd part
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //Lower half
//        for (int i=n; i>=1; i--){
//            //1st part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            //Spaces
//            int spaces = 2 * (n-i);
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            //2nd part
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //Solid Rhombus
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            //spaces
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            //stars
//            for (int j = 1; j <= 5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //Number Pyramid
//        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            //spaces
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            //Numbers -> Print row numbers, row numbers times
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        //Palindromic Pattern
//        int n = 5;
//        for (int i=1; i<=n; i++){
//            //spaces
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            //1st half numbers
//            for (int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            //2nd half numbers
//            for (int j = 2; j <= i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Diamond Pattern
        //Upper half
        int n = 4;
        for (int i = 1; i <= n ; i++) {
            //spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = n; i >= 1 ; i--) {
            //spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
