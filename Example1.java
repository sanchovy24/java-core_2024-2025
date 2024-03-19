package laba2;
import java.util.Random;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива равен = " + size);
        int[] nums = new int[size];
        Random random = new Random();

        // Заполнение массива случайными числами от 0 до 200 и вывод на экран
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }

        int min = nums[0];   // начальное минимальное значение - первый элемент массива

        // Поиск минимального элемента в массиве
        for (int i = 1; i < size; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Минимальное значение элемента в массиве: " + min);

        // Вывод индексов всех элементов равных минимальному значению
        for (int i = 0; i < size; i++) {
        if (nums[i] == min) {
            System.out.print("Индекс минимального элемента: " + i );
        }

        }
    }
}
