package laba7;
import java.io.File;
import java.util.Scanner;

public class IndTask5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите путь к файлу:");
        String filePath = in.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла '" + filePath + " - " + fileSize+ " байт(а).");
        } else {
            System.out.println("Файл не найден: " + filePath);
        }

        in.close();
    }

}
