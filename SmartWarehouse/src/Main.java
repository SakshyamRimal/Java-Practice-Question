public class Main {

    public static void main(String[] args) {


        ColdBox FridgeBox = new ColdBox(5, 300);


        System.out.println("Created Box ID: " + FridgeBox.id);
        System.out.println("Capacity: " + FridgeBox.capacity);


        FridgeBox.adjustTemp(-18);
        FridgeBox.adjustTemp(-22);
    }
}