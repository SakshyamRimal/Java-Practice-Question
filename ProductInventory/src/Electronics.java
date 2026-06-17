public class Electronics implements Discountable {

    String name;
    double price;

    // Constructor
    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percent) {

        // Calculate
        double discountAmount = this.price * (percent / 100);

        this.price = this.price - discountAmount;

        System.out.println(name + " is now on sale for $" + this.price);
    }
}