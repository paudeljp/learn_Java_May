package FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("FileInputOutput\\output.txt"))) {
            writer.write("This is a line of text.");
            writer.newLine();
            writer.write("this is another line of text.");
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
