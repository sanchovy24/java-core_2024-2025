package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddHead {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Время добавления в начало ArrayList: " + addHead(arrayList));

        SortedSet<Integer> sortedSet = new TreeSet<>();
        System.out.println("Время добавления в начало SortedSet: " + addHead(sortedSet));

        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Время добавления в начало TreeSet: " + addHead(treeSet));
    }

    private static long addHead(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addHead(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.add(i);
            set.headSet(i).clear();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addHead(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.add(i);
            set.headSet(i).clear();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}