import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new FullTime());
        staff.add(new Contractor());

        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("payroll_report.txt"));

            for (Employee e : staff) {
                writer.write("Pay: $" + e.calculatePay());
                writer.newLine();
            }

            writer.close();
            System.out.println("Report saved.");

        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}
