public class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void calculateBonus() {
        double bonus = this.salary * 0.10;
        System.out.println("The bonus: " + bonus);
    }
}
