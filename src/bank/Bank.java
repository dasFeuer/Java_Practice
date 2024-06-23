//Packages
package bank;
class Account {
    public String name;
    protected String email;
    private String password;

    //getters & setters

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Barun's Code";
        account1.email = "baruncode123@gmail.com";
        account1.setPassword("qwerty");
        System.out.println(account1.getPassword());
    }
}
