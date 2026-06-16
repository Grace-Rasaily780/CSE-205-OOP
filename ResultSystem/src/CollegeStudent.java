import java.util.Scanner;

public class CollegeStudent implements Result {
    Scanner input = new Scanner(System.in);
    String name;
    int[] marks = new int[5];
    int total = 0;

    public void getMarks() {
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of subject " + i);
            marks[i] = input.nextInt();
            total += marks[i];
        }
    }

    public void getName() {
        System.out.println("Enter the name: ");
        this.name = input.nextLine();
    }

    public void calculateResult() {
        int average = total / 5;
        String result;
        if(average >= 50) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        System.out.println("Name: " + this.name + " Total Marks: " + this.total + " Result: " + result);
    }
}
