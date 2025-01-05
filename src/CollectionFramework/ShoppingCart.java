package CollectionFramework;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("%s: $%.2f", name, price);
    }
}
public class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addToCart(Product product) {
        items.add(product);
        System.out.println("Added to cart: " + product);
    }

    public void removeFromCart(int index) {
        if (index >= 0 && index < items.size()) {
            System.out.println("Removed from cart: " + items.get(index));
            items.remove(index);
        }
    }


    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("\nShopping Cart Contents: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i));
        }
        System.out.printf("Total: $%.2f%n", calculateTotal());
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addToCart(new Product("Computer", 989.99));
        cart.addToCart(new Product("PS5", 530.99));
        cart.addToCart(new Product("Camera", 500.99));

        cart.displayCart();

        cart.removeFromCart(1);

        cart.displayCart();
    }
}

