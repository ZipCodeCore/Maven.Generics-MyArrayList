import java.util.Arrays;

public class MyArrayList <E> {
    //NO use of List, ArrayList, or any Collection, use ONLY Arrays
    private E[] myArrayList;
    private Integer size = 0;
    private final Integer DEFAULTINCREMENTOR = 10;

    //Create a empty list with size of the parameter
    public MyArrayList (int length){
        myArrayList = (E[]) new Object[length];
    }

    public MyArrayList() {
        myArrayList = (E[]) new Object[this.DEFAULTINCREMENTOR];
    }

    public Integer size() {
        return this.size;
    }


    public void add(E element){
        if (size() < myArrayList.length){
            myArrayList[size()]=element;
        }
        else if(size() == myArrayList.length){
            E[] newArray = Arrays.copyOf(myArrayList, myArrayList.length+this.DEFAULTINCREMENTOR );
            newArray[size()+1]=element;
            myArrayList = newArray;
            }
        this.size++;
    }

    public void add(int index, E element){
        if (size() < myArrayList.length){
            for(int i = index - 1; i > 0; i--) {
                myArrayList[i] = myArrayList[i - 1];
            }
            myArrayList[index]=element;
        }
        else if(size() == myArrayList.length){
            E[] newArray = Arrays.copyOf(myArrayList, myArrayList.length+this.DEFAULTINCREMENTOR );
            for(int i = index - 1; i > 0; i--) {
                myArrayList[i] = myArrayList[i - 1];
            }
            newArray[index]=element;
            myArrayList = newArray;
        }
        this.size++;
    }

    public E get(Integer index) {
       return myArrayList[index];
    }

    public Integer indexOf (E object){
        for (int i = 0; i < size(); i++) {
            if(myArrayList[i].equals(object)){
                return i;
            }
        }
        return -1;
    }
    public void remove(int index) {
        E[] newArray = Arrays.copyOf(myArrayList, myArrayList.length-1 );
        myArrayList[index] = null;
        int newArrIndex = 0;
        for (int i = 0; i <size() ; i++) {
            if (myArrayList[i] != null) {
                newArray[newArrIndex] = myArrayList[i];
                newArrIndex++;
            }
        }
        myArrayList = newArray;
        this.size--;

    }

    public void set(int index, E element){
        myArrayList[index] = element;
    }
    public void clear() {
        for (int i = 0; i < size(); i++) {
            myArrayList[i] = null;
        }
        this.size = 0;

    }

    public boolean isEmpty() {
        if(size() < 1){
            return true;
        }
        return false;
    }

    public boolean contains (E object){
        for (int i = 0; i <size() ; i++) {
            if(myArrayList[i].equals(object)){
                return true;
            }
        }
        return false;

    }

    public String printOut(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <size ; i++) {
           sb.append(myArrayList[i]+ " ");
        }
       return sb.toString();
    }
}
