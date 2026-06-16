import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int i = 0;
        int scoreNum = 0;
        int index = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        System.out.println("Enter the number of scores:");
        scoreNum = input.nextInt();

        while (i <= scoreNum) {
            index = i + 1;
            System.out.println("Enter the score in " + index + " Index");
            scores.add(input.nextInt());
            i++;
        }

        for (int score:scores) {
            if(score >= 90) {
                System.out.println("Distinction");
            } else if (score >= 40) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}