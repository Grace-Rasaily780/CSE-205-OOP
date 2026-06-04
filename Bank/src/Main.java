public class Main {
    static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(10000);
        CheckingAccount transactions = new CheckingAccount(20000);

        savings.deposit(10000.00);
        savings.displayBalance();
        transactions.deposit(30000);
        transactions.displayBalance();
    }
}