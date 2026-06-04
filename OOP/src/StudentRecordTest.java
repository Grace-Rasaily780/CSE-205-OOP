import java.util.Scanner;

public class StudentRecordTest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentRecord student = new StudentRecord();

        System.out.println("Enter the Student Info");
        System.out.println("Enter the full name:");
        String fullName = input.nextLine();

        System.out.println("Enter the Roll no:");
        String rollNo = input.nextLine();

        System.out.println("Enter the marks:");
        double marks = input.nextDouble();

        student.setStudentInfo(fullName, rollNo, marks);

        System.out.println(student.getStudentInfo());
    }
}
