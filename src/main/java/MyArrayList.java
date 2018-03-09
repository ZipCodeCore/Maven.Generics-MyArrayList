import java.util.Arrays;

public class MyArrayList <T> {

    private T[] arr;
    private T value;
    private T[] newArr;

    //Constructors
    public MyArrayList() {
        arr = (T[]) new Object[0];
    }

    public MyArrayList(int arrSize){
        arr = (T[]) new Object[arrSize];
    }


    //Methods
    public void add(T thing) {

        Integer count = 0;
        T[] newArr = Arrays.copyOf(arr, arr.length + 1);
            newArr[newArr.length-1] = thing;
            arr = newArr;
        }


    public T get(Integer i){
        this.value = this.arr[i];
        return this.value;
    }

    public void remove(T thing){

    }

    public void set(T thing){

    }

    public void clear(){

    }

    public boolean isEmpty(){
        return false;
    }

    public boolean contains(){
        return false;
    }


}
