import java.util.Arrays;
import java.util.ArrayList;

public class MyArrayList <E> {

    private E[] inputArray;
    private E value;
    private Integer sizeCounter = 0;

    public MyArrayList() {
        inputArray = (E[]) new Object[0];
    }

    public MyArrayList(int size) {
        inputArray = (E[]) new Object[size];
    }

    public void add(E valueToAdd) {
        if(sizeCounter < inputArray.length) {
            for(int i = 0; i < inputArray.length; i++) {
                inputArray[i] = valueToAdd;
            }
        } else {
            E[] newArray = Arrays.copyOf(inputArray, inputArray.length + 1);
            newArray[newArray.length - 1] = valueToAdd;
            this.inputArray = newArray;
        }
        sizeCounter++;
    }

    public void add(E valueToAdd, Integer index) {
        E[] newArray = Arrays.copyOf(inputArray, inputArray.length + 1);
        for(int i = 0, j = 0; i < newArray.length; i++) {
            if (i != index) {
                newArray[i] = inputArray[j];
                j++;
            } else {
                newArray[index] = valueToAdd;
            }
            this.inputArray = newArray;
        }
        sizeCounter++;
    }

    public E get(Integer index) {
        this.value = this.inputArray[index];
        return this.value;
    }

    public void remove(Integer index) {
        E[] newArray = Arrays.copyOf(inputArray, inputArray.length - 1);

        for(int i = 0, j = 0; i < this.inputArray.length; i++) {
            if(i != index) {
                newArray[j] = this.inputArray[i];
                j++;
            }
        }
        sizeCounter--;
        this.inputArray = newArray;
    }

    public void set(E valueToSet, Integer index) {
        this.inputArray[index] = valueToSet;
    }

    public void clear() {
        this.inputArray = (E[]) new Object[0];
    }

    public boolean isEmpty() {
        if(inputArray.length == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(E valueToCheck) {
        for(int i = 0; i < this.inputArray.length; i++) {
            if(inputArray[i] == valueToCheck) {
                return true;
            }
        }
        return false;
    }

    public Integer size() {
        return this.sizeCounter;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < sizeCounter)
            return (T[]) Arrays.copyOf(inputArray, sizeCounter, a.getClass());
        System.arraycopy(inputArray, 0, a, 0, sizeCounter);
        if (a.length > sizeCounter)
            a[sizeCounter] = null;
        return a;
    }
}
