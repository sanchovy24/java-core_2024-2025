package laba3.Part3.Task7;

public class HeadList {
    public static void main(String[] args) {
        Node head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) { // заполнение списка с "головы"
            head = new Node(i, head);
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
