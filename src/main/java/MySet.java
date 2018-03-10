

import java.sql.Array;

public class MySet <T> {

    private MyArrayList<T> mySet;

    public MySet() {
        this.mySet = new MyArrayList<>(16);
    }

    public MySet(int size) {
        this.mySet = new MyArrayList<>(size);
    }

    public MySet(T[] setInput) {
       this.mySet = new MyArrayList<>(setInput);
       for(int i = 0; i<mySet.size(); i++){
           if(mySet.countDupes(i)>1){
               mySet.remove(i);
           }
       }
    }

    public T[] getMySet() {
        return mySet.getMyArrayList();
    }

    public void add(T value){
        if(!mySet.contains(value)) mySet.add(value);
    }

    public void remove(int index){
        mySet.remove(index);
    }

    public int size(){
        return mySet.size();
    }

    public boolean contains(T value){
        return mySet.contains(value);
    }

    public boolean isEmpty(){
        return mySet.isEmpty();
    }

    public void clear(){
        mySet.clear();
    }

}