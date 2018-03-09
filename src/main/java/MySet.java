public class MySet<T> {

    private MyArrayList<T> mySet;

    public MySet() {
        this.mySet = new MyArrayList<>();
    }

    public void add(T object) {
        if (!mySet.contains(object)) {
            mySet.add(object);
        }
    }

    public void add(int index, T object) {
        if (!mySet.contains(object)) {
            mySet.add(index, object);
        }
    }

    public T get(int index) {
        return mySet.get(index);
    }

    public T remove(int index) {
        return mySet.remove(index);
    }

    public int size() {
        return mySet.size();
    }

    public void clear() {
        mySet.clear();
    }

    public boolean isEmpty() {
       return mySet.isEmpty();
    }

    public boolean contains(T object) {
        return mySet.contains(object);
    }

    public T set(int index, T object) {
        return mySet.set(index, object);
    }

}

