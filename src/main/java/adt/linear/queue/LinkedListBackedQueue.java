package adt.linear.queue;

public class LinkedListBackedQueue<T> {

    /*
    NÃO UTILIZADO pois with tail é mais performático
     */

    private Node<T> head;

    public void enqueue(T value) {

        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }

        T currentValue = head.value;
        head = head.next;
        return currentValue;

    }

    public T peek() {
        return head == null ? null : head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

}
