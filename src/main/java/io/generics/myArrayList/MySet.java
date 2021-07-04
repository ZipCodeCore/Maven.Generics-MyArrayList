package io.generics.myArrayList;

public class MySet <T> implements Collections<T> {

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
           if(mySet.countDuplicates(i)>1){
               setInput.remove(i);
           }
       }
       this.mySet = setInput;
    }

    public void setMySet(MyArrayList<T> setInput){
        this.mySet = setInput;
        for(int i = 0; i<mySet.size(); i++){
            if(mySet.countDuplicates(i)>1){
                setInput.remove(i);
            }
        }
        this.mySet = setInput;
    }

    public MyArrayList<T> getMySet() {
        return mySet;
    }

    @Override
    public boolean add(T value){
        if(!mySet.contains(value)) {
            mySet.add(value);
        }
        return true;
    }

    @Override
    public boolean addAll(T[] array){
        mySet.addAll(array);
        return true;
    }

    @Override
    public void clear(){
        mySet.clear();
    }

    @Override
    public boolean contains(T value){
        return mySet.contains(value);
    }

    @Override
    public boolean containsAll(T[] array){
        for(T object: array){
            if(!mySet.contains(object)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty(){
        return mySet.isEmpty();
    }

    @Override
    public boolean remove(T object){
        if(mySet.contains(object)) {
            mySet.remove(object);
            return true;
        }
        return false;
    }

    public boolean removeAll(T[] array){
        return true;
    }

    public boolean retainAll(T[] array){
        mySet.retainAll(array);
        return true;
    }

    public int size(){
        return mySet.size();
    }

    public T[] toArray(){
        return mySet.toMyArray();
    }


    public T set(int index, T object){
        return mySet.set(index, object);
    }

    @Override
    public String toString(){
        return String.valueOf(mySet);
    }

}