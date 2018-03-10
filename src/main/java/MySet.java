import java.util.Arrays;

public class MySet<T> {

    MyArrayList<T> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
    }
    public MySet(T[] array){

    }

    public MySet(int size){
        mySet = new MyArrayList<>(size);
    }

    public void set(int index, T element){
        mySet.set(index, element);
    }

    public T get(int index) {
        return mySet.get(index);
    }

    public T[] toArray(T[] newArray) {
        return mySet.toArray(newArray);
    }

    public T[] toArray() {
        return mySet.toArray();
    }

    public void add(T element) {
        if (!mySet.contains(element)){
            mySet.add(element);
        }
    }
    public void add(int index, T element) {
        if (!mySet.contains(element)){
            mySet.add(index, element);
        }
    }

    public void remove(T element) {
        mySet.remove(element);
    }

    public void clear() {
        mySet.clear();
    }

    public boolean contains(T element) {
       return mySet.contains(element);
    }

    public boolean isEmpty() {
        return mySet.isEmpty();
    }


}
