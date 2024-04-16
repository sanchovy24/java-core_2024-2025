package laba4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class IndTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array;
        try {
            System.out.print("Введите размер массива: ");
            int size = in.nextInt();
            array = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
            }

            double average = calculateAverage(array);
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа или не соответствует числовому типу данных");
        }
        catch (NoPositiveNumbersException e) {
            System.out.println("Ошибка: Положительные элементы отсутствуют.");
        }
    }

    public static double calculateAverage(int[] array) throws NoPositiveNumbersException {
        int sum = 0;
        int N = 0;

        for (int num : array) {
            if (num > 0) {
                sum += num;
                N++;
            }
        }

        if (N == 0) {
            throw new NoPositiveNumbersException();
        }

        return (double) sum / N;
    }

    static class NoPositiveNumbersException extends Exception {
        public NoPositiveNumbersException() {
            super("Нет положительных элементов массива");
        }
    }
}