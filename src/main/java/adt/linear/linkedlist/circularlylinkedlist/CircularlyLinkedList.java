package adt.linear.linkedlist.circularlylinkedlist;


/*

performance Big-O
https://learning.edx.org/course/course-v1:GTx+CS1332xI+1T2022/block-v1:GTx+CS1332xI+1T2022+type@sequential+block@5a38a73d4dc14471b5feab1bc6c4d91f/block-v1:GTx+CS1332xI+1T2022+type@vertical+block@6a2cd7e63d3d476093f5b294f5cdd27e

 */

public class CircularlyLinkedList<T> {

    private int size;
    private Node<T> head;

    public CircularlyLinkedList() {
        size = 0;
    }

    public void addToFront(T value) {

        if (size == 0) {
            head = new Node<>(value);
            head.next = head;
            size = 1;
            return;
        }

        Node<T> newNode = new Node<>(head.value);
        head.value = value;
        newNode.next = head.next;
        head.next = newNode;

        size++;
    }

    public void addToBack(T value) {
        if (size == 0) {
            head = new Node<>(value);
            head.next = head;
            size = 1;
            return;
        }

        Node<T> newNode = new Node<>(head.value);
        head.value = value;
        newNode.next = head.next;
        head.next = newNode;

        head = head.next;

        size++;
    }

    public void removeFromFront() {
        if (size == 0) {
            return;
        }

        if (size == 1) {
            head = null;
            size = 0;
            return;
        }

        head.value = head.next.value;
        head.next = head.next.next;

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
        while (current.next.next != head) {
            current = current.next;
        }

        current.next = head;
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

        Node(T value) {
            this.value = value;
        }

    }
}
