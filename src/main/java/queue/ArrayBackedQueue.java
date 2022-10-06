package queue;

public class ArrayBackedQueue<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] elementsData;
    private int size;
    private int front;
    private int back;

    public ArrayBackedQueue() {
        clear();
    }

    public void enqueue(T value) {
        grow();

        elementsData[back] = value;

        back = (back + 1) % elementsData.length;
        size++;
    }

    public T dequeue() {

        if (size == 0) {
            return null;
        }

        T currentValue = (T) elementsData[front];

        elementsData[front] = null;
        front = (front + 1) % elementsData.length;
        size--;

        return currentValue;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return (T) elementsData[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elementsData = new Object[DEFAULT_SIZE];
        front = 0;
        back = 0;
        size = 0;
    }

    private void grow() {
        if (size == elementsData.length) {
            Object[] currentArray = elementsData;
            elementsData = new Object[elementsData.length * 2];

            System.arraycopy(currentArray, front, elementsData, 0, currentArray.length - front);
            System.arraycopy(currentArray, 0, elementsData, currentArray.length - front, front);

            back = currentArray.length;
            front = 0;
        }

    }
}
