class MyEmployee {
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i) {
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

class MyStudent {
    private int id;
    private String name;

    public MyStudent(){
        id = 45;
        name = "Jack";
    }

    public MyStudent(String myName, int myId ){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i) {
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class OOPS_Practice {
    public static void main(String[] args) {
        MyEmployee barun = new MyEmployee();
//      barun.id = 011;
//      barun.name = "Barun Panthi Sharma"; --> Throws an error due to private access modifier

        barun.setName("Barun Panthi Sharma");
        System.out.println(barun.getName());

        barun.setId(11);
        System.out.println(barun.getId());

        System.out.println("----------------------------");

        MyStudent jack = new MyStudent("Barun Panthi Sharma", 11);
        System.out.println(jack.getId());
        System.out.println(jack.getName());

    }
}
