import java.util.Arrays;

/**
 * A set by definition has no duplicates. Thus it should not be able to instantiate an array with anything other than
 * length of 0 because that would defeat the purpose of it being non duplicates.
 * BUT there is also the case that I should not be
 * dealing with the array, but rather the supposed set I am suppose to be making but I honestly have no idea how to
 * make that work so I'm just going to leave this at this for now.
 *
 */
public class MySet <T> {

    private int counter = 0;
    private T[] setArray;
    MyArrayList myArrayList;

    public MySet(){
        this.setArray = (T[]) new Object[0];
    }
//    public MySet(Integer i){
//        this.setArray = (T[]) new Object[i];
//    }
    public int size(){
        return this.counter;
    }
    public T get(int i){
        return this.setArray[i];
    }
    public void add(T value){
        if(!this.contains(value)) {
            T[] newArray = Arrays.copyOf(setArray, setArray.length + 1);
            counter++;
            newArray[newArray.length-1] = value;
            this.setArray = newArray;
        }
    }
    public void add(int i, T value){
        if(!this.contains(value)) {
            T[] newArray = Arrays.copyOf(setArray, setArray.length + 1);
            counter++;
            for (int index = 0, newIndex = 0; index < newArray.length; index++) {
                if (index != i) {
                    newArray[index] = setArray[newIndex];
                    newIndex++;
                }
                newArray[i] = value;
            }
            this.setArray = newArray;
        }
    }
    public boolean isEmpty(){
        if (setArray.length == 0){
            return true;
        }
        return false;
    }
    public boolean contains(T value){
        for (int i = 0; i < setArray.length;i++){
            if(setArray[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    public void remove(T value){
        T[] newArray = Arrays.copyOf(setArray, setArray.length-1);
        counter--;
        for (int i = 0, newIndex = 0; i < setArray.length; i++){
            if (setArray[i] != value){
                newArray[newIndex] = setArray[i];
                newIndex++;
            }
        }
        this.setArray = newArray;
    }
    public void clear(){
        this.setArray = (T[]) new Object[0];
        counter = 0;
    }

}
