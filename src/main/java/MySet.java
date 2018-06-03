

import java.sql.Array;

public class MySet <T> {

    private MyArrayList<T> mySet;

    public MySet() {
        this.mySet = new MyArrayList<>(16);
    }

    public MySet(int size) {
        this.mySet = new MyArrayList<>(size);
    }

    public MySet(MyArrayList<T> setInput) {
       this.mySet = setInput;
       for(int i = 0; i<mySet.size(); i++){
           if(mySet.countDupes(i)>1){
               mySet.remove(i);
           }
       }
    }

    public MyArrayList<T> getMySet() {
        return mySet;
    }

    public void add(T value){
        if(!mySet.contains(value)) mySet.add(value);
    }

    public void add(int index, T value){
        if(!mySet.contains(value)) mySet.add(index, value);
    }

    public void remove(int index){
        mySet.remove(index);
    }

    public int size(){
        return mySet.size();
    }

    public T[] toArray(){
        return mySet.getMyArrayList();
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

    public T get(int index){
        return mySet.get(index);
    }

    

}