public class Main {

    public static void main(String[] args) {

        // Create account
        BankAccount myAccount = new BankAccount(500.0);

        System.out.println("Starting Balance: $" + myAccount.getBalance());

        // Negative number
        System.out.println("\nAttempting to withdraw -$22");
        myAccount.withdraw(-22.0);

        // Too much money
        System.out.println("\nAttempting to withdraw $650");
        myAccount.withdraw(650.0);

        // Valid withdrawal
        System.out.println("\nAttempting to withdraw $140");
        myAccount.withdraw(140.0);

        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
