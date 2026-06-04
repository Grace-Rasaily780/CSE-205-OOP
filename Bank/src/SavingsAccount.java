public class SavingsAccount extends BankAccount {
    private double interestRate = 0.03;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void deposit(double amount) {
        double interest = amount * interestRate;
        this.balance += amount + interest;
        System.out.println(amount + " deposited with " + interest + " interest");
    }
}
