import java.util.Scanner;

public class BMI {
     static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight (KG):");
        double weight = input.nextDouble();

        System.out.println("Enter the height (Meter)");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("The BMI of the person is " + bmi);

        input.close();
    }
}
