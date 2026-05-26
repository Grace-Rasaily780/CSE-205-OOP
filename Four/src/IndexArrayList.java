import java.util.ArrayList;
import java.util.Scanner;

public class IndexArrayList {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Harry");

        System.out.println("Enter a new name: ");
        String name1 = input.nextLine();

        names.add(1, name1);

        System.out.println(names);

        input.close();
    }
}
