public class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void calculateBonus() {
        double bonus = this.salary * 0.20;
        System.out.println("The bonus: " + bonus);
    }
}
