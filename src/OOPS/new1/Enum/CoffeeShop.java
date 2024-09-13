package OOPS.new1.Enum;

interface Coffee {
    double getPrice();
}

enum CoffeeSize implements Coffee {
    SMALL(2.5) {
        @Override
        public double getPrice() {
            return basePrice;
        }
    },
    MEDIUM(3.0) {
        @Override
        public double getPrice() {
            return basePrice + 0.5;
        }
    },
    LARGE(3.5) {
        @Override
        public double getPrice() {
            return basePrice + 1.0;
        }
    };

    protected final double basePrice;

    CoffeeSize(double basePrice) {
        this.basePrice = basePrice;
    }
}

class CoffeeOrder {
    private final CoffeeSize coffeeSize;

    public CoffeeOrder(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public void printOrderDetails() {
        System.out.println("Your order is: " + coffeeSize);
        System.out.println("Price: $" + coffeeSize.getPrice());
    }
}

    public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeOrder smallOrder = new CoffeeOrder(CoffeeSize.SMALL);
        CoffeeOrder mediumOrder = new CoffeeOrder(CoffeeSize.MEDIUM);
        CoffeeOrder largeOrder = new CoffeeOrder(CoffeeSize.LARGE);

        smallOrder.printOrderDetails();
        mediumOrder.printOrderDetails();
        largeOrder.printOrderDetails();
    }
}
