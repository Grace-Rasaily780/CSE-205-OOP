public class Pens {
    static void main(String[] args) {
        int penNumber = 14;
        int studentNumber = 3;

        int penPerStudent = penNumber / studentNumber;
        int remainingPen = penNumber % studentNumber;

        System.out.println("Pen Per Student: " + penPerStudent);
        System.out.println("Remaining Pen: " + remainingPen);
    }
}
