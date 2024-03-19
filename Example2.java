package laba2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int rows = in.nextInt();

        System.out.print("Количество столбцов: ");
        int cols = in.nextInt();

        int[][] nums = new int[rows][cols];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Заполнение строки слева направо
                for (int j = 0; j < cols; j++) {
                    nums[i][j] = count;
                    count++;
                }
            } else { // Заполнение строки справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    nums[i][j] = count;
                    count++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

}


