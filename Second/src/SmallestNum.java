import java.util.Scanner;

public class SmallestNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = input.nextInt();

        System.out.println("Enter second number:");
        int n2 = input.nextInt();

        System.out.println("Enter third number:");
        int n3 = input.nextInt();

        if (n3 < n2 && n3 < n1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
