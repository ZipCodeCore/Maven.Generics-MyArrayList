import java.util.Arrays;

public class MyArrayList <E> {

    protected E[] inputArray;
    protected E value;

    public MyArrayList() {
        inputArray = (E[]) new Object[0];
    }

    public MyArrayList(int size) {
        inputArray = (E[]) new Object[size];
    }

    public void add(E valueToAdd) {
        E[] newArray = Arrays.copyOf(inputArray, inputArray.length + 1);
        newArray[newArray.length - 1] = valueToAdd;
        this.inputArray = newArray;
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
}
