package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class RemoveMiddle {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20 * 10000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время удаления из середины ArrayList: " + removeMiddleArrayList(arrayList));

        // SortedSet (TreeSet)
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 20 * 10000; i++) {
            sortedSet.add(i);
        }
        System.out.println("Время удаления из середины SortedSet (TreeSet): " + removeMiddleSortedSet(sortedSet));

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 20 * 10000; i++) {
            treeSet.add(i);
        }
        System.out.println("Время удаления из середины TreeSet: " + removeMiddleTreeSet(treeSet));
    }

    private static long removeMiddleArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            list.remove(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeMiddleSortedSet(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.remove(set.toArray()[set.size() / 2]);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeMiddleTreeSet(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.remove(set.toArray()[set.size() / 2]);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
