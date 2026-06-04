import java.util.Scanner;

public class TriangleTest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        int base = input.nextInt();

        System.out.println("Enter the height of the triangle: ");
        int height = input.nextInt();

        Triangle newTriangle = new Triangle(base, height);

        System.out.println(newTriangle.calculateArea());

        input.close();
    }
}
