package laba3.Part3.Task4;

public class Test {
    public static void main(String[] args) {
        // Создание несвязанных узлов с помощью конструктора
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        // Связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        //
        Node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
