public class Recursion_Practice1 {
    public static void towerofHanoi(int n, String src, String helper, String destination){
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            return;
        }
        towerofHanoi(n-1, src, destination, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
        towerofHanoi(n-1, helper, src, destination);
    }
    public static void main(String[] args) {
         int n = 3;
         towerofHanoi(n, "S", "H", "D");
    }
}
