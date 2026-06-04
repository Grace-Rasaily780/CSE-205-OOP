import java.util.Scanner;

public class Person {
    String name;
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person1 = new Person();
        System.out.println("Enter a name: ");
        person1.name = input.nextLine();

        Person person2 = new Person();
        System.out.println("Enter a name: ");
        person2.name = input.nextLine();

        System.out.println("Name: " + person1.name);
        System.out.println("Name: " + person2.name);
    }
}
