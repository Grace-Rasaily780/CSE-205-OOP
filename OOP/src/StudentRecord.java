public class StudentRecord {
    private String fullName;
    private String rollNo;
    private double marks;

    public void setStudentInfo(String fullName, String rollNo, double marks) {
        this.fullName = fullName;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getStudentInfo() {
        return "Full Name: " + this.fullName + " Roll No: " + this.rollNo + " Marks: " + this.marks;
    }
}
