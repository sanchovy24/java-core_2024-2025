package laba2.Example3;

public class Caesar {
    private int key;
    private int alphabetSize;
    private char startChar; // Переменная для хранения начального символа алфавита

    public Caesar(int key, int alphabetSize, char startChar) {
        this.key = key;
        this.alphabetSize = alphabetSize;
        this.startChar = startChar;
    }

    public String encrypt(String text) {
        StringBuilder result = new StringBuilder(); // хранение зашифрованного текста

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) { // Проверка, является ли символ буквой
                char shifted = (char) (((Character.toUpperCase(ch) - Character.toUpperCase(startChar) + key) % alphabetSize) + Character.toUpperCase(startChar));
                if (Character.isLowerCase(ch)) { // Проверка, является ли символ строчной буквой
                    result.append(Character.toLowerCase(shifted)); // Добавление зашифрованной строчной буквы к результату
                } else {
                    result.append(shifted); // Добавление зашифрованной заглавной буквы к результату
                }
            } else {
                result.append(ch); // Добавление символа без изменений, если не является буквой
            }
        }

        return result.toString();
    }

    public String decrypt(String text) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char shifted = (char) (((Character.toUpperCase(ch) - Character.toUpperCase(startChar) - key + alphabetSize) % alphabetSize) + Character.toUpperCase(startChar)); // Расшифрование символа
                if (Character.isLowerCase(ch)) { // Проверка, является ли символ строчной буквой
                    result.append(Character.toLowerCase(shifted)); // Добавление расшифрованной строчной буквы к результату
                } else {
                    result.append(shifted); // Добавление расшифрованной заглавной буквы к результату
                }
            } else {
                result.append(ch); // Добавление символа без изменений, если не является буквой
            }
        }
        return result.toString();
    }
}
