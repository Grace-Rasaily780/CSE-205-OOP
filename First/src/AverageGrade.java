import java.util.Scanner;

public class AverageGrade {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the GPA of Science");
        double science = input.nextDouble();

        System.out.println("Enter the GPA of Maths");
        double maths = input.nextDouble();

        System.out.println("Enter the GPA of English");
        double english = input.nextDouble();

        double average = (science + maths + english) / 3;

        System.out.println("The Average GPA is " + average);

        input.close();
    }
}
