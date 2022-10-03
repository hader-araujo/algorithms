package linkedlist;

public class SimpleLinkedList<T> {

    private int size;
    private Node<T> head;

    public SimpleLinkedList() {
        size = 0;
    }

    public void addToFront(T value) {
        Node<T> nodeTemp = head;

        head = new Node<>(value);
        head.next = nodeTemp;
        size++;
    }

    public void addToBack(T value) {
        if (head == null) {
            head = new Node<>(value);
            size = 1;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<>(value);
        size++;
    }

    public void removeFromFront() {
        if (head == null) {
            return;
        }

        head = head.next;
        size--;
    }

    public void removeFromBack() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            size = 0;
            return;
        }

        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;
    }

    public Object[] toArray() {
        if (head == null) {
            return new Object[0];
        }

        Object[] arrayToResponse = new Object[size];

        Node<T> current = head;
        int index = 0;
        while (current != null) {
            arrayToResponse[index++] = current.value;
            current = current.next;
        }

        return arrayToResponse;
    }

    public int size() {
        return size;
    }

    private static final class Node<T> {
        private T value;
        private Node<T> next;

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        Node(T value) {
            this(value, null);
        }

    }
}
