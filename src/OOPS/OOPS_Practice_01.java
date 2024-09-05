package OOPS;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        // Das Volumen eines Zylinders ist π r2 h, und seine Oberfläche ist 2π r h + 2π r 2.
    }

    public double volume() {
        return Math.PI * radius * radius * height;
        // Das Volumen eines Zylinders ist π r2 h
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class OOPS_Practice_01 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(9, 12);
//        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println("Height: " + h);

//        myCylinder.setRadius(9);
        System.out.println("Radius: " + myCylinder.getRadius());


        System.out.println("-----------------------\n");

        System.out.println("Surface area: " + myCylinder.surfaceArea());
        System.out.println("Volume: " + myCylinder.volume());

        System.out.println("-----------------------\n");

        Rectangle rec = new Rectangle(15, 58);
        System.out.println("Length: " + rec.getLength());
        System.out.println("Breadth: " + rec.getBreadth());
    }
}
