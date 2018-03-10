public class MyArrayList<E> {

    private E[] myArrayList;
    private int size;

    public MyArrayList() {
        this.myArrayList = (E[]) new Object[0];
    }

    public MyArrayList(int size) {
        this.myArrayList = (E[]) new Object[size];
    }

    public boolean add(E element) {
        // adds element to the end of the array
        // returns true;
        return false;
    }

    public void add(int index, E element) {
    }

    public E get(){
        return null;
    }

    public E remove(int index) {
        // return the element that was removed
        return null;
    }

    public E set(int index, E element) {
        // returns the element previously at the specified position
    }

    public void clear() {

    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains() {
        return false;
    }

}
