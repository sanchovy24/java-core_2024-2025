package laba7;
import java.io.*;
import java.util.Scanner;

public class IndTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите путь к файлу: ");
        String filePath = in.nextLine();

        System.out.print("Введите название файла: ");
        String fileName = in.nextLine();

        System.out.print("Введите слова для поиска в тексте: ");
        String textToSearch = in.nextLine();

        try (BufferedReader read = new BufferedReader(new FileReader(filePath  + fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                if (line.contains(textToSearch)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
