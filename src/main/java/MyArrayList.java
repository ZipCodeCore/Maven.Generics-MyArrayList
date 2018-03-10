import java.util.Arrays;

public class MyArrayList<T> {

    private T[] myArray;
    private Integer actualSize = 0;

    public MyArrayList() {
        this.myArray = (T[])  new Object[10];
    }

    public MyArrayList(int arrayLength){
        this.myArray = (T[]) new Object[arrayLength];
    }

    public T[] getMyArray() {
        return this.myArray;
    }

    public void add(T element){//add element to array
        resizeMyArray();
        this.myArray[actualSize++] = element;
    }

    public T get(int index){//get element at specified index
        return this.myArray[index];
    }

    public T remove(int index){// remove element at specified index return removed element
        T originalValue = this.myArray[index];
        int shiftOver = actualSize - index - 1;
        if (shiftOver > 0)
            System.arraycopy(this.myArray, index+1, this.myArray, index,
                    shiftOver);
        this.myArray[--actualSize] = null;

        return originalValue;
    }

    public T set(int index, T element){// replaces element at index with specific element
        T originalValue = this.myArray[index];
        this.myArray[index] = element;
        return originalValue;
    }

    public void clear(){// removes all elements from list
            for(int i = 0; i < actualSize; i++){
                this.myArray[i] = null;
            }
         actualSize = 0;
    }

    public boolean isEmpty(){// returns true if array has no elements
        return actualSize == 0;
    }

    public boolean contains(T elementWanted){//return true if array contains specified element
        for (T element : this.myArray){
            if (element == elementWanted){
                return true;
            }
        }
        return false;
    }

    public Integer size(){// returns size of array
        return actualSize;
    }

    public void resizeMyArray(){
        if (this.actualSize >= myArray.length -1) {
           this.myArray = Arrays.copyOf(myArray, myArray.length + myArray.length);
        }
    }


}
