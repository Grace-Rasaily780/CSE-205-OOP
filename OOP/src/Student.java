public class Student {
    String name;
    int score;
    char grade;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void assignGrade() {
        if (this.score >= 90) {
            this.grade = 'A';
        } else if (this.score >= 80) {
            this.grade = 'B';
        } else {
            this.grade = 'C';
        }
    }
}
