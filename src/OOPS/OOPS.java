package OOPS;// OOPS.OOPS --> Polymorphism Concept

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name:" + " " + name + " " + "and" + " " + "Age:" + " " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Barun";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);
    }
}


//class OOPS.Student {
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
////    OOPS.Student() {
////        System.out.println("Constructor called!");
////    } // Java make automatically non-parameterise --> CONSTRUCTOR
//
//    //Parameterise Constructor should have to made by one if needed.
////    OOPS.Student(String name, int age) {
////        this.name = name;
////        this.age = age;
////    }
//
//    //Copy Constructor
//    OOPS.Student(OOPS.Student s2) {
//        this.name = s2.name;
//        this.age = s2.age;
//    }
//    OOPS.Student(){
//
//    }// s1 constructor should be defined because it wouldn't be defined by default.
//}
//
//public class OOPS.OOPS {
//    public static void main(String[] args) {
//        OOPS.Student s1 = new OOPS.Student();
//        s1.name = "Barun";
//        s1.age = 21;
//
//        OOPS.Student s2 = new OOPS.Student(s1);
//        s2.printInfo();
//
////        OOPS.Student s1 = new OOPS.Student("Barun", 21);
////        s1.name = "Barun";
////        s1.age = 21;
//
////        s1.printInfo();
//    }
//}


//class Pen{
//    String color;
//    String type; //ballpoint: gel
//
//    public void write() {
//        System.out.println("Writing something...");
//    }
//    public void printColor(){
//        System.out.println(this.color);
//    }
//}

//public class OOPS.OOPS {
//    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        pen1.color = "Yellow";
//        pen1.type = "Gel";
//
//        pen1.write();
//
//        Pen pen2 = new Pen();
//        pen2.color = "Green";
//        pen2.type = "Ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();
//    }
//}


