package OOPS;

class NsstMembers{
    String name;
    String position;
    int salary;

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    public void printDetails(){
        System.out.println("The name is " + name);
        System.out.println("The position is " + position);
        System.out.println("The salary is " + salary);


    }

    NsstMembers (String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
public class OOPS_Basics {

    public static void main(String[] args) {
        NsstMembers member = new NsstMembers("Barun Panthi Sharma", "Team-Assistant", 18350 );
//        member.name = "Barun Panthi Sharma";
//        member.position ="Team assistant";
//        member.salary = 18325;


        member.greeting();
        member.printDetails();

        System.out.println();

        NsstMembers member2 = new NsstMembers("Anubhav Subba", "Maketing assistant", 18325);
//        member2.name = "Anubhav Subba";
//        member2.position = "Maketing assistant";
//        member2.salary = 18325;

        member2.greeting();
        member2.printDetails();



    }
}
