package laba3.Part3.Task7;
//
public class TailList {
    public static void main(String[] args) {
        Node tail = null; // начальное значение ссылки на хвост
        for (int i = 0; i < 10; i++) { // заполнение списка с "хвоста"
            tail = new Node(i, tail);
        }

        Node ref = tail;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
