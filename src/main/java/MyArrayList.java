import java.util.ArrayList;
import java.util.Arrays;


public class MyArrayList <T> {

    protected T[] myFirstList;


    public MyArrayList() {
        this.myFirstList = (T[]) new Object[0];
    }


    public MyArrayList(int length) {
        this.myFirstList = (T[]) new Object[length];

    }

    public void add(T obj) {
        T[] temp = Arrays.copyOf(myFirstList,myFirstList.length + 1);
        temp[temp.length -1] = obj;
        myFirstList = temp;

    }

    public void add(int index, T obj) {
        T[] temp = Arrays.copyOf(myFirstList,myFirstList.length + 1);
        temp[index] = obj;
        myFirstList = temp;
    }

    public void addAll(T[] obj) {
        T[] temp = Arrays.copyOf(myFirstList, myFirstList.length + obj.length);
        System.arraycopy(obj, 0, temp, myFirstList.length, obj.length);
        myFirstList = temp;
    }


    public void clear() {
        this.myFirstList = (T[]) new Object[0];

    }

    public boolean contains(T obj) {
        for (int x = 0; x < myFirstList.length; x++) {
            if (obj.equals(myFirstList[x])) {
                return true;
            }
        }
        return false;
    }

    public Integer size() {

        return this.myFirstList.length;
    }

    public T get(int index) {
        return this.myFirstList[index];
    }

    public Integer indexOf(T obj) {
        for (int x = 0; x < myFirstList.length; x++) {
            if (obj.equals(myFirstList[x])) {
                return x;
            }
            }
            return null;
        }

    public boolean isEmpty() {

        return this.myFirstList.length == 0;
    }

    public void removeObj(T obj) {
        T[] temp = Arrays.copyOf(myFirstList, myFirstList.length -1);
        int count = 0;
        for (int x = 0; x < myFirstList.length; x++) {
            if(!obj.equals(myFirstList[x])) {
                temp[x] = myFirstList[x];
                count++;
            } else if (obj.equals(myFirstList[x])){
                count++;
                break;
            }

        }
        for(int i = count; i < myFirstList.length; i++) {
            temp[i-1] = myFirstList[i];
        }
        myFirstList = temp;

    }

    public void set(int index, T obj) {
        this.myFirstList[index] = obj;
    }

    public T[] toArray (T[] newArray) {
        return (T[]) Arrays.copyOf(this.myFirstList,this.myFirstList.length,newArray.getClass());

    }



}
