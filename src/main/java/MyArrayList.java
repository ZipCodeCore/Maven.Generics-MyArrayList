import java.util.Arrays;

public class MyArrayList <T> {

    private T[] arr;
    private T value;


    //Constructors
    public MyArrayList() {
        arr = (T[]) new Object[0];
    }

    public MyArrayList(int arrSize){
        arr = (T[]) new Object[arrSize];
    }


    //Methods
    public void add(T thing) {

        T[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length-1] = thing;
        arr = newArr;
    }


    public T get(Integer i){
        this.value = this.arr[i];
        return this.value;
    }

    public void remove(T thing) {
        if ( arr.length > 0){
            T[] newArr = Arrays.copyOf(arr, arr.length - 1);
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] != thing) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            arr = newArr;
        }
    }
    public void set(Integer i, T thing){
        this.value = this.arr[i];
        arr[i] = thing;

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
