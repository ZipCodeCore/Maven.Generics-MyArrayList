import java.util.Collection;
import java.util.Iterator;

/**
 * filename:
 * project: generics
 * author: https://github.com/vvmk
 * date: 3/8/18
 */
public class MySet<E> {
    GreatValueArrayList<E> arrayList;

    public void add(E e) {

    }

    public void addAll(Collection<? extends E> c) {

    }

    public void clear() {

    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public void remove(Object o) {

    }

    public void removeAll(Collection<?> c) {

    }

    public void retainAll(Collection<?> c) {

    }

    public int size() {
        return arrayList.size();
    }

    public Object[] toArray() {
        return arrayList.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

}
