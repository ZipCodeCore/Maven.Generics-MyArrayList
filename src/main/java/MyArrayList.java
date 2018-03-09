import java.util.Arrays;

public class MyArrayList<T> {

    private T[] myArray;

    public MyArrayList() {
        this.myArray = (T[])  new Object[0];
    }

    public MyArrayList(int arrayLength){
        this.myArray = (T[]) new Object[arrayLength];
    }

    public T[] getMyArray() {
        return myArray;
    }

    public void add(T element){//add element to array
        T[] newArray = Arrays.copyOf(myArray, myArray.length+1);
        newArray[newArray.length-1] = element;
        this.myArray = newArray;
    }

    public T get(int index){//get element at specified index
        return null;
    }

    public void remove(int index){// remove element at specified index

    }

    public void set(int index, T element){// replaces element at index with specific element

    }

    public void clear(){// removes all elements from list

    }

    public boolean isEmpty(){// returns true if array has no elements
        return false;
    }

    public boolean contains(T t){//return true if array contains specified element
        return false;
    }

    public Integer size(){// returns size of array
        return null;
    }
}
