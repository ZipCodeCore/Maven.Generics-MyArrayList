import java.util.Collection;
import java.util.Iterator;

public class MySet<E> {

    private MyArrayList<E> myArrayList;

    public MySet() {
        this.myArrayList = new MyArrayList<>();
    }

    public MySet(Collection<? extends E> collection) {
        this.myArrayList = new MyArrayList<>(collection);
    }

    public MySet(int initialCapacity) {
        this.myArrayList = new MyArrayList<>(initialCapacity);
    }

    public boolean add(E element) {
        if (myArrayList.isEmpty()) {
            myArrayList.add(element);
        } else if (! myArrayList.contains(element)) {
            myArrayList.add(element);
        }
        return true;
    }

    // Could not get this method to work
//    public boolean addAll(Collection<? extends E> collection) {
//        for (E element : collection) {
//            myArrayList.add(element);
//        }
//        return true;
//    }

    public void clear() {
        this.myArrayList.clear();
    }

    public boolean contains(E elementToFind) {
        return this.myArrayList.contains(elementToFind);
    }

//    public boolean containsAll(Collection<?> collection) {
//        return false;
//    }

//    public boolean equals(Object object) {
//        return false;
//    }

//    public int hashCode() {
//        return 0;
//    }

    public boolean isEmpty() {
        return this.myArrayList.isEmpty();
    }

//    public Iterator<E> iterator() {
//        return null;
//    }

    public void remove(E element) {
        this.myArrayList.remove(element);
    }

//    public boolean removeAll(Collection<?> collection) {
//        return false;
//    }

//    public boolean retainAll(Collection<?> collection) {
//        return false;
//    }

    public int size() {
        return myArrayList.size();
    }

    public int capacity() {
        return myArrayList.capacity();
    }

    public Object[] toArray() {
        return myArrayList.toArray();
    }

//    public <T> T[] toArray(T[] a) {
//        return a.toArray();
//    }

}
