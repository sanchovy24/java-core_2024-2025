package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class IndTask4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Список до: " + "\n");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        int number = 50;
        List<Integer> integersAfter = filterList(integers, number);
        System.out.println("Список чисел больше " + number +  "\n");
        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterList(List<Integer> list, int number) {
        return list.stream().filter(x -> x > number).collect(Collectors.toList());
    }
}
