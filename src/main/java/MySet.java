public class MySet<E> {

    MyArrayList<E> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
    }

    public MySet(Integer size) {
        mySet = new MyArrayList<>(size);
    }

    public void add(E elementToAppend) {
        if (!mySet.contains(elementToAppend)) {
            mySet.add(elementToAppend);
        }
    }

    public void addAtIndex(Integer index, E elementToInsert) {
        if (!mySet.contains(elementToInsert)) {
            mySet.addAtIndex(index, elementToInsert);
        }
    }

    public E get(Integer index) {
        return mySet.get(index);
    }

    public void remove(Integer index) {
        mySet.remove(index);
    }

    public E set(Integer index, E elementToStore) {
        return mySet.set(index, elementToStore);
    }

    public void clear() {
        mySet.clear();
    }

    public boolean isEmpty() {
        return mySet.isEmpty();
    }

    public boolean contains(E value) {
        return mySet.contains(value);
    }
}
