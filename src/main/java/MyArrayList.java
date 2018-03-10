import java.util.Arrays;

public class MyArrayList<E> {

    private E[] myArrayList;
    private int size = 0;

    public MyArrayList() {
        this.myArrayList = (E[]) new Object[0];
    }

    public MyArrayList(int length) {
        this.myArrayList = (E[]) new Object[length];
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
        if (size == myArrayList.length) {
            E[] arrayWithDoubleCapacity = (E[]) new Object[size * 2];
            System.arraycopy(myArrayList, 0, arrayWithDoubleCapacity, 0, size);
            myArrayList = arrayWithDoubleCapacity;
        }
    }


}
