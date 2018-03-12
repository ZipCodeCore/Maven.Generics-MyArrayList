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

    public boolean addAll(Collection<? extends E> collection) {
        for (E element : collection) {
            myArrayList.add(element);
        }
        return true;
    }

    public void clear() {
        this.myArrayList.clear();
    }

    public boolean contains(Object object) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public boolean remove(Object object) {
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    public int size() {
        return myArrayList.size();
    }

    public Object[] toArray() {
        return myArrayList.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

}
