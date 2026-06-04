public class CheckingAccount extends BankAccount {
    CheckingAccount (double initialBalance) {
        super(initialBalance);
    }

    @Override
    void deposit(double amount) {
        super.deposit(amount);
        System.out.println("This is a checking account");
        System.out.println(this.balance);
    }
}
