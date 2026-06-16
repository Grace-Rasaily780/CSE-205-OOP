import java.util.Scanner;

public class ArrayError {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int[] arr = {10, 20, 30};

            System.out.println("Enter an index: ");
            int index = input.nextInt();

            System.out.println("The element is " + arr[index]);
        } catch (Exception e) {
            System.out.println("The index doesn't exists in the array");
        }

        input.close();
    }
}