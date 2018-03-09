import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * filename:
 * project: generics
 * author: https://github.com/vvmk
 * date: 3/8/18
 */
public class GreatValueArrayList<E> {
    private static final int fDEFAULT_CAPACITY = 10;
    private Object[] array;
    private int numberOfElements;

    public GreatValueArrayList() {
        this(fDEFAULT_CAPACITY);
    }

    public GreatValueArrayList(int startingCapacity) {
        array = new Object[startingCapacity];
        numberOfElements = 0;
    }

    /**
     * Not cheating.
     */
    public GreatValueArrayList(Collection<? extends E> c) {
        array = c.toArray();
        numberOfElements = array.length;
    }

    public int size() {
        return numberOfElements;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(E e) {
        if (numberOfElements == array.length)
            grow();

        array[numberOfElements] = e;
        numberOfElements++;
    }

    /**
     * increase array size + 2 * 2
     */
    protected void grow() {
        grow((numberOfElements + 2) * 2);
    }

    /**
     * increase array size by given capacity
     *
     * @param capacity
     */
    protected void grow(int capacity) {
        array = Arrays.copyOf(array, capacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        Objects.checkIndex(index, numberOfElements); // actually throws a runtime exception upon failure!!!
        return (E) array[index];
    }

    public void remove(Object o) {
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i].equals(o))
                remove(i);
        }
    }

    // fast remove, stay private
    private void remove(int index) {
        Objects.checkIndex(index, numberOfElements);

        assert (index < numberOfElements);

        int shifts = numberOfElements - index - 1;
        System.arraycopy(array, index + 1, array, index, shifts);

        array[--numberOfElements] = null;
    }

    public void clear() {
        Arrays.fill(array, null);
        numberOfElements = 0;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean contains(E e) {
        if (isEmpty())
            return false;

        for (int i = 0; i < numberOfElements; i++) {
            if (array[i].equals(e))
                return true;
        }
        return false;
    }

    public boolean containsAll(Collection<? extends E> c) {
        for (E e : c) {
            if (!contains(e))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < numberOfElements)
            return (T[]) Arrays.copyOf(array, numberOfElements, a.getClass());

        // this is here not because I have ever needed it, but because we're cloning ArrayList and it does this.
        System.arraycopy(array, 0, a, 0, numberOfElements);

        return a;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, numberOfElements);
    }
}
