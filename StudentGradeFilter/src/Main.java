import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();  // ArrayList


        scores.add(93);
        scores.add(30);
        scores.add(37);
        scores.add(54);
        scores.add(86);

        for (int score : scores) {

            // for-each loop
            if (score >= 80) {   // 80 or above
                System.out.println("Score " + score + ": Distinction");
            }

            else if (score >= 40) { // // 40 or above
                System.out.println("Score " + score + ": Pass");
            }

            else { // fail
                System.out.println("Score " + score + ": Fail");
            }
        }
    }

}
