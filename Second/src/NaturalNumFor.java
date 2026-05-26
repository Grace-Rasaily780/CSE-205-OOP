import java.util.Scanner;

public class NaturalNumFor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of Natural Number is " + sum);

        input.close();
    }
}
