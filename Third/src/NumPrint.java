public class NumPrint {
    void printNumbers() {
        System.out.println(5);
        System.out.println(100);
    }
    static void main(String[] args) {
        NumPrint print = new NumPrint();

        print.printNumbers();

        System.out.println("Calling the method again");

        print.printNumbers();
    }
}
