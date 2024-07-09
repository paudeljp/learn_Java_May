package FileInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("FileInputOutput\\output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
