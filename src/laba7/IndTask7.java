package laba7;
import java.io.*;
import java.util.Scanner;
public class IndTask7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String path = in.nextLine();
        System.out.println("Введите имя файла: ");
        String fileName = in.nextLine();
        System.out.println("Введите текст, который хотите записать в файл: ");
        String textOfWrite = in.nextLine();
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(
                             new FileWriter(path + fileName ))) {
            bufferedWriter.write(textOfWrite);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            in.close();
        }
        System.out.println("Текст успешно записан");
        System.out.println("Кол-во записанных символов: " + textOfWrite.length());
    }
}
