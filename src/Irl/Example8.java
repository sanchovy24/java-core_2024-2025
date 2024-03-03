package Irl;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String day_on_week = in.nextLine();
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.println("Введите номеря дня в месяце: ");
        int day = in.nextInt();
        System.out.println("Сегодняшнее число: " + day_on_week + ", " + day + ", " + month);
        in.close();
    }
}
