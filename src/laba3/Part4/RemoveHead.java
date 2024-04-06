package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class RemoveHead {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <  20 * 10000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время удаления из начала ArrayList: " + removeHeadArrayList(arrayList));

        // SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i <  20 * 10000; i++) {
            sortedSet.add(i);
        }
        System.out.println("Время удаления из начала SortedSet: " + removeHeadSortedSet(sortedSet));

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 20 * 10000; i++) {
            treeSet.add(i);
        }
        System.out.println("Время удаления из начала TreeSet: " + removeHeadTreeSet(treeSet));
    }

    private static long removeHeadArrayList(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeHeadSortedSet(SortedSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.remove(set.first());
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeHeadTreeSet(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            set.pollFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}

