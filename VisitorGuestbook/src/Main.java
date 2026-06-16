import java.io.*;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            FileWriter guestbook = new FileWriter("guestbook.txt", true);

            System.out.println("Enter the name of the guest:");
            String guest = input.nextLine();

            guestbook.write(guest + '\n');
            guestbook.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}