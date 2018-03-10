import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {

    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[0];
    }

    public MyArrayList(int sizeOfArray) {
        array = (T[]) new Object[sizeOfArray];

    }

    public void add(T valueToAdd) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = valueToAdd;
        this.array = newArray;
    }

    public T get(int indexValue) {
        return array[indexValue];
    }

    public void remove(int indexValueToRemove) {
        T[] tempArray = Arrays.copyOf(array, array.length - 1);
        int j = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (indexValueToRemove != i) {
                tempArray[j] = array[i];
                j++;
            }
        }
        this.array = tempArray;
    }

    public void addAnywhere(T valueToAdd, int index) {
        T[] tempArray = Arrays.copyOf(array, array.length + 1);
        if (tempArray[index].equals(null)) {
            tempArray[index] = valueToAdd;
        } else {
            Integer counter = this.array.length;
            while (index < counter) {
                tempArray[counter] = tempArray[counter - 1];
                counter--;
            }
            tempArray[index] = valueToAdd;

        }
        this.array = tempArray;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public Boolean isEmpty() {
        if (array.length == 0) {
            return true;
        }
        return false;
    }

    public Boolean contains(T value) {
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i]))
                return true;
        }
        return false;
    }
}
