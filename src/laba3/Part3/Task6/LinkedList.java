package laba3.Part3.Task6;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        int N = 100; // Количество человек в круге
        List<Integer> participants = new java.util.LinkedList<>();
        for (int i = 1; i <= N; i++) {
            participants.add(i);
        }
        int person = 0;

        // Измерение времени выполнения алгоритма
        long startTime = System.nanoTime();

        while (participants.size() > 1) {

            // Вычисление позиции человека для удаления
            person = (person + 1) % participants.size();
            participants.remove(person);
        }

        long endTime = System.nanoTime();

        // Вывод результата и времени выполнения
        System.out.println("Остался человек с номером: " + participants.get(0));
        System.out.println("Время выполнения алгоритма: " + (endTime - startTime) + " наносекунд");
    }

}