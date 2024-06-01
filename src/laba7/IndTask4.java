package laba7;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IndTask4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/laba7/Examples/input_IndTask4.txt");
        FileWriter writer = new FileWriter("src/laba7/Examples/output_IndTask4.txt");
        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }

}
