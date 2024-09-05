package OOPS;

class NsstMembers{
    String name;
    String position;
    int salary;

    public void printDetails(){
        System.out.println("The name is " + name);
        System.out.println("The position is " + position);
        System.out.println("The salary is " + salary);
    }
}
public class OOPS_Basics {

    public static void main(String[] args) {
        NsstMembers member = new NsstMembers();
        member.name = "Barun Panthi Sharma";
        member.position ="Team assistant";
        member.salary = 18325;


        member.printDetails();

        System.out.println();

        NsstMembers member2 = new NsstMembers();
        member2.name = "Anubhav Subba";
        member2.position = "Maketing assistant";
        member2.salary = 18325;

        member2.printDetails();



    }
}
