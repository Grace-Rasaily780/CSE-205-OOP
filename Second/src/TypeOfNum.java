import java.util.Scanner;

public class TypeOfNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("The Number is positive");
        } else if (num < 0) {
            System.out.println("The Number is negative");
        } else {
            System.out.println("The Number is Zero");
        }

        input.close();
    }
}
