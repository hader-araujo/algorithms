package linkedlist;

import java.util.Iterator;

public class SimpleLinkedListOptimizationWithTailIterable<T> implements Iterable<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public SimpleLinkedListOptimizationWithTailIterable() {
        size = 0;
    }

    public void addToFront(T value) {
        Node<T> nodeTemp = head;

        head = new Node<>(value);
        head.next = nodeTemp;

        if (size == 0) {
            tail = head;
        }
        if (size == 1) {
            tail = nodeTemp;
        }

        size++;
    }

    public void addToBack(T value) {
        if (size == 0) {
            head = new Node<>(value);
            tail = head;
            size = 1;
            return;
        }

        tail.next = new Node<>(value);
        tail = tail.next;
        size++;
    }

    public void removeFromFront() {
        if (size == 0) {
            return;
        }

        if (size == 1) {
            tail = head;
        }

        head = head.next;

        size--;
    }

    public void removeFromBack() {
        if (size == 0) {
            return;
        }

        if (size == 1) {
            head = tail = null;
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

    @Override
    public Iterator<T> iterator() {
        return new SLLIterator();
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

    private class SLLIterator implements Iterator<T> {

        private Node<T> current;

        SLLIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T currentValue = current.value;
                current = current.next;
                return currentValue;
            }
            return null;
        }
    }
}
