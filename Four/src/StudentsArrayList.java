import java.util.ArrayList;
import java.util.Scanner;

public class StudentsArrayList {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();
        ArrayList<Integer> rollNos = new ArrayList<>();

        System.out.println("No of Students?");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            input.nextLine();

            System.out.println("Enter the name: ");
            String name = input.nextLine();
            names.add(name);

            System.out.println("Enter the address: ");
            String address = input.nextLine();
            addresses.add(address);


            System.out.println("Enter the Roll No: ");
            int rollNo = input.nextInt();
            rollNos.add(rollNo);
        }

        System.out.println("Name\tAddress\tRoll No");
        for (int i = 0; i <= n; i++) {
            System.out.println(names.get(i) + "\t" + addresses.get(i) + "\t" + rollNos.get(i));
        }
    }
}
