import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> errorList = new ArrayList<>();

        System.out.println("The server log for errors");


        try {

            File logFile = new File("server.log");

            Scanner input = new Scanner(logFile);

            //  Loop
            while (input.hasNextLine()) {

                String currentLine = input.nextLine();

                if (currentLine.contains("ERROR")) {

                    errorList.add(currentLine);

                }
            }

            input.close();


            System.out.println("We found " + errorList.size() + " errors:");


            for (String savedError : errorList) {
                System.out.println(savedError);
            }

        }
        catch (FileNotFoundException e) {

            System.out.println("Could not find the file 'server.log'!");
        }
    }
}