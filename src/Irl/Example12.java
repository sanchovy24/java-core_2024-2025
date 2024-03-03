package Irl;
import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();
        int current_year = current_date.getYear();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        int birth_year = current_year - age;
        System.out.println("Год рождения: " + birth_year);
        in.close();
    }
}
