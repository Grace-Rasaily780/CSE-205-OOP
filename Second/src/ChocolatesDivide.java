import java.util.Scanner;

public class ChocolatesDivide {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Chocolates");
        int chocolates = input.nextInt();

        System.out.println("Enter the number of Children");
        int children = input.nextInt();

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child will get " + eachChild);
        System.out.println(remaining + " will remain");

        input.close();
    }
}
