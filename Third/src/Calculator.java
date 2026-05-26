import java.util.Scanner;

public class Calculator {
    double sum (double a, double b) {
        return a + b;
    }
    double multiply (double a, double b) {
        return a * b;
    }
    double divide (double a, double b) {
        return a / b;
    }
    double subtract (double a, double b) {
        return a - b;
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println("Sum = " + calc.sum(a , b));
        System.out.println("Multiply = " + calc.multiply(a , b));
        System.out.println("Divide = " + calc.divide(a , b));
        System.out.println("Subtract = " + calc.subtract(a , b));
    }
}
