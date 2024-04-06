package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Время добавления в середину ArrayList: " + addMiddle(arrayList));

        SortedSet<Integer> sortedSet = new TreeSet<>();
        System.out.println("Время добавления в середину SortedSet: " + addMiddle(sortedSet));

        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Время добавления в середину TreeSet: " + addMiddle(treeSet));
    }

    private static long addMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addMiddle(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addMiddle(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
