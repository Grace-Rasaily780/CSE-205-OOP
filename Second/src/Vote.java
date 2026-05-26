import java.util.Scanner;

public class Vote {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Age:");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("The person can vote");
        }

        input.close();
    }
}
