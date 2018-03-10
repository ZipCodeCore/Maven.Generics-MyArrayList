

import java.sql.Array;

public class MySet <T> {

    private MyArrayList<T> mySet;

    public MySet(T[] setInput) {
       this.mySet = new MyArrayList<>(setInput);
       for(int i = 0; i<mySet.size(); i++){
           if(mySet.countDupes(i)>1){
               mySet.remove(i);
           }
       }
    }

    public MyArrayList getMySet() {
        return mySet;
    }

    public void add(T value){
        mySet.add(value);
    }
}