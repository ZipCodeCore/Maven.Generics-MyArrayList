import java.util.Arrays;

public class MySet<T> {
    private T[] mainArray;

    public MySet() {
        this.mainArray = (T[]) new Object[0];
    }

    public T get(int index){
        return mainArray[index];
    }

    public void add(T valueToAdd) {
        if(contains(valueToAdd) == false) {
            this.mainArray = Arrays.copyOf(mainArray, mainArray.length + 1);
            mainArray[mainArray.length - 1] = valueToAdd;
        }
    }

    public void add(int indexValue, T valToAdd){
        T[] result = (T[]) new Object[mainArray.length + 1];
        int counter = indexValue + 1;
        for (int i = 0; i < indexValue; i++) {
            result[i] = mainArray[i];
        }
        result[indexValue] = valToAdd;
        for (int i = indexValue; i < mainArray.length; i++) {
            result[i + 1] = mainArray[indexValue];
        }
        mainArray = Arrays.copyOf(mainArray, mainArray.length + 1);
        for (int i = 0; i < result.length; i++) {
            mainArray[i] = result[i];
        }
    }

    public void remove(T valueToRemove) {
        boolean valueExists;
        do {
            for (int i = 0; i < mainArray.length; i++) {
                if (mainArray[i] == valueToRemove) {
                    removeValueAtIndex(i);
                }
            }
            valueExists = doesItReallyExist(valueToRemove);
        } while (valueExists == true);
    }

    private void removeValueAtIndex(int indexValue) {
        T[] result = (T[]) new Object[mainArray.length - 1];
        int counter = indexValue + 1;
        for (int i = 0; i < indexValue; i++) {
            result[i] = mainArray[i];
        }
        for (int i = indexValue + 1; i < mainArray.length; i++) {
            result[i] = mainArray[indexValue - 1];
        }
        mainArray = Arrays.copyOf(mainArray, mainArray.length - 1);
        for (int i = 0; i < result.length; i++) {
            mainArray[i] = result[i];
        }
    }

    private boolean doesItReallyExist(T valueToRemove) {
        for (T value : this.mainArray) {
            if (value == valueToRemove) {
                return true;
            }
        }
        return false;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < mainArray.length) {
            return (T[]) Arrays.copyOf(mainArray, mainArray.length, a.getClass());
        }
        System.arraycopy(mainArray, 0, a, 0, mainArray.length);
        if (a.length > mainArray.length) {
            a[mainArray.length] = null;
        }
        return a;
    }

    public int size() {
        return mainArray.length;
    }

    public void clear() {
        this.mainArray = Arrays.copyOf(mainArray, 0);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(T valueToLookFor) {
        boolean foundIt = false;
        for (T value : mainArray) {
            if (value.equals(valueToLookFor)) {
                foundIt = true;
            }
        }
        return foundIt;
    }
}
