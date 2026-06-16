import java.util.Scanner;

public class TryCatch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter numerator: ");
            int numerator = input.nextInt();
            System.out.println("Enter denominator");
            int denominator = input.nextInt();

            int result = numerator / denominator;

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Denominator cannot be 0. Try again.");
        }
    }
}
