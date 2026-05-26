// Grace Rasaily - 116236
import java.util.Scanner;

public class Person {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your address");
        String address = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Name\tAddress\tAge");
        System.out.println(name+"\t"+address+"\t"+age);

        input.close();
    }
}
