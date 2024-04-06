package laba3.Part3.Task8;

public class Main {
    private Node head;

    // Ввод с головы
    public void createHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Ввод с хвоста
    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Вывод списка
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    // Добавление элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Добавление элемента в конец списка
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Вставка элемента в список с указанным номером
    public void insert(int data, int position) {
        if (position < 0) {
            System.out.println("Неверная позиция");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int count = 0;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Неверная позиция");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Удаление элемента с головы списка
    public void removeFirst() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        head = head.next;
    }

    // Удаление последнего элемента списка
    public void removeLast() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Удаление элемента с указанным номером
    public void remove(int position) {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (position < 0) {
            System.out.println("Неверная позиция");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Неверная позиция");
            return;
        }
        current.next = current.next.next;
    }

    // Ввод с головы с использованием рекурсии
    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if(current == null) {
            current = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = current;
            current = newNode;
        }
        return current;
    }

    // Ввод с хвоста с использованием рекурсии
    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }

    private Node createTailRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createTailRecHelper(current.next, data);
        return current;
    }

    // Вывод списка с использованием рекурсии
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(current.value).append(" ");
        sb.append(toStringRecHelper(current.next));
        return sb.toString();
    }
}
