import java.io.FileWriter;

public class Write {
    static void main(String[] args) {
        String data = "I am learning java. Now at MIT College.";

        try {
            FileWriter output = new FileWriter("newFile.txt");

            output.write(data);
            System.out.println("Data is written to the file");

            output.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
