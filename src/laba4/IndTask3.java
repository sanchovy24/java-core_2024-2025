package laba4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class IndTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        byte[] array = new byte[size];

        try {
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                array[i] = in.nextByte();
            }

            int sum = 0;
            for (byte value : array) {
                sum += value;
            }

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Элементы массива:");
            for (byte value : array) {
                System.out.println("Элемент: " + value);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введен неверный тип данных или значение находится за пределами диапазона данных.");
        }

    }
}