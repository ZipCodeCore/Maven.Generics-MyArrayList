import java.util.Arrays;

public class MyArrayList <T>{

    private T[] myArrayList;


    public MyArrayList(){
        myArrayList = (T[]) new Object[0];
    }

    public MyArrayList(int size){
        myArrayList = (T[]) new Object[size];
    }

    public void add(T value){
        T[] newArray = Arrays.copyOf(myArrayList, myArrayList.length +1);
        newArray[newArray.length -1] = value;
        this.myArrayList = newArray;
    }

    public void add(T value, int index){
        T[] newArray = Arrays.copyOf(myArrayList, myArrayList.length +1);
        int j = 0;
        for (int i = 0; i <newArray.length; i++){
            if (i!= index){
                newArray[i] = myArrayList[j];
                j++;
            }else {
                newArray[i] = value;
            }
        }
        myArrayList =newArray;
    }

    public T get(int location){
        return this.myArrayList[location];
    }

    public void remove(int index){
        T[] newArray = Arrays.copyOf(myArrayList, myArrayList.length -1);
        int j = 0;
        for (int i = 0; i < newArray.length; i++){
            if (index != i){
                newArray[j] = myArrayList[i];
                j++;
            }
        }
        this.myArrayList = newArray;
    }

    public boolean isEmpty(){
        if (myArrayList.length == 0){
            return true;
        }
        return false;
    }

    public void clear(){
        myArrayList = Arrays.copyOf(myArrayList, 0);
    }

    public void set(T value, int index){
        myArrayList[index] = value;
    }

    public boolean contains(T value){
        for (T valueInArray: myArrayList) {
            if (valueInArray.equals(value)){
                return true;
            }
        }
        return false;
    }

}
