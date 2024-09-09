package OOPS.new1.Poly.Abstract.Encapsulation;

// Encapsulation
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Abstraction
abstract class Vehicle {
    abstract void start();

    public void fuel() {
        System.out.println("Refueling the vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

// Polymorphism -->Overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Polymorphism -->Overloading
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

final class Constants {
    public static final double PI = 3.14159;

    public final void showConstant() {
        System.out.println("Constant PI: " + PI);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Barun", 21);
        person.setAge(22);
        person.displayPersonInfo();

        Vehicle car = new Car();
        car.start();
        car.fuel();

        Calculator calculator = new Calculator();
        System.out.println("Sum (2 numbers): " + calculator.add(4, 12));
        System.out.println("Sum (3 numbers): " + calculator.add(3, 7, 15));

        Animal animal = new Dog();
        animal.makeSound();

        Constants constants = new Constants();
        constants.showConstant();
    }
}
