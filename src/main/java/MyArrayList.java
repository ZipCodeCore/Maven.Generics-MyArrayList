import java.util.Arrays;

public class MyArrayList<E> {

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
//        if (myArrayList.length == 1) {
//            myArrayList[index] = element;
//        } else {
//            for (int i = size; i > index; i--) {
//                myArrayList[i] = myArrayList[i - 1];
//            }
//            myArrayList[index] = element;
//        }
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
        // return the element that was removed
        return null;
    }

    public E set(int index, E element) {
        // returns the element previously at the specified position
        E previousElement = myArrayList[index];
        if (index < 0 || index >= myArrayList.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        myArrayList[index] = element;
        return previousElement;
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

}
