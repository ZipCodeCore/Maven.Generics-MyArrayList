import java.util.Arrays;

public class MyArrayList <T> {


    private T[] myArray;

    public MyArrayList() {

    }
    public MyArrayList(T[] array) {
        myArray = Arrays.copyOf(array, array.length);

    }
    public MyArrayList(T[] array, int i) {
          myArray = Arrays.copyOf(array, i);
    }
    public void add(T element){
        int i = this.myArray.length;
        myArray = Arrays.copyOf(myArray, i + 1);
        myArray[i] = element;
    }
    public T get(int i){
        return this.myArray[i];
    }
    public void remove(T element){
        T[] newArray = Arrays.copyOf(myArray, myArray.length - 1);
        int i = 0;
        for(T t : myArray){
            if(!t.equals(element)){
                newArray[i] = t;
                i++;
            }
        }
        myArray = newArray;
    }
    public void set(int index, T element){
        T[] newArray = Arrays.copyOf(myArray, myArray.length + 1);
        for(int i = 0; i < newArray.length-1; i++){
            newArray[i < index ? i : i+1] = myArray[i];
            newArray[index] = element;
            }
        }

    public void clear(T[] array){

    }
    public boolean isEmpty(){
        if(myArray.length == 0){
            return true;
        }
        return false;
    }
    public boolean contains(T element){
        for(T t : myArray){
            if(t.equals(element))
                return true;

        }
        return false;
    }
}
