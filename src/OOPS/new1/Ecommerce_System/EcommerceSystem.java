package OOPS.new1.Ecommerce_System;

class User {
    private final String username;
    private final String password;

    protected double discount;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.discount = 0.0;
    }

    public boolean login(String inputUsername, String inputPassword){
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    public void displayUserType(){
        System.out.println("General User.");
    }

    public double getDiscount() {
        return this.discount;
    }
}

class PremiumUser extends User{
    private final double premiumDiscount;

    public PremiumUser(String username, String password) {
        super(username, password);
        this.premiumDiscount = 15.0;
    }

    @Override
    public void displayUserType() {
        System.out.println("Premium User.");
    }

    @Override
    public double getDiscount() {
        return super.getDiscount() + this.premiumDiscount;
    }
}
public class EcommerceSystem {
    public static void main(String[] args) {
        User generalUser = new User("barun0101", "1010password");

        PremiumUser premiumUser = new PremiumUser("computer1101", "0111computer");


        if (generalUser.login("barun0101", "1010password")){
            generalUser.displayUserType();
            System.out.println("Discount: " + generalUser.getDiscount() + "%");
        }

        if (premiumUser.login("computer1101", "0111computer")){
            premiumUser.displayUserType();
            System.out.println("Discount: " + premiumUser.getDiscount() + "%");
        }
    }
}
