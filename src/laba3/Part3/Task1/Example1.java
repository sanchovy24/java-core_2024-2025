package laba3.Part3.Task1;

public class Example1 {
    public static void m(int x) {
        System.out.println("Значение x = " + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}
