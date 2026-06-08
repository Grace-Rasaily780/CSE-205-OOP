import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            books[i] = new Book();

            System.out.println("Enter the book title:");
            String title = input.nextLine();
            books[i].setTitle(title);

            System.out.println("Title fo the book:");
            System.out.println(books[i].getTitle());
        }
    }
}