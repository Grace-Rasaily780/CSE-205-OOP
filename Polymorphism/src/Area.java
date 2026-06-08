public class Area {
    static void main(String[] args) {
        Area rectangle = new Area();

        rectangle.computeArea(2, 2);

        Area square = new Area();

        square.computeArea(3);
    }

    void computeArea(double length, double breadth) {
        System.out.println("Area of rectangle: " + length * breadth);
    }

    void computeArea(double length) {
        System.out.println("Area of square: " + length * length);
    }
}
