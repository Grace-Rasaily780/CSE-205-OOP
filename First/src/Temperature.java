import java.util.Scanner;

public class Temperature {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius");
        double c = input.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("The Temperature in Fahrenheit is " + f);
    }
}
