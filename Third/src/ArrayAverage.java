import java.util.Scanner;

public class ArrayAverage {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Enter the elements");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double total = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        double average = total / 4;

        System.out.println("Average = "+ average);
    }
}
