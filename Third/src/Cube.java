public class Cube {
    void findCube(int number) {
        int result = number * number * number;
        System.out.println(result);
    }

    static void main(String[] args) {
        Cube object = new Cube();

        object.findCube(20);
    }
}
