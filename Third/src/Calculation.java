public class Calculation {
    void multiply (int a, int b) {
        int result = a * b;
        System.out.println("The multiplication is: " + result);
    }

    static void main(String[] args) {
        Calculation math = new Calculation();

        math.multiply(4, 5);
    }
}
