public class Addition {
    int add(int a, int b) {
       return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    static void main(String[] args) {
        Addition obj = new Addition();

        System.out.println("Two sum = " + obj.add(5, 1));
        System.out.println("Three sum = " + obj.add(9, 11, 6));
    }
}
