import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
    private final static int DEFAULT_SIZE = 10;
    private E[] numbers;
    private boolean isEmpty = false;
    private int sizeOfList;
    private int capacitiy;
    private int nullValues;

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
        boolean removed = false;
        int index = indexOf(theObject);
        if (index != -1) {
            removed = removeFromList(index);
        }
        return removed;
    }

    public boolean removeFromList(int index) {
        numbers[index] = null;
        for (int i = index; i < sizeOfList; i++) {

            if (numbers[i + 1] != null) {
                numbers[i] = numbers[i + 1];
            }
        }
        nullValues++;
        sizeOfList--;
        return true;
    }


    public boolean isEmpty() {
        return this.isEmpty;
    }

    // clears array by setting new array to size zero;
    public void clear() {
        sizeOfList = 0;
        clearAllResize();
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

    public E get(int index) {

        if (index >= 0 && index <= sizeOfList) {
            return numbers[index];
        }
        return null;
    }

    public int indexOf(E theObject) {
        for (int i = 0; i < sizeOfList; i++) {
            if (theObject.equals(numbers[i]))
                return i;
        }
        return -1;
    }

    public int getNumberOfNulls() {
        return this.nullValues;
    }

    public void reSizeList() {
        int oldCapasity = numbers.length;
        int newCapasity = oldCapasity - DEFAULT_SIZE;
        if (newCapasity > 10 && nullValues == 10) {
            reSize();
        }
    }

    public void reSize() {
        numbers = Arrays.copyOf(numbers, numbers.length - DEFAULT_SIZE);
    }

    public void clearAllResize() {
        numbers = Arrays.copyOf(numbers, DEFAULT_SIZE);
        for (E number : numbers) {
            number = null;
        }
    }

}
