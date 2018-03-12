import java.util.Arrays;

class MyArrayList<E>{
    private E[] arrayList;

    public MyArrayList(){
        this.arrayList = (E[]) new Object[0];
    }

    public MyArrayList(int size){
        this.arrayList = (E[]) new Object[size];
    }

    public void add(E numberToAdd){
        for(int i = 0; i < arrayList.length; i++){
            if(arrayList[i]==null){
                arrayList[i] = numberToAdd;
                return;
            }
        }
        this.arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
        arrayList[arrayList.length - 1] = numberToAdd;
    }

    public void add1(int index, E numToAdd){
        E[] tempArray = Arrays.copyOf(arrayList, arrayList.length  + 1);
        if (tempArray[index].equals(null)) {
            tempArray[index] = numToAdd;
        } else {
            Integer counter = this.arrayList.length;
            while (index < counter) {
                tempArray[counter] = tempArray[counter - 1];
                counter--;
                }
            tempArray[index] = numToAdd;

        }
        this.arrayList = tempArray;
    }

    public E get(int index){
        return arrayList[index];
    }

    public E remove(int index){
        return arrayList[index];
    }

//    public E set(int index, E element){
//        return null;
//    }

    public void clear(){
        this.arrayList = Arrays.copyOf(arrayList,0);
    }

    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;

    }

    public boolean contains(E obj){
        for(E value : arrayList){
            if(value.equals(obj)){
                return true;
            }

        }
        return false;
    }

    public int size() {
        return arrayList.length;
    }

    public E[] toArray(E[] integers) {

        if(integers.length < arrayList.length){
            return ((E[]) Arrays.copyOf(arrayList, arrayList.length, integers.getClass()));
        }
        System.arraycopy(arrayList, 0, integers, 0, arrayList.length);
        if (integers.length > arrayList.length) {
            integers[arrayList.length] = null;
        }
        return integers;
    }

    public void set(E value, int index) {
        arrayList[index] = value;
    }
}

















































































//import java.util.*;
//
//public class MyArrayList <E>{
//    private E[] arrayList;
//
//
//    public MyArrayList(){
//        this.arrayList = (E[]) new Object[0];
//    }
//
//    public MyArrayList(Integer size){
//        arrayList = (E[]) new Object[size];
//
//    }
//
//    public void add(E value){
//        arrayList = Arrays.copyOf(arrayList, arrayList.length+1);
//        value = arrayList[arrayList.length-1];
//    }
//
//    public void add(int input, E value) {
//        arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
//        for(Integer i = arrayList.length-1; i > input; i--){
//            arrayList[i]=arrayList[i-1];
//        }
//        this.arrayList[input]=value;
//    }
//
//}
