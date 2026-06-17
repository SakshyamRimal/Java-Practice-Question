public class VotingSystem {

    static void checkEligibility(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("You must be 18 to vote.");
        }

        System.out.println("You are eligible to vote.");
    }
}