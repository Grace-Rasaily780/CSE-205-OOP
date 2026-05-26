import java.util.Scanner;

public class NaturalNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = input.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i += 1;
        }

        System.out.println("The sum of natural number = " + sum);

        input.close();
    }
}
