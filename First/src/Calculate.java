public class Calculate {
    static void main(String[] args) {
        double fee = 1536;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;

        double payablePrice = fee - discount;

        System.out.println("You have to pay " + payablePrice + " out of " + fee);
    }
}
