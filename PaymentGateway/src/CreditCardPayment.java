public class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        double serviceFee = amount * 0.2;
        double total = amount + serviceFee;
        System.out.println("Total: " + total);
    }
}
