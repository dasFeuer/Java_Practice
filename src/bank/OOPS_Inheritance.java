package bank;

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area (int l, int h) {
        System.out.println(1/2*l*h); //Single level inheritance
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h); //Multi-level inheritance
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r); //Hierarchial inheritance
    }
}

public class OOPS_Inheritance {
    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name = "Customer10";
    }
}

//class bank.Shape {
//    String color;
//}
//
//class bank.Triangle extends bank.Shape {
//
//}
//
//public class bank.OOPS_Inheritance {
//    public static void main(String[] args) {
//        bank.Triangle t1 = new bank.Triangle();
//        t1.color = "Red";
//    }
//}
