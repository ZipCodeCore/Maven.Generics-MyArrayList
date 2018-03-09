import java.util.Arrays;


public class MySet <T>{

    protected MyArrayList<T> mySetList;


    public MySet() {
        this.mySetList = new MyArrayList<T>();
    }


    public MySet(T[] obj) {
        mySetList = new MyArrayList<>();
        for (T idx : obj) {
            if(!contains(idx)) {
                mySetList.add(idx);

            }
        }

    }

    public void add(T obj) {
        if(!contains(obj)) {
            mySetList.add(obj);

        }
    }

    public void clear() {
        mySetList.clear();
    }

    public boolean contains(T obj) {

        return mySetList.contains(obj);

    }

    public boolean isEmpty() {

        return mySetList.isEmpty();
    }

    public void remove(T obj) {
        mySetList.removeObj(obj);
    }

    public Integer size() {

        return mySetList.size();
    }


    public T[] toArray() {
       return mySetList.toArray();
    }


    public T[] toArray(T[] obj) {

        return mySetList.toArray(obj);
    }

}
