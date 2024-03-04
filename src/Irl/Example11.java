package Irl;
import java.util.Scanner;
import java.time.LocalDate;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        LocalDate current_date = LocalDate.now();
        int current_year = current_date.getYear();
        System.out.println("Год рождения пользователя: ");
        int birth_year = in.nextInt();
        int age = current_year - birth_year;
        System.out.println("Имя пользователя - " + name + ", его возраст - " + age + " лет/года.");
        in.close();
    }
}
