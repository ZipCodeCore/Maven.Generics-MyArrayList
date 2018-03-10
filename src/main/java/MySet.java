import java.util.Arrays;

public class MySet<E> {

    //
    private MyArrayList<E> mySet;
    private Integer size = 0;

    //Create a empty list with size of the parameter
    public MySet (int length){
        mySet = new MyArrayList<>(length);
    }

    public MySet() {
        mySet = new MyArrayList<>();
    }

    public Integer size() {
        return this.size;
    }


    public void add(E element){
        if(!mySet.contains(element)){
            mySet.add(element);
            size++;
        }
    }

    public E get(Integer index) {
       return mySet.get(index);
    }

    public Integer indexOf (E object){
        return mySet.indexOf(object);
    }
    public void remove(int index) {
        mySet.remove(index);

    }

    public void set(int index, E element){
       mySet.set(index, element);
    }
    public void clear() {
        mySet.clear();
        size = 0;
    }

    public boolean isEmpty() {
        return mySet.isEmpty();
    }

    public boolean contains (E object){
        return mySet.contains(object);

    }
}
