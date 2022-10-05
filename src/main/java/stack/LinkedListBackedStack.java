package stack;

public class LinkedListBackedStack<T> {

    private Node<T> head;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    public T pop() {
        if (head == null) {
            return null;
        }

        T headValue = head.value;
        head = head.next;
        return headValue;

    }

    public T peak() {
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

        private Node(T value) {
            this.value = value;
        }

    }


}
