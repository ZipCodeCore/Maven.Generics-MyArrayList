

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
        int mid = myArrayList.length + 1;
        T[] tempArray = Arrays.copyOf(myArrayList, mid);
        tempArray[tempArray.length - 1] = toBeAdded;
        myArrayList = Arrays.copyOf(tempArray, tempArray.length);
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

    public T get(int index) {
        T temp = null;
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
            if (i < index) {
                tempArray[i] = myArrayList[i];
            } else if (i >= index) {
                if (i == myArrayList.length - 1) {
                    tempArray[i] = null;
                } else {
                    tempArray[i] = myArrayList[i + 1];
                }
            }
        }
        myArrayList = Arrays.copyOf(tempArray, tempArray.length - 1);
    }

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
        boolean doesContain = false;
        for (T val : myArrayList) {
            if (val.equals(value)) doesContain = true;
        }
        return doesContain;
    }

    public boolean isEmpty() {
        if (myArrayList.length == 0) return true;
        else return false;
    }

    public T[] subList(int from, int to) {
        myArrayList = Arrays.copyOfRange(myArrayList, from, to);
        return myArrayList;
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

