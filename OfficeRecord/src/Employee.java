public class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println(this.name + " is " + this.age + " old, with salary " + this.salary);
    }
}
