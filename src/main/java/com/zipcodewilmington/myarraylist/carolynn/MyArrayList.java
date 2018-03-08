package com.zipcodewilmington.myarraylist.carolynn;

import java.sql.Array;
import java.util.Arrays;

public class MyArrayList<T> {

    protected T[] myArrayList;

    public MyArrayList() {
        this.myArrayList = ((T[]) new Array[]{});
    }

    public MyArrayList(int size){
        this.myArrayList = (T[]) new Object[size];
    }

    public MyArrayList(T[] myArrayList) {
        this.myArrayList = myArrayList;
    }

    public T[] getMyArrayList() {
        return myArrayList;
    }

    public void add(T toBeAdded){
        T[] array = Arrays.copyOf(myArrayList, (1+myArrayList.length));
        array[array.length-1] = toBeAdded;
    }

    public void add(int index, T toBeAdded){
        T[] newArray = Arrays.copyOf(myArrayList, (myArrayList.length+1));
        for(int i = 0; i<newArray.length; i++){
            if(i < index) {
                newArray[i]= myArrayList[i];
            }
            else if(i == index) {
                newArray[i] = toBeAdded;
            } else if(i > index) {
                newArray[i] = myArrayList[i-1];
            }
        }
    }

}
