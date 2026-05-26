public class Greet {
    void greet() {
        System.out.println("Hello");
        System.out.println("How do you do?");
    }
    static void main(String[] args) {
        Greet obj = new Greet();

        obj.greet();

        System.out.println("Between two method call");

        obj.greet();
    }
}
