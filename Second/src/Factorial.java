import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();
        int fact = 1;
        int i = 1;

        while(i <= n){
            fact = fact * i;
            i += 1;
        }

        System.out.println("The factorial is " + fact);

        input.close();
    }
}
