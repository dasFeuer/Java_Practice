package OOPS.new1.Abstraction;

interface Car{
    void start();
    void accelerate();
    void stop();
    String getCarType();
}

abstract class Vehicle implements Car{
    private final String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public abstract void displayVehicleInfo();
}

class SUV extends Vehicle{
    public SUV (String brand){
        super(brand);
    }

    @Override
    public void start(){
        System.out.println(getBrand() + " SUV is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println(getBrand() + " SUV is accelerating.");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " SUV is stopping.");
    }

    @Override
    public String getCarType(){
        return "SUV";
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("This is an " + getCarType() + " made by " + getBrand());
    }
}

class Sedan extends Vehicle{

    public Sedan (String brand){
        super(brand);
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("This is a " + getCarType() + " made by " + getBrand());

    }

    @Override
    public void start() {
        System.out.println(getBrand() + " Sedan is starting.");

    }

    @Override
    public void accelerate() {
        System.out.println(getBrand() + " Sedan is accelerating.");

    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " Sedan is stopping.");

    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle suv = new SUV("Toyota");
        suv.start();
        suv.accelerate();
        suv.stop();
        suv.displayVehicleInfo();

        System.out.println("----------------------------");

        Vehicle sedan = new Sedan("Honda");
        sedan.start();
        sedan.accelerate();
        sedan.stop();
        sedan.displayVehicleInfo();
    }
}
