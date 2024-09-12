package OOPS.new1.BasicConcepts;

class Base {

    Base(){
        System.out.println("I am a base constructor");
    }
    Base(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
//    int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        System.out.println("I am in base and setting x now.");
//        this.x = x;
//    }
//
//    public void printMe() {
//        System.out.println("I am a constructor");
//    }
}

class Derived extends Base {
    Derived(){
//        super(0);
        System.out.println("I am a derived constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor with value of y as: " + y);
    }
//    int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of derived with value of z as: " + z);
    }
}

public class OOPS_Inheritance {
    public static void main(String[] args) {
        // OOPS.new1.basicConcepts.Base class
        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());

        // OOPS.new1.basicConcepts.Derived class
        Derived d = new Derived(14, 9);
//        d.setX(43);
//        System.out.println(d.getX());

        ChildOfDerived cd = new ChildOfDerived(12, 14, 15 );
    }
}
