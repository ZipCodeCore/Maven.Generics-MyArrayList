import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MySet<E> {

    public E[] mySet;

    public MySet() {
        this.mySet = (E[]) new Object[2];
    }

    public void add(E e) {
        if (!contains(e)) {
            E[] mySet1 = Arrays.copyOf(mySet, mySet.length + 1);
            mySet1[mySet.length -1] = e;
            mySet = mySet1;
        }

    }

    public void addAll(E[] e) {

    }

    public void clear() {

    }

    public boolean contains(E e) {
        return false;
    }

    public boolean containsAll(E[] e) {
        return false;
    }

    public boolean setEquals(E e){
        return false;
    }

    public int mySetHashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public void remove(E e) {

    }

    public void removeAll(E[] e) {

    }

    public E[] retainAll(E[] e) {
        return null;
    }

    public int size() {
        return this.mySet.length;
    }

    public E[] toArray() {
        return null;
    }

    public E[] toArray(E e) {
        return null;
    }
}
