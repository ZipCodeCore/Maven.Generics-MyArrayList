package com.zipcodewilmington.myarraylist.carolynn;

import java.sql.Array;
import java.util.Arrays;

public class MyArrayList<T> {

    protected T[] myArrayList;



    public MyArrayList() {
        this.myArrayList = (T[])new Array[0];

    }

    public MyArrayList( int size){
        myArrayList = (T[])new Array[size];
    }

    public MyArrayList(T[] myArrayList) {
        this.myArrayList = myArrayList;
    }

    public T[] getMyArrayList() {
        return myArrayList;
    }

    public void add(T toBeAdded){
        int mid = myArrayList.length+1;
        myArrayList = Arrays.copyOf(this.myArrayList, mid);
        myArrayList[myArrayList.length-1] = toBeAdded;
    }

    public void add(int index, T toBeAdded){
        T[] newArray = Arrays.copyOf(myArrayList, myArrayList.length+1);
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
        myArrayList = Arrays.copyOf(newArray, newArray.length);
    }

    public T get(int index){
        T temp = null;
        for(int i = 0; i<myArrayList.length; i++){
            if(i == index) {
                temp = myArrayList[i];
            }
        }
        return temp;
    }

    public void remove(int index) {
        T[] tempArray = Arrays.copyOf(myArrayList, myArrayList.length);
        for(int i = 0; i<myArrayList.length; i++){
            if(i < index) {
                tempArray[i]= myArrayList[i];
            }
            else if(i >= index) {
                if(i == myArrayList.length-1){
                    tempArray[i] = null;
                } else {
                    tempArray[i]= myArrayList[i+1];
                }
            }
        }
        myArrayList= Arrays.copyOf(tempArray, tempArray.length-1);
    }

    public void clear(){
        myArrayList = Arrays.copyOf(myArrayList, 0);
    }

}
