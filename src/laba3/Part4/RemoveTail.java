package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class RemoveTail {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20 * 10000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время удаления из конца ArrayList: " + removeTailArrayList(arrayList));

        // SortedSet (TreeSet)
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 20 * 10000; i++) {
            sortedSet.add(i);
        }
        System.out.println("Время удаления из конца SortedSet: " + removeTailSortedSet(sortedSet));

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 20 * 10000; i++) {
            treeSet.add(i);
        }
        System.out.println("Время удаления из конца TreeSet: " + removeTailTreeSet(treeSet));
    }

    private static long removeTailArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeTailSortedSet(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.remove(set.last());
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeTailTreeSet(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.pollLast();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
