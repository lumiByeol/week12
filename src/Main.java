import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "";

        try (FileReader fileReader = new FileReader("text.txt"); FileWriter fileWriter = new FileWriter("text2.txt")) {
            int inChar = fileReader.read();
            while (inChar != -1) {
                s += (char) inChar;
                inChar = fileReader.read();
            }
            fileWriter.write(s);
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}