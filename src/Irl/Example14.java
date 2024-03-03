package Irl;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        int previous_number = number - 1;
        int next_number = 1 + number;
        int sum = number + previous_number + next_number;
        int square = (int) Math.pow (sum, 2);
        System.out.println(previous_number + ", " + number + ", " + next_number + ", " + square);
        in.close();
    }
}
