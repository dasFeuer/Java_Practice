package Programs;

class Helper {
    static int Multiply (int a , int b) {
        return a * b;
    }
    static double Multiply (double a , double b) {
        return a * b;
    }

}

public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(2, 7));
        System.out.println(Helper.Multiply(4.2, 7.9));
    }

}
