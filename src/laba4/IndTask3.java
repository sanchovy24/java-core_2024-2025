package laba4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class IndTask3 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = calculateStringLength(str);
        System.out.println("Длина строки: " + length);
    }

    public static int calculateStringLength(String str) {
        return str.length();
    }

}