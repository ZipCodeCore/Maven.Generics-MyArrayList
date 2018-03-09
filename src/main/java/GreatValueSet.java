import java.util.ArrayList;
import java.util.Collection;

/**
 * filename:
 * project: generics
 * author: https://github.com/vvmk
 * date: 3/8/18
 */
public class GreatValueSet<E> {
    private GreatValueArrayList<E> arrayList;

    public GreatValueSet() {
        arrayList = new GreatValueArrayList<>();
    }

    public GreatValueSet(int startingCapacity) {
        arrayList = new GreatValueArrayList<>(startingCapacity);
    }

    public GreatValueSet(Collection<? extends E> c) {
        arrayList = new GreatValueArrayList<>(c);
    }

    public void add(E e) {
        if (arrayList.isEmpty())
            arrayList.add(e);

        if (!arrayList.contains(e))
            arrayList.add(e);
    }

    public void addAll(Collection<? extends E> c) {
        for (E e : c)
            add(e);
    }

    public void clear() {
        arrayList.clear();
    }

    public boolean contains(E e) {
        return arrayList.contains(e);
    }

    public boolean containsAll(Collection<? extends E> c) {
        return arrayList.containsAll(c);
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public void remove(E e) {
        arrayList.remove(e);
    }

    public void removeAll(Collection<?> c) {
        for (Object o : c)
            arrayList.remove(o);
    }

    public int size() {
        return arrayList.size();
    }

    public Object[] toArray() {
        return arrayList.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return arrayList.toArray(a);
    }
}
