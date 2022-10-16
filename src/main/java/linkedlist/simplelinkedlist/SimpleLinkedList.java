package linkedlist.simplelinkedlist;

public class SimpleLinkedList<T> {
    private Node<T> head;

    public void addToFront(T value) {
        Node<T> nodeTemp = head;

        head = new Node<>(value);
        head.next = nodeTemp;
    }

    public void addToBack(T value) {
        if (head == null) {
            head = new Node<>(value);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node<>(value);
    }

    public void removeFromFront() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void removeFromBack() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public String toString() {
        if (head == null) {
            return "";
        }

        String answer = "";
        Node<T> current = head;

        int index = 0;
        while (current != null) {
            answer += current.value + " ";
            current = current.next;
        }

        return answer.substring(0, answer.length() - 1);
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
