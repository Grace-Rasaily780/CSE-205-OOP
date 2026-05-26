public class AgeLoop {
    static void main(String[] args) {
        int[] age = {24, 23, 18, 19, 20};
        int total = 0;

        for (int i = 0; i < 5; ++i) {
            total += age[i];
        }

        System.out.println(total);
    }
}
