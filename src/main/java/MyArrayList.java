import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
    private final static int DEFAULT_SIZE = 10;
    private E[] numbers;
    private boolean isEmpty = false;
    private int sizeOfList;
    private int capacitiy;

    private ArrayList<String> time;

    public MyArrayList(int length) {
        sizeOfList = 0;
        capacitiy = length;
        if (length > 0) {
            this.numbers = (E[]) new Object[length];
        }

    }

    /* if there is no size given create Default with size of 10.*/
    public MyArrayList() {
        this(DEFAULT_SIZE);
    }

    public void ensureCapacity(int sizeOfList) {
        if (sizeOfList - getCapacity() > 0) {
            grow();
        }
    }

    public void grow() {
        int oldCapacity = numbers.length;
        int newCapacity = oldCapacity + DEFAULT_SIZE;
        numbers = Arrays.copyOf(numbers, newCapacity);
    }

    //if smaller array falls below length increments of ten then resize the array
    public void trimSize() {

    }

    //if smaller array falls below length increments of ten then resize the array
    public void reFactorArraySize() {

    }


    //adds to a specific index.
    public boolean add(E theObject, int index) {

        return false;
    }

    //adds to the last index
    public boolean add(E theObject) {
        ensureCapacity(sizeOfList + 1);
        numbers[sizeOfList++] = theObject;
        return true;
    }


    public boolean remove(E theObject) {

        return false;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    // clears array by setting new array to size zero;
    public void clear() {

    }

    public boolean contains(E theObject) {
        boolean contains = false;
        for (E object : numbers) {
            if (theObject.equals(object))
                contains = true;
        }
        return contains;
    }

    public int getSize() {
        return this.sizeOfList;
    }

    public int getCapacity() {
        return numbers.length;
    }

    public void reSizeList() {
        // check to see if the list is 3/4 full if so resize the list
        // this.isEmpty
    }
}
