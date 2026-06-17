public class Main {
    public static void main(String[] args) {

        ElectronicDevice[] officeDevices = { new Printer(), new Scanner() };

        for (ElectronicDevice device : officeDevices) {

            device.powerOn();

        }
    }
}