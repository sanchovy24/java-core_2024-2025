package laba5;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class IndTask2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Список до: " + "\n");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        int number = 3;
        List<Integer> divisibleByDivisor = filterDivisible(integers, number);
        System.out.println("Список чисел, делящихся на " + number + " без остатка: " + "\n");
        for (Integer i : divisibleByDivisor) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterDivisible(List<Integer> list, int divisor) {
        return list.stream().filter(x -> x % divisor == 0).collect(Collectors.toList());
    }
}
