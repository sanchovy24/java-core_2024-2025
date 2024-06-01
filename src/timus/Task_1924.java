package timus;
import java.util.Scanner;
public class Task_1924 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            // Вычисляем сумму чисел от 1 до n
            int sum = (n * (n + 1)) / 2;

            // Если сумма четная, то выиграют «чёрные»
            if (sum % 2 == 0) {
                System.out.println("black");
            } else {
                System.out.println("grimy");
            }
        }
    }
