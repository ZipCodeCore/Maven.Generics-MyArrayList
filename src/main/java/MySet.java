public class MySet <K> {

    private MyArrayList<K> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
    }

    public void add(K obj){
        if (!mySet.contains(obj)) {
            mySet.add(obj);
        }
    }

    public void remove(int index) {
        mySet.remove(index);
    }

    public K get(int index) {
        return mySet.get(index);
    }

    public void set(int index, K obj){

        mySet.set(index, obj);
    }

    public int size() {
        return mySet.size();
    }

    public boolean contains (K obj){
        return mySet.contains(obj);
    }

    public void clear() {
        mySet.clear();
    }

    public boolean isEmpty() {
        return mySet.isEmpty();
    }


//    public K[] toArray(K[] values) {
//        return (K[]) Arrays.copyOf(mySet, inputArray.length, newArray.getClass());
//
//    }
}

