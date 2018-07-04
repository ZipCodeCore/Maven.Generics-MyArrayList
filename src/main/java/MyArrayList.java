import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<T> {

    T[] myArrayList;

    public MyArrayList() {
        this.myArrayList = (T[]) new Object[0];
    }

    public MyArrayList(Integer input) {
        myArrayList = (T[]) new Object[input];

    }


    public void add(T input) {
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        myArrayList[myArrayList.length - 1] = input;

    }

    public void add(Integer index, T input){

        //T oldValue = myArrayList[index];
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        for (Integer i= myArrayList.length-1; i > index; i--){
            myArrayList[i] = myArrayList[i-1];
        }
        myArrayList[index]= input;

    }

    public T get(Integer index) {
        return myArrayList[index];
    }

//    public T remove(int index){
//        T answer = myArrayList[index];
//        myArrayList= Arrays.copyOf(myArrayList, myArrayList.length -1);
//        myArrayList.
//        return answer;
//
//    }

    public void remove(T itemToRemove) {
        T[] answerArray = Arrays.copyOf(myArrayList, myArrayList.length - 1);
        int count = 0;

        for (T element : myArrayList) {
            if (!element.equals(itemToRemove)) {
                answerArray[count] = element;
                count++;
            }
        }
        myArrayList = answerArray;

    }

    public void set(Integer indexToBeChanged, T newVal) {
        myArrayList[indexToBeChanged] = newVal;

    }

    public void clear() {
        myArrayList = Arrays.copyOf(myArrayList, 0);

    }

    public boolean isEmpty() {
        boolean answer = false;

        if (myArrayList.length == 0) {
            answer = true;
        }
        return answer;
    }

    public boolean contains(T value) {
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i].equals(value)) {
                return true;
            }
        }
        return false;

    }

    public Integer size(){
        Integer size = myArrayList.length;

        return size;
    }
}
