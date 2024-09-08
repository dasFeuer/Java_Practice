package OOPS.new1.OOPS_Animal;

class Animal{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
      System.out.println(super.getName() + " says: Woof Woof!");
//      super.sound(); // --> Prints "Animal Sound"
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
      System.out.println(super.getName() + " says: Meow Meow!");

//      super.sound(); // --> Prints "Animal Sound"
    }
}
public class Main {
    public static void main(String[] args) {

        Dog hund = new Dog("Bruno");
        Cat katze = new Cat("Suri");

        hund.sound();
        katze.sound();
    }
}
