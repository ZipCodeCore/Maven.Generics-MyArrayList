package io.generics.myArrayList;


import java.util.Arrays;

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

    public boolean add(T value){
        if(!mySet.contains(value)) {
            mySet.add(value);
        }
        return true;
    }

    public boolean add(int index, T value){
        if(!mySet.contains(value)) {
            mySet.add(index, value);
        }
        return true;
    }

    public boolean addAll(T[] toBeAdded){
        mySet.addAll(toBeAdded);
        return true;
    }

    public boolean addAll(int index, T[] toBeAdded){
        mySet.addAll(index, toBeAdded);
        return true;
    }


    public boolean remove(T object){
        if(mySet.contains(object)) {
            mySet.remove(object);
            return true;
        }
        return false;
    }

    public boolean retainAll(T[] array){
        mySet.retainAll(array);
        return true;
    }

    public int size(){
        return mySet.size();
    }

    public T[] toArray(){
        return mySet.getMyArrayList();
    }

    public T[] toArray(T[] array){
        return mySet.toArray(array);
    }

    public boolean contains(T value){
        return mySet.contains(value);
    }

    public boolean containsAll(T[] array){
        for(T object: array){
            if(!mySet.contains(object)){
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty(){
        return mySet.isEmpty();
    }

    public void clear(){
        mySet.clear();
    }


    public T set(int index, T object){
        return mySet.set(index, object);
    }

    @Override
    public String toString(){
        return String.valueOf(mySet);
    }

}