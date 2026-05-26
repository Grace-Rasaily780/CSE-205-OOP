import java.util.Scanner;

public class Loan {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Credit Score:");
        int cs = input.nextInt();

        System.out.println("Enter the Annual Income:");
        double ai = input.nextDouble();

        if (cs > 700 && ai > 6000.00) {
            System.out.println("The applicant is eligable for the loan");
        } else {
            System.out.println("The applicant is not eligable for the loan");
        }
    }
}
