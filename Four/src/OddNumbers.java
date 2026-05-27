import java.util.ArrayList;

public class OddNumbers {
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(46);
        numbers.add(78);
        numbers.add(43);
        numbers.add(87);

        for (int i = 0; i <= 3; i++) {
            if(numbers.get(i) % 2 == 1) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
