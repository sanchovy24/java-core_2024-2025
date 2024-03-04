package Irl;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод первое число: ");
        int number1 = in.nextInt();
        System.out.println("Ввод второго числа: ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("Сумма двух чисел равна " + sum);
        in.close();
    }
}
