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

    public T[] getArrayList() {
        T[] arrayList = (T[]) new Object[currentIndex + 1];

        for (int i = 0; i < currentIndex + 1; i++) {
            arrayList[i] = this.array[i];
        }
        return arrayList;
    }

    public void add(T aThing) {

        if (currentIndex <= capacity) {
            this.array[currentIndex] = aThing;
            currentIndex++;
        } else {
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
            this.array[currentIndex] = aThing;
            currentIndex++;
        }

    }

    public T get(int index) {

        return this.array[index];

    }

    public void remove(T athing) {

        T[] newArray = Arrays.copyOf(this.array, this.array.length - 1);

        int secondIterator = 0;

        for (int i = 0; i < this.array.length; i++) {
            if (!this.array[i].equals(athing)) {
                newArray[secondIterator] = this.array[i];
                secondIterator++;
            }
        }

        this.array = newArray;

    }

    public void set(int index, T aThing) {

        this.array[index] = aThing;

    }

    public void clear() {


    }

    public boolean isEmpty() {
        return true;
    }

    public boolean contains(T aThing) {

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(aThing)) {
                return true;
            }
        }
        return false;

    }

    public int size() {
        return this.currentIndex + 1;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }
}
