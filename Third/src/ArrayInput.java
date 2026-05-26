import java.util.Scanner;

public class ArrayInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number =  new int[4];

        System.out.println("Enter the elements:");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        System.out.println("Elements");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
