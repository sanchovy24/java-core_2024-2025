package laba4;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class IndTask2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество строк в матрице: ");
        int numRows = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int numColumns = in.nextInt();

        int[][] matrix = new int[numRows][numColumns];

        // Заполнение матрицы случайными значениями
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        // Вывод матрицы на консоль
        System.out.println("Матрица:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Введите номер возвращаемого столбца: ");
        try {
            int columnNumber = in.nextInt();

            if (columnNumber < 0 || columnNumber >= numColumns) {
                System.out.println("Ошибка: нет столбца с таким индексом.");
            } else {
                System.out.println("Столбец " + columnNumber + ":");
                for (int i = 0; i < numRows; i++) {
                    System.out.println(matrix[i][columnNumber]);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: неверный тип данных.");
        }

        in.close();
    }
}