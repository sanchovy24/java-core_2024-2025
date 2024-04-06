package laba3.Part3.Task8;

public class Test {
    public static void main(String[] args) {
        Main list = new Main();

        list.createHead(5);
        list.createHead(4);
        list.createHead(3);
        list.createHead(2);
        list.createHead(1);
        System.out.println("Ввод с головы: " + list);

        list.createTail(6);
        list.createTail(7);
        list.createTail(8);
        System.out.println("Ввод с хвоста: " + list);

        list.addFirst(0);
        System.out.println("Список после добавления в начало: " + list);

        list.addLast(9);
        System.out.println("Список после добавления в конец: " + list);

        list.insert(10, 4);
        System.out.println("Список после вставки элемента: " + list);

        list.removeFirst();
        System.out.println("Список после удаления с головы: " + list);

        list.removeLast();
        System.out.println("Список после удаления с хвоста: " + list);

        list.remove(2);
        System.out.println("Список после удаления элемента: " + list);

        list.createHeadRec(0);
        list.createHeadRec(-1);
        System.out.println("Список после ввода с головы с использованием рекурсии: " + list.toStringRec());

        list.createTailRec(9);
        list.createTailRec(10);
        System.out.println("Список после ввода с хвоста с использованием рекурсии: " + list.toStringRec());
    }
}