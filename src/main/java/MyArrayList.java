

import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.*;


public class MyArrayList<T> {

    private T[] myArrayList;


    public MyArrayList(int size) {
        this.myArrayList = (T[]) new Object[size];
    }

    public MyArrayList(T[] myArrayList) {
        this.myArrayList = myArrayList;
    }

    public MyArrayList() {
        this.myArrayList =(T[]) new Object[0];
    }


    public T[] getMyArrayList() {
        return this.myArrayList;
    }

    public void add(T toBeAdded) {
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        myArrayList[myArrayList.length - 1] = toBeAdded;
    }

    public void add(int index, T toBeAdded) {
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
    }

    public void addAll(T[] toBeAdded){
        int x = toBeAdded.length;
        int y = myArrayList.length;
        int counter = 0;
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length+x);
        for(int i = y; i<myArrayList.length; i++) {
            myArrayList[i] = toBeAdded[counter];
            counter++;
        }
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

    public void remove(int index) {
        T[] tempArray = Arrays.copyOf(myArrayList, myArrayList.length);
        for (int i = 0; i < myArrayList.length; i++) {
            if (i >= index) {
                if (i == myArrayList.length - 1) {
                    myArrayList[i] = null;
                } else {
                    myArrayList[i] = myArrayList[i + 1];
                }
            }
        }
        myArrayList = Arrays.copyOf(myArrayList, tempArray.length - 1);
    }

//    public void removeAll(T[] toBeRemoved){
//        for(T myItem: myArrayList)
//            for(T toRemove: toBeRemoved){
//            if(myItem.equals(toRemove)){
//                myItem = null;
//            }
//        }
//        int count = 0;
//        for(int i = 0; i<myArrayList.length; i++){
//            if(myArrayList[i] == null){
//                if(i == myArrayList.length-1){
//                    count++;
//                } else {
//                    myArrayList[i] = myArrayList[i+1];
//                    count++;
//                }
//            }
//        }
//        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length-count);
//    }

    public void clear() {
        myArrayList = Arrays.copyOf(myArrayList, 0);
    }

    public T set(T valueReplacing, int index) {
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


    public Integer countDupes(int index){
        Integer count = 0;
        T val = myArrayList[index];
        for(int i = 0; i<myArrayList.length; i++){
            if(myArrayList[i].equals(val)) count++;
        }
        return count;
    }

}

