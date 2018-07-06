package io.generics.myArrayList;

import java.util.Arrays;
import java.lang.*;


public class MyArrayList<T> {

    private T[] myArrayList;

    private T element;


    public MyArrayList(int size) {
        this.myArrayList = (T[]) new Object[size];
    }

    public MyArrayList(T[] myArrayList) {
        this.myArrayList = myArrayList;
    }

    public MyArrayList() {
        this.myArrayList = (T[]) new Object[0];
    }


    public T[] getMyArrayList() {
        return this.myArrayList;
    }

    public boolean add(T toBeAdded) {
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        myArrayList[myArrayList.length - 1] = toBeAdded;
        return true;
    }

    public boolean add(int index, T toBeAdded) {
        if (myArrayList.length == 0) {
            myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
            myArrayList[0] = toBeAdded;
        } else {
            T[] newArray = Arrays.copyOf(myArrayList, myArrayList.length + 1);
            for (int i = 0; i < newArray.length; i++) {
                if (i < index) {
                    newArray[i] = myArrayList[i];
                } else if (i == index) {
                    newArray[i] = toBeAdded;
                } else if (i > index) {
                    newArray[i] = myArrayList[i - 1];
                }
            }
            myArrayList = Arrays.copyOf(newArray, newArray.length);
        }
        return true;
    }

    public boolean addAll(T[] toBeAdded) {
        int x = toBeAdded.length;
        int y = myArrayList.length;
        int counter = 0;
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + x);
        for (int i = y; i < myArrayList.length; i++) {
            myArrayList[i] = toBeAdded[counter];
            counter++;
        }
        return true;
    }

    public boolean addAll(int index, T[] toBeAdded){
        T[] tempArray = Arrays.copyOf(myArrayList, myArrayList.length + toBeAdded.length);
        int x = 0;
        for(int i = 0; i<myArrayList.length; i++){
            if(i<index){
                tempArray[i] = myArrayList[i];
            } else if(i >= index){
                tempArray[i] = toBeAdded[x];
                tempArray[myArrayList.length+x] = myArrayList[i];
                x++;
            }
        }
        myArrayList = Arrays.copyOf(tempArray, tempArray.length);
        return true;
    }

    public T get(int index) {
        T temp = myArrayList[0];
        for (int i = 0; i < myArrayList.length; i++) {
            if (i == index) {
                temp = myArrayList[i];
            }
        }
        return temp;
    }

    public boolean remove(int index) {
        for (int i = 0; i < myArrayList.length; i++) {
            if (i >= index) {
                if (i == myArrayList.length - 1) {
                    myArrayList[i] = null;
                } else {
                    myArrayList[i] = myArrayList[i + 1];
                }
            }
        }
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length - 1);
        return true;
    }

    public boolean remove(T object){
        boolean isPresent = false;
        int indexOfRemoved = 0;
        for(int i = 0; i< myArrayList.length; i++){
            if(myArrayList[i].equals(object)){
                myArrayList[i] = myArrayList[i+1];
                indexOfRemoved = i+1;
            }
            if(indexOfRemoved != 0 && i<myArrayList.length-1){
                myArrayList[i] = myArrayList[i+1];
            }
        }
        if(indexOfRemoved != 0)
            myArrayList = Arrays.copyOf(myArrayList,myArrayList.length-1);
        return isPresent;
    }

    public boolean removeAll(T[] objects) {
        return true;
    }

    public boolean retainAll(T[]objects){
        T[] tempArray = Arrays.copyOf(myArrayList, objects.length);
        int j = 0;
        int x = 0;
        for(int i = 0; i<myArrayList.length; i++){
            if(x<myArrayList.length-1) {
                if (myArrayList[i].equals(objects[j])) {
                    tempArray[x] = myArrayList[i];
                    x++;
                    j++;
                }
            } else if (x == myArrayList.length-1){
                if (myArrayList[i].equals(objects[j])) {
                    tempArray[x] = myArrayList[i];
                }
            }
        }
        myArrayList = Arrays.copyOf(tempArray, tempArray.length);
        return true;
    }

    public void clear() {
        myArrayList = Arrays.copyOf(myArrayList, 0);
    }

    public T set(int index, T valueReplacing) {
        T replaced = null;
        for (int i = 0; i < myArrayList.length; i++) {
            if (i == index) {
                replaced = myArrayList[i];
                myArrayList[i] = valueReplacing;
            }
        }
        return replaced;
    }

    public boolean contains(T value) {
        for (T val : myArrayList) {
            if (val.equals(value)) return true;
        }
        return false;
    }



    public boolean isEmpty() {
        if (myArrayList.length == 0) return true;
        return false;
    }

    public T[] subList(int from, int to) {
        return Arrays.copyOfRange(myArrayList, from, to);
    }

    public int size() {
        return myArrayList.length;
    }

    public int indexOf(T value){
        Integer x = null;
        for(int i = 0; i<myArrayList.length; i++){
            if(myArrayList[i].equals(value)){
                x=i;
                break;
            }
        }
        return x;
    }

    public int lastIndexOf(T value){
        Integer x = null;
        for(int i = myArrayList.length-1; i>=0; i--){
            if(myArrayList[i].equals(value)){
                x=i;
                break;
            }
        }
        return x;
    }

    public T[] toArray(T[] array){
        myArrayList = array;
        return myArrayList;
    }

    public Object[] toArray(){
        return myArrayList;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null) return false;
        if(getClass()!=object.getClass()) return false;
        T other = (T) object;
        return this.equals(other);
    }

    public Integer countDupes(int index){
        Integer count = 0;
        T val = myArrayList[index];
        for(int i = 0; i<myArrayList.length; i++){
            if(myArrayList[i].equals(val)) count++;
        }
        return count;
    }

}

