import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle");
        int principle = input.nextInt();

        System.out.println("Enter the Rate");
        int rate = input.nextInt();

        System.out.println("Enter the time");
        int time = input.nextInt();

        int si = (principle * time * rate) / 100;

        System.out.println("The Simple Interest is " + si);

        input.close();
    }
}
