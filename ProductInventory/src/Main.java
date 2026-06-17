public class Main {

    public static void main(String[] args) {

        // Create our array

        Electronics[] inventory = {
                new Electronics("Laptop", 147000.0),
                new Electronics("phone", 52000.0)
        };

        System.out.println("Sale: 10% OFF EVERYTHING!");

        // Loop
        for (Electronics e : inventory) {

            e.applyDiscount(10.0);

        }
    }
}
