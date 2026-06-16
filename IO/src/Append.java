import java.io.FileWriter;

public class Append {
    static void main(String[] args) {
        String data = "\nThis is additional content!";

        try {
            FileWriter output = new FileWriter("newFile.txt", true);

            output.write(data);
            System.out.println("Data is appended to the file.");

            output.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
