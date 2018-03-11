import java.util.Arrays;

public class MyArrayList<E> {

    private E[] myArrayList;

    public MyArrayList() {
        myArrayList = (E[]) new Object[0];
    }

    public MyArrayList(Integer size) {

    }

    public E[] MyArrayList(int size) {
        return myArrayList = (E[]) new Object[size];
    }


    public void add(E elementToAppend) {
        E[] newArray = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        newArray[newArray.length - 1] = elementToAppend;
        this.myArrayList = newArray;
    }

    public void addAtIndex(Integer index, E elementToInsert) {
        E[] newArray = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        int x = 0;
        for(int i = 0; i < newArray.length; i++) {
            if(i != index) {
                newArray[i] = myArrayList[x];
                x++;
            } else {
                newArray[i] = elementToInsert;
            }
        }
        myArrayList = newArray;
    }

    public E get(Integer index) {
        return this.myArrayList[index];
    }


    public void remove(Integer index) {
        E[] newArray = Arrays.copyOf(myArrayList, myArrayList.length - 1);
        int x = 0;
        for(int i = 0; i < newArray.length; i++) {
            if( index != i) {
                newArray[x] = myArrayList[i];
                x++;
            }
        }
        this.myArrayList = newArray;
    }


    public E set(Integer index, E elementToStore) {  //index of element to replace; element to be stored
        return myArrayList[index] = elementToStore;
    }


    public void clear() {
        myArrayList = Arrays.copyOf(myArrayList, 0);
    }

    public boolean isEmpty() {
        if (myArrayList.length == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(E value) {
        for (E valueInArray : myArrayList) {
            if (valueInArray == value) {
                return true;
            }
        }
        return false;
    }

}
