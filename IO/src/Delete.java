import java.io.File;

public class Delete {
    static void main(String[] args) {
        File file = new File("example.txt");

        try {
            boolean value = file.delete();

            if (value) {
                System.out.println("The file is deleted");
            } else {
                System.out.println("The file is not deleted");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
