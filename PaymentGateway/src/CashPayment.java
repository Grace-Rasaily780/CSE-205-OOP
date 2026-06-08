public class CashPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing cash payment. No service fee applied.");
    }
}
