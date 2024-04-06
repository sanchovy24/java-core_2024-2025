package laba3.Part4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class GetElement {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Заполняем коллекции элементами перед получением значений по индексу.
        for (int i = 0; i < 20 * 10000; i++) {
            arrayList.add(i);
            sortedSet.add(i);
            treeSet.add(i);
        }

        Random random = new Random();
        int randomIndex = random.nextInt(arrayList.size());

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            int element = arrayList.get(randomIndex);
        }
        long end = System.currentTimeMillis();
        System.out.println("Время получения по случайному индексу из ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            int element = getRandomElement(sortedSet, randomIndex);
        }
        end = System.currentTimeMillis();
        System.out.println("Время получения по случайному индексу из SortedSet (TreeSet): " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 20 * 10000; i++) {
            int element = getRandomElement(treeSet, randomIndex);
        }
        end = System.currentTimeMillis();
        System.out.println("Время получения по случайному индексу из TreeSet: " + (end - start));
    }

    private static int getRandomElement(SortedSet<Integer> set, int index) {
        int count = 0;
        int element = -1;
        for (Integer i : set) {
            if (count == index) {
                element = i;
                break;
            }
            count++;
        }
        return element;
    }

    private static int getRandomElement(TreeSet<Integer> set, int index) {
        int count = 0;
        int element = -1;
        for (Integer i : set) {
            if (count == index) {
                element = i;
                break;
            }
            count++;
        }
        return element;
    }
}