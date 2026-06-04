public class BankAccount {
    double balance = 0.0;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + this.balance);
    }
}
