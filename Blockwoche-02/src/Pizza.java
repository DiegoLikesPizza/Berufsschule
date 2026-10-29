public class Pizza {

    static double basePrice = 5.5;
    static double toppingPrice = 0.75;

    public static void main (String[] args) {

        System.out.println("Pizza price with 1 topping: " + calcprice(1));
        System.out.println("Pizza price with 5 toppings: " + calcprice(5));
        System.out.println("Pizza price with 23 toppings: " + calcprice(23));
    }

    static double calcprice(int amountToppings) {
        return basePrice + toppingPrice * amountToppings;
    }
}
