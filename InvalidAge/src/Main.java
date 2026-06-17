public class Main {
    public static void main(String[] args) {

        int userAge = 20; // Let's pretend a 16-year-old is trying to vote

        try {

            VotingSystem.checkEligibility(userAge);
        } catch (InvalidAgeException e) {

            System.out.println("You must be 18 to vote.");
        }

    }

}