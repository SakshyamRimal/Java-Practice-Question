import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("config.txt");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            System.out.println("Config file found.");

        } catch (FileNotFoundException e) {

            System.out.println("Config file not found. Creating it");

            try {
                File file = new File("config.txt");
                file.createNewFile();
                System.out.println("Default config created.");
            } catch (IOException ex) {
                System.out.println("Error creating file.");
            }
        }
    }
}
