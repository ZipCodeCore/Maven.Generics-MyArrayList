import java.util.Arrays;

public class MyArrayList<T> {
    private T[] genericArray;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.genericArray = (T[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int genericArraySize) {
        this.genericArray = (T[]) new Object[genericArraySize];
    }

    public void add(T value) {
        T[] outputArray = Arrays.copyOf(genericArray, genericArray.length + 1);
        outputArray[outputArray.length - 1] = value;
        this.genericArray = outputArray;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return genericArray[index];
    }

    public T[] remove(int valueToRemove) {
        T[] outputArray = Arrays.copyOf(genericArray, genericArray.length - 1);
        for (int i = 0; i < genericArray.length; i++) {
            if (!genericArray[i].equals(valueToRemove)) {
                outputArray = Arrays.copyOf(outputArray, outputArray.length + 1);
                outputArray[outputArray.length - 1] = genericArray[i];
            }
        }
        return outputArray;
    }

    public T set(int index, T indexValue) {
        T firstValue = this.genericArray[index];
        this.genericArray[index] = indexValue;
        return firstValue;
    }

    public void clear() { //clear all the values or 'elements' with the array, this should return null with no values after logic
        for (int i = 0; i < genericArray.length; i++) {
            genericArray[i] = null;
        }
    }

    public boolean isEmpty() { //if the array is empty return true otherwise return false
        if (genericArray.length == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(T desiredValue) {
        for (int i = 0; i < genericArray.length; i++) {
            if (desiredValue.equals(genericArray[i])) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return this.genericArray.length;
    }

    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] value) {
        String[] str = {"This", "is", "confusing", "af"};
        if (genericArray.length < size)
            return (T[]) Arrays.copyOf(str, size, value.getClass());
        return (T[]) str;
    }
}