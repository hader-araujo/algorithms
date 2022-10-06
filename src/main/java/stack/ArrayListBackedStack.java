package stack;

public class ArrayListBackedStack<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] elementsData;
    private int size;

    public ArrayListBackedStack() {
        elementsData = new Object[DEFAULT_SIZE];
        size = 0;
    }

    public void push(T value) {
        grow();

        elementsData[size++] = value;
    }


    public T pop() {
        if (size == 0) {
            return null;
        }

        T currentValue = (T) elementsData[size - 1];

        elementsData[--size] = null;

        return currentValue;

    }

    public T peak() {
        return size == 0 ? null : (T) elementsData[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elementsData = new Object[DEFAULT_SIZE];
        size = 0;
    }

    private void grow() {
        if (size == elementsData.length) {
            Object[] currentArray = elementsData;
            elementsData = new Object[elementsData.length * 2];
            System.arraycopy(currentArray, 0, elementsData, 0, size);
        }
    }
}
