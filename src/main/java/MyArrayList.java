
import java.util.Arrays;


public class MyArrayList <T> {

    protected T[] myFirstList;
    protected Integer objectCounter = 0;


    public MyArrayList() {
        this.myFirstList = (T[]) new Object[0];
    }


    public MyArrayList(int length) {
        this.myFirstList = (T[]) new Object[length];

    }

    public void add(T obj) {
        T[] temp = Arrays.copyOf(myFirstList,myFirstList.length + 1);
        temp[temp.length -1] = obj;
        myFirstList = temp;

    }

    public void add(int index, T obj) {
        this.myFirstList = Arrays.copyOf(this.myFirstList, this.myFirstList.length + 1);

        for (int i = this.myFirstList.length - 1; i > index; i--){
            this.myFirstList[i] = this.myFirstList[i-1];
        }
        this.myFirstList[index]= obj;
    }

    public void addAll(T[] obj) {
        T[] temp = Arrays.copyOf(myFirstList, myFirstList.length + obj.length);
        System.arraycopy(obj, 0, temp, myFirstList.length, obj.length);
        myFirstList = temp;
    }


    public void clear() {
        this.myFirstList = (T[]) new Object[0];

    }

    public boolean contains(T obj) {
        for (int x = 0; x < myFirstList.length; x++) {
            if (obj.equals(myFirstList[x])) {
                return true;
            }
        }
        return false;
    }

    public Integer size() {

        return this.myFirstList.length;
    }

    public T get(int index) {
        return this.myFirstList[index];
    }

    public Integer indexOf(T obj) {
        for (int x = 0; x < myFirstList.length; x++) {
            if (obj.equals(myFirstList[x])) {
                return x;
            }
            }
            return null;
        }

    public boolean isEmpty() {

        return (this.myFirstList.length == 0);
    }

    public void removeObj(T obj) {

        if(!contains(obj)){
            T[] sameArray = Arrays.copyOf(this.myFirstList, this.myFirstList.length);
            this.myFirstList = sameArray;
        }
        else {
            T[] removeArray = Arrays.copyOf(this.myFirstList, this.myFirstList.length-1);
            int removeIndex = indexOf(obj);
            for(int i = removeIndex; i < myFirstList.length-1; i++){
                removeArray[i] = myFirstList[i + 1];
            }
            this.myFirstList = removeArray;
        }
    }


    public void set(int index, T obj) {
        this.myFirstList[index] = obj;
    }

    public T[] toArray (T[] newArray) {
        return (T[]) Arrays.copyOf(this.myFirstList,this.myFirstList.length,newArray.getClass());

    }

    public T[] toArray() {
        T[] temp = (T[]) new Object[this.size()];
        for(int i =0; i<this.size(); i++) {
            temp[i] = this.get(i);
        }

        return myFirstList = temp;
    }




}
