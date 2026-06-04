public class Triangle {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * this.base * this.height;
    }
}
