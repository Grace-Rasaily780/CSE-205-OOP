import java.util.ArrayList;

public class NameArrayList {
    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Grace");
        names.add("Sakshyam");
        names.add("Tushar");

        for (int i = 0; i <= 2; i++) {
            System.out.println(names.get(i));
        }
    }
}
