package OOPS.new1.OOPS_Students;

class Students{
    private String name;
    private int age;

    public Students(String name, int age) {
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
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void printInfo(){
        System.out.println("These are the common students");
    }
}

class UnderGraduate extends Students{

    public UnderGraduate(String name, int age) {
        super(name, age);
    }

    public void printInfo() {
        System.out.println(super.getName() + " is an Undergraduate student, age " + super.getAge());
    }
}

class Graduate extends Students{

    public Graduate(String name, int age) {
        super(name, age);
    }

    @Override
    public void printInfo() {
        System.out.println(super.getName() + " is a Graduate student, age " + super.getAge());
    }
}

class PartTimeStudents extends Students {

    public PartTimeStudents(String name, int age) {
        super(name, age);
    }

    public void printInfo() {
        System.out.println(super.getName() + " is a Part-Time student, age " + super.getAge());
    }
}

class FullTimeStudent extends Students {

    public FullTimeStudent(String name, int age) {
        super(name, age); // Calling parent class constructor
    }

    public void printInfo() {
        System.out.println(super.getName() + " is a Full-Time student, age " + super.getAge());
    }
}

public class MyStudents {
    public static void main(String[] args) {

        //Create objects
        UnderGraduate ugStudent = new UnderGraduate("Barun", 21);
        Graduate gStudent = new Graduate("Anubhav", 22);
        PartTimeStudents ptStudent = new PartTimeStudents("Miryam", 27);
        FullTimeStudent ftStudent = new FullTimeStudent("Kriti", 26);

        //Printing information
        ugStudent.printInfo();
        gStudent.printInfo();
        ptStudent.printInfo();
        ftStudent.printInfo();

        //Updating info using setters
        System.out.println("\nUpdating student information.....");
        ugStudent.setName("Shahasin");
        ugStudent.setAge(23);

        ptStudent.setAge(-5);
        ptStudent.setAge(28);

        //Printing updated information

        ugStudent.printInfo();
        ptStudent.printInfo();



    }
}
