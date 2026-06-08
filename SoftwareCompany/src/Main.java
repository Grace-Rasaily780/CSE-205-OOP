public class Main {
    static void main(String[] args) {
        Developer developer1 = new Developer("Grace Rasaily", 20000);

        developer1.printInfo();
        developer1.calculateBonus();

        Manager manager1 = new Manager("A random person", 60000);

        manager1.printInfo();
        manager1.calculateBonus();
    }
}