package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class AddTail {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Время добавления в конец ArrayList: " + addTail(arrayList));

        SortedSet<Integer> sortedSet = new TreeSet<>();
        System.out.println("Время добавления в конец SortedSet: " + addTail(sortedSet));

        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Время добавления в конец TreeSet: " + addTail(treeSet));
    }

    private static long addTail(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addTail(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addTail(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
