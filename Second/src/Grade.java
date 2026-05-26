import java.util.Scanner;

public class Grade {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks for Subject 1:");
        int m1 = input.nextInt();

        System.out.println("Enter the marks for Subject 2:");
        int m2 = input.nextInt();

        System.out.println("Enter the marks for Subject 3:");
        int m3 = input.nextInt();

        System.out.println("Enter the marks for Subject 4:");
        int m4 = input.nextInt();

        System.out.println("Enter the marks for Subject 5:");
        int m5 = input.nextInt();

        int tot = m1 + m2 + m3 + m4 + m5;

        int per = tot / 5;

        System.out.println("Total Marks = " + tot);
        System.out.println("Percentage = " + per);

        if (per >= 90) {
            System.out.println("Grade A");
        } else if (per >= 80 ) {
            System.out.println("Grade B");
        } else if (per >= 70 ) {
            System.out.println("Grade C");
        } else if (per >= 60) {
            System.out.println("Grade D");
        } else if (per >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

        input.close();
    }
}
