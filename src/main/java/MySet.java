public class MySet<E> {

    MyArrayList<E> myArrayList;

    public MySet() {
        myArrayList = new MyArrayList<>();
    }

    public void add(E valueToAdd) {
        if(!myArrayList.contains(valueToAdd)) {
            myArrayList.add(valueToAdd);
        }
    }

    public void add(E valueToAdd, Integer index) {
        if(!myArrayList.contains(valueToAdd)) {
            myArrayList.add(valueToAdd, index);
        }
    }

    public E get(Integer index) {
        return myArrayList.get(index);
    }

    public void remove(Integer index) {
        myArrayList.remove(index);
    }

    public void set(E valueToSet, Integer index) {
        myArrayList.set(valueToSet, index);
    }

    public void clear() {
        myArrayList.clear();
    }

    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }

    public boolean contains(E valueToCheck) {
        return myArrayList.contains(valueToCheck);
    }

    public Integer size() {
        return myArrayList.size();
    }

}
