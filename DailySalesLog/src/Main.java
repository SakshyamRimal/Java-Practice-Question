import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {


        double[] sales = {1020, 2000, 850, 700, 1195, 945, 850};


        try {
            // create 'weekly_sales.txt'
            FileWriter File = new FileWriter("weekly_sales.txt");


            BufferedWriter helper = new BufferedWriter(File);

            // Loop
            for (double TodaySale : sales) {

                helper.write(String.valueOf(TodaySale));
                helper.newLine();
            }


            helper.close();

            System.out.println("All sales were saved to weekly_sales.txt");

        } catch (Exception e) {

            System.out.println("We couldn't save the file.");
        }
    }
}