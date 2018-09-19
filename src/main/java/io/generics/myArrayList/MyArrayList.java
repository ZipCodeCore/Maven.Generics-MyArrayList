package io.generics.myArrayList;

import java.util.Arrays;
import java.lang.*;


public class MyArrayList<T> implements Collections<T> {

    private T[] myArrayList;


    public MyArrayList(int size) {
        this.myArrayList = (T[]) new Object[size];
    }

    public MyArrayList(T[] myArrayList) {
        this.myArrayList = myArrayList;
    }

    public MyArrayList() {
        this.myArrayList = (T[]) new Object[0];
    }


    public T[] toMyArray() {
        return this.myArrayList;
    }

    @Override
    public boolean add(T toBeAdded) {
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        myArrayList[myArrayList.length - 1] = toBeAdded;
        return true;
    }


    public boolean addAt(int index, T toBeAdded) {
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        if (myArrayList.length == 1) {
            myArrayList[0] = toBeAdded;
        } else {
            T[] temp = Arrays.copyOf(myArrayList, myArrayList.length);
            for (int i = 0; i < myArrayList.length; i++) {
                if(i<index){
                    temp[i] = myArrayList[i];
                } else if (i > index) {
                    temp[i] = myArrayList[i - 1];
                } else if (i == index) {
                    temp[i] = toBeAdded;
                }
            }
            myArrayList = Arrays.copyOf(temp, temp.length);
        }
        return true;
    }

    @Override
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

    @Override
    public void clear() {
        myArrayList = Arrays.copyOf(myArrayList, 0);
    }

    @Override
    public boolean contains(T value) {
        for (T val : myArrayList) {
            if (val.equals(value)) return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(T[] array) {
        for(int i = 0; i<myArrayList.length;i++){
            int x = 0;
            for(int j = 0; j<array.length;j++){
                if(myArrayList[i].equals(array[j])) x++;
            }
            if(x>0) return false;
        }
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

    @Override
    public boolean isEmpty() {
        if (myArrayList.length == 0) return true;
        return false;
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

    @Override
    public boolean remove(T object){
        int x = -1;
        for(int i = 0; i< myArrayList.length; i++){
            if(myArrayList[i].equals(object)){
                myArrayList[i] = myArrayList[i+1];
                x = i;
            }
            if(x !=-1 && i>x && i<myArrayList.length-1){
                myArrayList[i] = myArrayList[i+1];
            }
        }
        if(x >= 0) {
            myArrayList = Arrays.copyOf(myArrayList, myArrayList.length - 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(T[] objects) {
        return true;
    }


    public void replace(int index, T valueReplacing){
        for(int i = 0; i< myArrayList.length; i++){
            if(i==index){
                myArrayList[i] = valueReplacing;
            }
        }
    }

    @Override
    public boolean retainAll(T[]objects){
        T[] tempArray = Arrays.copyOf(myArrayList, myArrayList.length);
        int x = 0;
        for(int i = 0; i<myArrayList.length; i++){
            for(int j = 0; j<objects.length; j++) {
                if (i < myArrayList.length - 1) {
                    if (myArrayList[i].equals(objects[j])) {
                        tempArray[x] = myArrayList[i];
                        x++;
                    }
                } else if (i == myArrayList.length - 1) {
                    if (myArrayList[i].equals(objects[j])) {
                        tempArray[x] = myArrayList[i];
                    }
                }
            }
        }
        myArrayList = Arrays.copyOf(tempArray, x+1);
        return true;
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

    public T[] subList(int from, int to) {
        return Arrays.copyOfRange(myArrayList, from, to);
    }

    public int size() {
        return myArrayList.length;
    }


    @Override
    public Object[] toArray(){
        return myArrayList;
    }

//    @Override
//    public T[] toArray(T[] array){
//        return myArrayList;
//    }

    public void trimToSize(){

    }

    public Integer countDuplicates(int index){
        Integer count = 0;
        T val = myArrayList[index];
        for(int i = 0; i<myArrayList.length; i++){
            if(myArrayList[i].equals(val)) count++;
        }
        return count;
    }

}

