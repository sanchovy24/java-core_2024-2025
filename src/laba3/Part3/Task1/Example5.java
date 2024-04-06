package laba3.Part3.Task1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    public static int fib(int n) {
        int result;
        System.out.println("Член последовательности Фибоначчи: " + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            result = fib(n - 2) + fib(n - 1);
            return result; //вывод числа Фибоначчи
        }
    }
}
