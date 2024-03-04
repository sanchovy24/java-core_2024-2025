package Irl;
import java.util.Scanner;
public class Example9 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название месяца: ");
            String month = in.nextLine();
            System.out.println("Количество дней в нем: ");
            int day = in.nextInt();
            System.out.println("Месяц - " + month + ", в нем - " + day
                    + " день/дней.");
            in.close();
        }
    }
