package prob2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NewFileIO {
    private final static String TO_PRINT = "This is the string to print to file.";

    private void writeText() {
        String fileName = "output.txt";
        try (PrintWriter printWriter = new PrintWriter(fileName)) {
            printWriter.println(TO_PRINT);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new NewFileIO().writeText();
    }
}
