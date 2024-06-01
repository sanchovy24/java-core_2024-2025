package laba7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IndTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new FileReader("src/laba7/Examples/input_IndTask3.txt"));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }

}
