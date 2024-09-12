package OOPS.new1.BasicConcepts;  //Interface_abstraction --> Pure abstraction
  //Interface cannot have constructor

interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {

} // Multiple-inheritance

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class OOPS_Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}


//Abstraction

//abstract class OOPS.new1.basicConcepts.Animal {
//    abstract void walk();
//    OOPS.new1.basicConcepts.Animal() {
//        System.out.println("You are creating a new animal...");
//    }
//    public void eat() {
//        System.out.println("OOPS.new1.basicConcepts.Animal eats");
//    }
//}
//
//class OOPS.new1.basicConcepts.Horse extends OOPS.new1.basicConcepts.Animal {
//    OOPS.new1.basicConcepts.Horse() {
//        System.out.println("Created a OOPS.new1.basicConcepts.Horse");
//    }
//    public void walk() {
//        System.out.println("Walks on 4 legs");
//    }
//}
//
//class Kiwi extends OOPS.new1.basicConcepts.Animal {
//    public void walk() {
//        System.out.println("Walks on 2 legs");
//    }
//}
//
//public class OOPS.new1.basicConcepts.OOPS_Abstraction {
//    public static void main(String[] args) {
//        OOPS.new1.basicConcepts.Horse horse = new OOPS.new1.basicConcepts.Horse();
////        horse.walk();
////        horse.eat();
//    }
//}

  //Static --> common for class
//  class Stud{
//    String name;
//    static String school;
//
//    public static void changeSchool() {
//        school = "newschool";
//    }
//  }
//
//  public class OOPS.new1.basicConcepts.OOPS_Abstraction {
//      public static void main(String[] args) {
//          Stud.school = "JMV";
//          Stud student1 = new Stud();
//          student1.name = "Tony";
//          System.out.println(student1.school);
//      }
//  }
