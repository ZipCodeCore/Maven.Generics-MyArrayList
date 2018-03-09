import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList <T> {

    private int counter = 0;
    private T[] array;

    public MyArrayList(){
        this.array = (T[]) new Object[0];
    }
    public MyArrayList(int i){
        this.array = (T[]) new Object[i];
    }
    public void add(T value){
        T[] newArray = Arrays.copyOf(array, array.length+1);
        counter++;
        newArray[newArray.length-1] = value;
        this.array = newArray;

    }
    public void add(int i, T value){
        T[] newArray = Arrays.copyOf(array, array.length+1);
        counter++;
        for (int index = 0, newIndex = 0; index < newArray.length; index++){
            if (index != i){
                newArray[index] = array[newIndex];
                newIndex++;
            }
            newArray[i] = value;
        }
        this.array = newArray;
    }
    public T get(int i){
        return array[i];
    }
    public void remove(int index){
        T[] newArray = Arrays.copyOf(array, array.length-1);
        counter--;
        for (int i = 0, newIndex = 0; i < array.length; i++){
            if (i != index){
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        this.array = newArray;
    }
    public void remove(T value){
        T[] newArray = Arrays.copyOf(array, array.length-1);
        counter--;
        for (int i = 0, newIndex = 0; i < array.length; i++){
            if (array[i] != value){
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        this.array = newArray;
    }
    public void set(int i, T value){
        array[i] = value;
    }
    public void clear(){
        this.array = (T[]) new Object[0];
        counter = 0;
    }
    public boolean isEmpty(){
        if (array.length == 0){
            return true;
        }
        return false;
    }
    public boolean contains(T value){
        for (int i = 0; i < array.length;i++){
            if(array[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return counter;
    }
    public <T> T[] toArray(T[] a) {
        if (a.length < array.length)
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(a, a.length, a.getClass());
        System.arraycopy(a, 0, a, 0, a.length);
        if (a.length > array.length)
            a[array.length] = null;
        return a;
    }
}
