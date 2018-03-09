import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<T> {

    private T[] myArray;

    public MyArrayList() {
        this.myArray = (T[]) new Object[0];
    }

    public MyArrayList(int size) {
        this.myArray = (T[]) new Object[size];
    }

    public void set(int index, T element) {
        this.myArray[index] = element;
    }

    public int size() {
        return myArray.length;
    }

    public T get(int index) {
        return this.myArray[index];
    }

    public T[] toArray(T[] newArray) {
        return (T[]) Arrays.copyOf(this.myArray, this.myArray.length, newArray.getClass());
    }

    public void add(T element) {
        T[] addArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        addArray[addArray.length - 1] = element;
        this.myArray = addArray;
    }

    public void add(int index, T element) {
        T[] addArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        addArray[index] = element;
        this.myArray = addArray;
    }

    public void addAll(T[] element) {
        T[] result = Arrays.copyOf(myArray, myArray.length + element.length);
        System.arraycopy(element, 0, result, myArray.length, element.length);
        myArray = result;

    }

    public void remove() {

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

    public boolean isEmpty() {
        return this.myArray.length == 0;
    }

    public Integer indexOf(T element) {
        Integer count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (this.myArray[i].equals(element)) {
                return count;
            }
            count++;
        }
      return null;
    }
}
