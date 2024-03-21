package laba2.Example3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = inputScanner.nextLine();

        System.out.println("Введите ключ:");
        int encryptionKey = inputScanner.nextInt();

        inputScanner.nextLine();

        Caesar cipher = new Caesar(encryptionKey, 33, 'а');

        String encryptedResult = cipher.encrypt(inputText);
        System.out.println("Текст после преобразования: " + encryptedResult);

        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String userResponse = inputScanner.nextLine().trim().toLowerCase();

            if (userResponse.equals("y")) {
                String decryptedResult = cipher.decrypt(encryptedResult);
                System.out.println("Текст после обратного преобразования: " + decryptedResult);
                continueLoop = false;
            } else if (userResponse.equals("n")) {
                System.out.println("До свидания!");
                continueLoop = false;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }

        inputScanner.close();
    }
}
