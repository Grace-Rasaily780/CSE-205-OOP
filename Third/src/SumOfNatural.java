import java.util.Scanner;

public class SumOfNatural {
    int sumNatural(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SumOfNatural sum = new SumOfNatural();

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int result = sum.sumNatural(n);

        System.out.println("Sum = " + result);
    }
}
