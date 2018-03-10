import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {

    private T[] array;
    private int capacity;
    private int currentIndex = 0;

    public MyArrayList() {
        this.array = (T[]) new Object[10];
        this.capacity = 10;
    }

    public MyArrayList(int size) {
        this.array = (T[]) new Object[size];
        this.capacity = size;
    }

    public T[] getArray() {
        return this.array;
    }

    public void add(T aThing) {

        if (currentIndex < capacity) {
            this.array[currentIndex] = aThing;
            currentIndex++;
        } else {
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
            this.array[currentIndex] = aThing;
            currentIndex++;
        }
    }

    public void add(T aThing, int index) {
        System.arraycopy(this.array, index, this.array, index + 1, ((this.array.length - index) - 1));
        this.array[index] = aThing;
        currentIndex++;
    }

    public T get(int index) {
        return this.array[index];
    }

    public void remove(int index) {
        System.arraycopy(this.array, index + 1, this.array, index, (this.array.length - 1) - index);
        this.array[this.array.length - 1] = null;
        this.currentIndex--;
    }

    public void remove(T aThing) {
        System.arraycopy(this.array,indexOf(aThing) + 1, this.array, indexOf(aThing),(this.array.length - 1) - indexOf(aThing));
        this.array[this.array.length - 1] = null;
        this.currentIndex--;
    }

    public void set(int index, T aThing) {
        this.array[index] = aThing;
    }

    public void clear() {

        for (int i = 0; i < size() + 1; i++) {
            this.array[i] = null;
        }

        this.currentIndex = 0;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(T aThing) {

        for (int i = 0; i < size(); i++) {
            if (this.array[i].equals(aThing)) {
                return true;
            }
        }
        return false;

    }

    public int size() {
        return this.currentIndex;
    }


    public int indexOf(T aThing) {

        int indexOf = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (array[i] == (aThing)) {
                indexOf = i;
            }
        }
        return indexOf;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public T[] getArrayList() {
        T[] arrayList = (T[]) new Object[currentIndex + 1];

        for (int i = 0; i < currentIndex + 1; i++) {
            arrayList[i] = this.array[i];
        }
        return arrayList;
    }


}
