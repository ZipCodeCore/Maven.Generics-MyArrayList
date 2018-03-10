import java.util.Arrays;

public class MySet<T> {

    MyArrayList<T> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
    }

    public MySet(int size) {
        this.mySet = new MyArrayList<>(size);
    }

    public T get(int index) {
        return mySet.get(index);
    }

    public T[] toArray() {
        return mySet.toArray();
    }

    public void add(T element) {
        if (!mySet.contains(element)) {
            mySet.add(element);
        }
    }

    public void remove(T element) {
        this.mySet.remove(element);
    }

    public void clear() {
        this.mySet.clear();
    }

    public boolean contains(T element) {
        return this.mySet.contains(element);
    }

    public boolean empty() {
        return this.mySet.empty();
    }

}