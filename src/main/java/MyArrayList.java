import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private T[] myArray;

    public MyArrayList() {
        this.myArray = (T[]) new Object[0];
    }

    public MyArrayList(int size) {
        this.myArray = (T[]) new Object[size];
    }

    public int size() {
        return this.myArray.length;
    }

    public T get(int index) {
        return this.myArray[index];
    }

    public T[] toArray() {
        T[] newArray = (T[])new Object[this.size()];
        for(int i = 0; i < this.size(); i++){
            newArray[i] = this.get(i);
        }
        return newArray;
    }

    public void add(T element) {
        T[] addArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        addArray[addArray.length - 1] = element;
        this.myArray = addArray;
    }

    public void addToIndex(int index, T element) {
        T[] addArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        addArray[index++] = element;
        this.myArray = addArray;
    }

    public void remove(T element) {
        if (!contains(element)) {
            this.myArray = Arrays.copyOf(this.myArray, this.myArray.length);
        } else {
            T[] newArray = Arrays.copyOf(this.myArray, this.myArray.length - 1);
            int removeIndex = indexOf(element);
            for (int i = removeIndex; i < myArray.length - 1; i++) {
                newArray[i] = myArray[i + 1];
            }
            this.myArray = newArray;
        }
    }

    public void clear() {
        this.myArray = (T[]) new Object[0];
    }

    public boolean contains(T element) {
        for (int i = 0; i < myArray.length; i++) {
            if (this.myArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean empty() {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            count++;
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    public Integer indexOf(T element) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(element)) {
                return count;
            }
            count++;
        }
        return null;
    }
}
