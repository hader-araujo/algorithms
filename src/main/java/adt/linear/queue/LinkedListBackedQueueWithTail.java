package adt.linear.queue;

public class LinkedListBackedQueueWithTail<T> {

    private Node<T> head;
    private Node<T> tail;

    public void enqueue(T value) {

        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }

        T currentValue = head.value;
        head = head.next;
        if (head == null || head.next == null) {
            tail = head;
        }
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
