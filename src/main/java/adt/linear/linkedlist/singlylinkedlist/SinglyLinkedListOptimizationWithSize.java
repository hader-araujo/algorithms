package adt.linear.linkedlist.singlylinkedlist;

public class SinglyLinkedListOptimizationWithSize<T> {

    private int size;
    private Node<T> head;

    public SinglyLinkedListOptimizationWithSize() {
        size = 0;
    }

    public void addToFront(T value) {
        Node<T> nodeTemp = head;

        head = new Node<>(value);
        head.next = nodeTemp;
        size++;
    }

    public void addToBack(T value) {
        if (size == 0) {
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
        if (size == 0) {
            return;
        }

        head = head.next;
        size--;
    }

    public void removeFromBack() {
        if (size == 0) {
            return;
        }

        if (size == 1) {
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
