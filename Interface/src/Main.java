import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dog dog = new Dog();

        dog.play();
        dog.makeSound();

        System.out.println("Enter the length");
        int length = input.nextInt();

        System.out.println("Enter the breadth");
        int breadth = input.nextInt();

        Rectangle rectangle1 = new Rectangle();

        System.out.println("Area of rectangle: " + rectangle1.getArea(length, breadth));
    }
}