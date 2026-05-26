public class Largest {
    static void main(String[] args) {
        int[] numbers = { 55, 64, 75, 80, 65};

        int largest = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}
