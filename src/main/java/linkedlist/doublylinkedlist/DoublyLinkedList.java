package linkedlist.doublylinkedlist;

public class DoublyLinkedList<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        size = 0;
    }

    public void addToFront(T value) {
        Node<T> newNode = new Node<>(value);

        if (size == 0) {
            head = newNode;
            tail = head;
            size = 1;
            return;
        }

        newNode.next = head;
        head.previous = newNode;
        
        head = newNode;

        size++;
    }

    public void addToBack(T value) {

        Node<T> newNode = new Node<>(value);

        if (size == 0) {
            head = newNode;
            tail = head;
            size = 1;
            return;
        }

        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void removeFromFront() {
        if (size == 0) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        head = head.next;
        head.previous = null;

        size--;
    }

    public void removeFromBack() {
        if (size == 0) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        tail = tail.previous;
        tail.next = null;

        size--;
    }

    public Object[] toArray() {

        Object[] arrayToResponse = new Object[size];

        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            arrayToResponse[i] = current.value;
            current = current.next;
        }

        return arrayToResponse;
    }

    public int size() {
        return size;
    }

    private static final class Node<T> {
        private Node<T> previous;
        private T value;
        private Node<T> next;

        Node(T value) {
            this.value = value;
        }

    }
}
