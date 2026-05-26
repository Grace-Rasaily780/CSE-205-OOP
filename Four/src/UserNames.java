import java.util.ArrayList;
import java.util.Scanner;

public class UserNames {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter the First name: ");
        String name1 = input.nextLine();

        System.out.println("Enter the Second name: ");
        String name2 = input.nextLine();

        names.add(name1);
        names.add(name2);

        System.out.println(names);

        input.close();
    }
}
