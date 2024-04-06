package laba3.Part3.Task6;
import java.util.List;
public class ArrayList {
    public static void main(String[] args) {

        int N = 100;  // Количество человек в круге
        List<Integer> participants = new java.util.ArrayList<>();
        for (int i = 1; i <= N; i++) {
            participants.add(i);
        }

        // Измерение времени выполнения алгоритма
        long startTime = System.nanoTime();

        // Вычисление позиции человека для удаления
        int person = 0;
        while (participants.size() > 1) {
            person = (person + 1) % participants.size();
            participants.remove(person);
        }

        long endTime = System.nanoTime();

        System.out.println("Остался человек c номером: " + participants.get(0));
        System.out.println("Время выполнения алгоритма: " + (endTime - startTime) + " наносекунд");
    }
}