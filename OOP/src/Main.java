class Main {
    static void main(String[] args) {
        Student student1 = new Student("Jack", 78);
        Student student2 = new Student("Rosa", 32);

        student1.assignGrade();
        System.out.println(student1.name + "'s grade is " + student1.grade);

        student2.assignGrade();
        System.out.println(student2.name + "'s grade is " + student2.grade);
    }
}