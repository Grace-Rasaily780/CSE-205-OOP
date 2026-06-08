abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateBonus();

    public void printInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
