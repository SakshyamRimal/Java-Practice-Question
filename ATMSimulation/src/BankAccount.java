public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double startingMoney) {
        this.balance = startingMoney;
    }


    public double getBalance() {
        return this.balance;
    }

    // Withdraw
    public void withdraw(double amount) {

        // amount is positive and not
        if (amount > 0 && amount <= this.balance) {

            this.balance = this.balance - amount;
            System.out.println("Success Withdrawn $" + amount);

        } else {

            System.out.println("Invalid amount or insufficient funds.");

        }
    }
}
