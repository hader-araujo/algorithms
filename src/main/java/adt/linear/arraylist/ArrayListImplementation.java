package adt.linear.arraylist;

public class ArrayListImplementation<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private int amount;
    private Object[] elementsData;


    public ArrayListImplementation(int size) {
        this.amount = 0;
        elementsData = new Object[size];
    }

    public ArrayListImplementation() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return amount;
    }

    protected int lengthOfElements() { // TODO deletar
        return elementsData.length;
    }

    public boolean add(T value) {
        return add(amount, value);
    }

    public boolean add(int index, T value) {
        grow();

        if (index > amount) {
            return false;//maybe should throw exception
        }

        System.arraycopy(elementsData, index, elementsData, index + 1, amount - index);

        elementsData[index] = value;
        amount++;

        return true;
    }

    public T remove(int index) {

        if (index >= amount) {
            return null;//maybe should throw exception
        }

        Object oldValue = elementsData[index];

        if (index < amount - 1) {
            System.arraycopy(elementsData, index + 1, elementsData, index, amount - index);
        }

        elementsData[index] = null;

        return (T) oldValue;
    }

    public T get(int index) {
        if (index >= amount) {
            return null;//maybe should throw exception
        }

        return (T) elementsData[index];
    }

    private void grow() {

        if (amount == elementsData.length) {
            Object[] newArray = new Object[elementsData.length * 2];
            System.arraycopy(elementsData, 0, newArray, 0, amount);
            elementsData = newArray;
        }
    }

}
