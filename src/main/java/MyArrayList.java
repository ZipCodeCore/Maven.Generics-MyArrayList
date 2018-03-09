import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T>  {
    private T[] myArrayList;


    public MyArrayList() {
        this.myArrayList = (T[]) new Object[0];
    }

    public MyArrayList(int size) {
        this.myArrayList = (T[]) new Object[size];
    }

    public boolean add(T object) {
        this.myArrayList = Arrays.copyOf(this.myArrayList, this.size() + 1);
        this.myArrayList[this.size() - 1] = object;
        return true;
    }

    public void add(int index, T object) {
        this.myArrayList = Arrays.copyOf(this.myArrayList, this.size() + 1);
        this.myArrayList[index] = object;
    }

    public T get(int index) {
        return this.myArrayList[index];
    }

    public T remove(int index) {
        T oldValue = this.myArrayList[index];
        int numMoved = size() - index - 1;
        if (numMoved > 0)
            System.arraycopy(this.myArrayList, index + 1, this.myArrayList, index,
                    numMoved);
        this.myArrayList[size() - 1] = null;

        return oldValue;
    }

    public int size() {
        return this.myArrayList.length;
    }

    public void clear() {
        for (int i = 0; i < this.size(); i++) {
            this.myArrayList[i] = null;
        }
    }

    public boolean isEmpty() {
        for(T element: this.myArrayList) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(T object) {
        for(T element: this.myArrayList) {
            if(element.equals(object)) {
                return true;
            }
        }
        return false;
    }

    public T set(int index, T object) {
        this.myArrayList = Arrays.copyOf(this.myArrayList, this.size());
        this.myArrayList[index] = object;
        return object;
    }
}
