package laba3.Part3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];

        inputArray(array, 0, in);
        outputArray(array, 0);
    }

    // Метод для рекурсивного ввода элементов массива
    public static void inputArray(int[] array, int index, Scanner in) {
        if (index < array.length) {
            System.out.print("Введите индекс элемента массива: ");
            array[index] = in.nextInt();
            inputArray(array, index + 1, in);
        }
    }

    // Метод для рекурсивного вывода элементов массива
    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}
