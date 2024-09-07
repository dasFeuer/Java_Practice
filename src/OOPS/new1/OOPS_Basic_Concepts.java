package OOPS.new1;

class Employee {
    String name;
    int salary;
    int id;

    public void printDetails(){
        System.out.println("The id is " + id);
        System.out.println("The name is " + name);
    }
    public int getSalary() {
        return salary;
    }
}

class Students {
    String name;
    int classLevel;
    int age;
    char section;
    int rollNo;

    public void stdDetails(){
        System.out.println("The name is " + name);
        System.out.println("The class level is " + classLevel);
        System.out.println("The age is " + age);
        System.out.println("The section is " + section);
    }
    public int getRollNo(){
        return rollNo;
    }
}

public class OOPS_Basic_Concepts {
    public static void main(String[] args) {

        Employee barun = new Employee();
        Employee john = new Employee();

        barun.id = 230729;
        barun.name = "JavaCoder";
        barun.salary = 18350;

        john.id = 240725;
        john.name = "John X";
        john.salary = 16350;

//        System.out.println(barun.id);
//        System.out.println(barun.name);

        barun.printDetails();
        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);

        System.out.println("------NEW  CLASS-----");

        Students alex = new Students();
        Students rock = new Students();
        Students jack = new Students();
        Students tony = new Students();

        alex.name = "Alex X";
        alex.age = 19;
        alex.classLevel = 9;
        alex.section = 'A';
        alex.rollNo = 11;

        rock.name = "Rock Y";
        rock.age = 20;
        rock.classLevel = 10;
        rock.section = 'B';
        rock.rollNo = 14;

        jack.name = "Jack Z";
        jack.age = 21;
        jack.classLevel = 11;
        jack.section = 'C';
        jack.rollNo = 27;

        tony.name = "Tony S";
        tony.age = 22;
        tony.classLevel = 12;
        tony.section = 'D';
        tony.rollNo = 38;

        System.out.println();
        alex.stdDetails();
        System.out.println();
        rock.stdDetails();
        System.out.println();
        jack.stdDetails();
        System.out.println();
        tony.stdDetails();

        System.out.println();
        int rollNo = alex.getRollNo();
        System.out.println(alex.name + " roll number is " + rollNo);

        System.out.println();
        int rollNo1 = rock.getRollNo();
        System.out.println(rock.name + " roll number is " + rollNo1);

        System.out.println();
        int rollNo2 = jack.getRollNo();
        System.out.println(jack.name + " roll number is " + rollNo2);

        System.out.println();
        int rollNo3 = tony.getRollNo();
        System.out.println(tony.name + " roll number is " + rollNo3);
    }
}
