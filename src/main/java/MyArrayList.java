import java.util.Arrays;

public class MyArrayList<T> {

    private int arraySize;
    private int actualArraySize = 0;
    private int currentIndex = 0;
    protected T[] myArrayList;

    public MyArrayList() {
        this.myArrayList = (T[]) new Object[10];

    }

    public MyArrayList(int arraySize) {

        this.arraySize = arraySize;

    }

    public void add(T elementToAdd) {
        if(!contains(elementToAdd)){
            if(myArrayList.length-size()<5){
                ensureCapacity();
            }
            myArrayList[currentIndex]=elementToAdd;
            currentIndex++;
        }
//        if (this.myArrayList.length - size() < 5) {
//            ensureCapacity();
//        } else if (!contains(elementToAdd)) {
//            myArrayList[currentIndex] = elementToAdd;
//            currentIndex++;
//        }
    }

    public void add(int index, T elementToAdd) {
        if (myArrayList[index] == (null)) {
            myArrayList[index] = elementToAdd;
        } else {
                if(this.myArrayList.length-size()<5){
                    ensureCapacity();
                }
 //           T tempValue =myArrayList[index];
//            myArrayList[index]=elementToAdd;
            int counter = currentIndex;
            while (index < counter) {
                myArrayList[counter] = myArrayList[counter-1];
                counter--;
            }
            myArrayList[index]=elementToAdd;
//
 //           myArrayList[index + 1] = tempValue;


        }
        currentIndex++;
    }

    public void remove(int index) {
        if (index < size()) {
            myArrayList[index] = null;
            actualArraySize--;
        } else throw new ArrayIndexOutOfBoundsException();
        //reArrangeElementsAferRemoving(index);
    }
    public void remove(T elementToRemove){
        for(int i=0;i<myArrayList.length;i++){
            if(myArrayList[i].equals(elementToRemove)){
                remove(i);
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

    public void ensureCapacity() {
        myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 10);
    }

    public int size() {
        return currentIndex;
    }

    public void reArrangeElementsAferRemoving(int indexOfElementRemoved) {

        int startingIndex = indexOfElementRemoved;
        while (startingIndex < size()) {
            myArrayList[startingIndex] = myArrayList[startingIndex + 1];
            myArrayList[startingIndex + 1] = null;
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

    public boolean isEmpty() {
        if (currentIndex == 0) {
            return true;
        }
        return false;
    }

    public void trimToSize() {
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i].equals(null)) {
                remove(i);
            }
        }
    }


}
