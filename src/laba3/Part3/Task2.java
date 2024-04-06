package laba3.Part3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = input.nextInt();
        String binary = Binary(number); //
        System.out.println("Двоичное представление числа: " + binary);

    }
// метод, который принимает введенное число и возвращает его двоичное представление в виде строки
    public static String Binary(int number) {
        if (number <= 1) {
            return Integer.toString(number);
        } else {
            int remainder = number % 2; //вычисление остатка от деления
            int whole = number / 2; //целая часть от деления
            return Binary(whole) + remainder;
        }
    }
}
