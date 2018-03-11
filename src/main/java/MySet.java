
import java.util.HashSet;
import java.util.Iterator;

public class MySet<E>{

    MyArrayList<E> mySet;

    public MySet() {
        mySet = new MyArrayList<>(5);
    }

    public MySet(int size){
        mySet = new MyArrayList<>(size);
    }

    public E get(int index) {
        return mySet.get(index);
    }

    public void add(E e) {
        if (!mySet.contains(e)) mySet.add(e);
    }


    public void addAll(E[] eray) {
        for (int i = 0; i < eray.length; i++) {
            mySet.add(eray[i]);
        }
    }

    public void clear() {
        this.mySet.clear();
    }

    public boolean contains(E e) {
       return this.mySet.contains(e);

    }

    public boolean isEmpty() {
        return this.mySet.isEmpty();
    }

    public void remove(E e) {
        this.mySet.remove(e);
    }

    public int size() {
        return this.mySet.size();
    }

    public E[] toArray() {
        return mySet.toArray();
    }


}
