import java.util.Arrays;

public class MyArrayList<T> {

    private int arraySize;
    private int currentIndex = 0;
    protected T[] myArrayList;

    public MyArrayList() {
        this.myArrayList = (T[]) new Object[0];

    }

    public MyArrayList(int arraySize) {

        this.arraySize = arraySize;

    }

    public void add(T elementToAdd) {
        if(!contains(elementToAdd)){
            if(myArrayList.length-this.size()<5){
                this.ensureCapacity();
            }
            myArrayList[currentIndex]=elementToAdd;
            currentIndex++;
        }
    }

    public void add(int index, T elementToAdd) {
        if (myArrayList[index] == (null)) {
            myArrayList[index] = elementToAdd;
        } else {
                if(this.myArrayList.length-size()<5){
                    this.ensureCapacity();
                }
            int counter = currentIndex;
            while (index < counter) {
                myArrayList[counter] = myArrayList[counter-1];
                counter--;
            }
            myArrayList[index]=elementToAdd;
        }
        currentIndex++;
    }
    public void addAll(T[] arrayOfElementsToAdd){
            this.myArrayList = Arrays.copyOf(this.myArrayList,this.size()+arrayOfElementsToAdd.length);
            System.arraycopy(arrayOfElementsToAdd,0,myArrayList,this.size(),arrayOfElementsToAdd.length);
            currentIndex+=arrayOfElementsToAdd.length;
    }

    public void remove(int index) {
        if (index < size()) {
            myArrayList[index] = null;
            reSize(index);
        } else throw new ArrayIndexOutOfBoundsException();
    }
    public void remove(T elementToRemove){
        for(int i=0;i<size();i++){
            if(myArrayList[i].equals(elementToRemove)){
                remove(i);
                reSize(i);
            }
        }
    }

    public T get(int index) {
        if (index < currentIndex) {
            return myArrayList[index];

        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public void set(int index, T element) {
        myArrayList[index] = element;
    }

    public T[] clear() {
        myArrayList = (T[]) new Object[0];
        currentIndex=0;
        return myArrayList;

    }

    public void printElements() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            builder.append(myArrayList[i]);
            builder.append(" ");

        }
        System.out.println(builder.toString());

    }
    //expands the capacity of the array by 10
    public void ensureCapacity() {
        myArrayList = Arrays.copyOf(myArrayList, this.size() + 10);
    }
    //returns the actual number of objects in the array.
    public int size() {
        return currentIndex;
    }

    public void reSize(int indexOfElementRemoved) {

        int startingIndex = indexOfElementRemoved;
        while (startingIndex < size()) {
            myArrayList[startingIndex] = myArrayList[startingIndex + 1];
            myArrayList[startingIndex + 1] = null;
            startingIndex++;
        }
        currentIndex--;
    }

    public boolean contains(T element) {
        if (size() == 0) {
            return false;
        } else {
            for (int i = 0; i < size(); i++) {
                if (myArrayList[i].equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }
    //returns true if there no object is added to the array.
    public boolean isEmpty() {
        return this.size()==0;
    }

    public void trimToSize() {
        this.myArrayList= Arrays.copyOf(this.myArrayList,this.size());
    }

    public T[] toArray(T[] anArray){
        return (T[]) Arrays.copyOf(this.myArrayList,this.size(),anArray.getClass());
    }


}
