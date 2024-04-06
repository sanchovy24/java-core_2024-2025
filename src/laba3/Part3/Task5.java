package laba3.Part3;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        // Создание пары ключ-значение
        HashMap<Integer, String> pair = new HashMap<>();
        // Вставка пар ключ-значение

        pair.put(1, "Арбуз");
        pair.put(2, "Банан");
        pair.put(3, "Виноград");
        pair.put(4, "Груша");
        pair.put(5, "Дуриан");
        pair.put(6, "Ежевика");
        pair.put(7, "Жимолость");
        pair.put(8, "Зверобой");

        // Вывод значений ключей больше 5
        System.out.println("Значение ключей больше 5:");
        for (Integer number : pair.keySet()) {
            if (number > 5) {
                System.out.println("Ключ " + number + " - строка " + pair.get(number));
            }
        }

        // Проверка наличия ключа 0 и вывод его значения
        if (pair.containsKey(0)) {
            System.out.println("Ключ 0 - строка " + pair.get(0));
        }
        else
            System.out.println("Строк с ключом 0 нет.");

        // Перемножение ключей, где длина строк больше пяти
        int multiplication = 1;
        for (Integer number : pair.keySet()) {
            String word = pair.get(number);
            if (word.length() > 5) {
                multiplication *= number;
            }
        }

        // Вывод результата перемножения ключей, где длина строк больше пяти
        System.out.println("Результат перемножения ключей, где длина строк больше пяти: " + multiplication);
    }
}