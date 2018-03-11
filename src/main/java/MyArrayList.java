import java.util.Arrays;
import java.util.logging.Logger;

public class MyArrayList<E> {

    private static final Logger logger = Logger.getGlobal();

    private E[] myArrayList;
    private int size = 0;

    public MyArrayList() {
        this.myArrayList = (E[]) new Object[10];
    }

    public MyArrayList(int length) throws IllegalArgumentException {
        if (length < 0) {
            throw new IllegalArgumentException("Array length cannot be less than zero.");
        } else {
            this.myArrayList = (E[]) new Object[length];
        }
    }

    public E[] getMyArrayList() {
        return myArrayList;
    }

    public boolean add(E element) {
        ensureCapacity();
        myArrayList[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        ensureCapacity();
        if (myArrayList.length > 1) {
            shiftElementsFromIndexToSize(index);
        }
        myArrayList[index] = element;
        size++;
    }

    public E get(int index){
        return myArrayList[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= myArrayList.length) {
            logger.info("Array length is zero. There are no elements to delete in this array.");
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E elementRemoved = myArrayList[index];
        if ( (myArrayList.length == 1 && index == 0) || (index == size - 1) ) {
            myArrayList[index] = null;
        } else {
            shiftElementsFromSizeToIndex(index);
            myArrayList[size - 1] = null;
        }
        size--;
        return elementRemoved;
    }

    public E set(int index, E element) {
        E elementPreviouslyAtIndex = myArrayList[index];
        if (index < 0 || index >= myArrayList.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        myArrayList[index] = element;
        return elementPreviouslyAtIndex;
    }

    public void clear() {

    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains() {
        return false;
    }

    public int length() {
        return myArrayList.length;
    }

    public void ensureCapacity() {
        if (myArrayList.length == 0) {
            myArrayList = (E[]) new Object[1];
        } else if (size == myArrayList.length) {
            doubleArrayCapacity();
        }
    }

    public void doubleArrayCapacity() {
        E[] arrayWithDoubleCapacity = (E[]) new Object[size * 2];
        System.arraycopy(myArrayList, 0, arrayWithDoubleCapacity, 0, size);
        myArrayList = arrayWithDoubleCapacity;
    }

    public void shiftElementsFromIndexToSize(int index) {
        for (int i = size; i > index; i--) {
            myArrayList[i] = myArrayList[i - 1];
        }
    }

    public void shiftElementsFromSizeToIndex(int index) {
        for (int i = index; i < size - 1; i++) {
            myArrayList[i] = myArrayList[i + 1];
        }
    }

}
