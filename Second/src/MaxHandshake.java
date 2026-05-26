import java.util.Scanner;

public class MaxHandshake {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Total number of Students");
        int n = input.nextInt();

        int c = (n * (n - 1)) / 2;

        System.out.println("THe Maximum number of possible handshakes is " + c);
    }
}
