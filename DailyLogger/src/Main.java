import java.io.*;

public class Main {
    static void main(String[] args) {
        File file = new File("daily_log.txt");

        try {
             boolean isExist = file.createNewFile();

             if(isExist) {
                 System.out.println("New log file created.");
             } else {
                 System.out.println("Existing log file detected. Overwriting data...");
             }

             FileWriter log = new FileWriter("daily_log.txt");

             log.write("Log Entry: System stared at 8:00 PM");

             log.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}