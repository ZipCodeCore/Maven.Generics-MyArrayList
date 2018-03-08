
import java.util.Arrays;

public class MyArrayList<T> {



    private T[] myArray;




    public MyArrayList(){
        this.myArray = (T[]) new Object[0];

    }

    public MyArrayList(int size){
        this.myArray = (T[]) new Object[size];

    }

    public void add(T element){
        if(this.contains(null)){
            this.set(this.indexOf(null), element);
        }
        else{
            this.myArray = Arrays.copyOf(myArray, myArray.length+1);
            this.myArray[this.myArray.length-1] = element;
        }
    }

    public void add(int index, T element){
        if(this.myArray[index] == null){
            this.set(index,element);
        }
        else{
            this.myArray = Arrays.copyOf(myArray, myArray.length+1);
            T[] tempArray = Arrays.copyOf(myArray, myArray.length);
            for(int i = index+1; i<tempArray.length; i++){
                tempArray[i] = this.myArray[i-1];
            }
            tempArray[index] = element;
            this.myArray = tempArray;
        }
    }

    public void addAll(T[] elements){
        if(this.contains(null)){
            this.myArray = Arrays.copyOf(myArray, this.newArraySize(elements));
            int counter = this.indexOf(null) ;
            for(int i = 0 ; i<elements.length; i++){
                this.myArray[counter] = elements[i];
                counter++;
            }
        }
        else{
            for(T t : elements){
                this.add(t);
            }
        }

    }

    public void addAll(int index, T[] elements){

    }

    public void clear(){

    }

    public boolean contains(T element){
        for (T t : myArray){
            if (t.equals(element)) return true;
        }
        return false;
    }

    public void set(int index, T element){
        this.myArray[index] = element;

    }

    public T get(int index){
        return this.myArray[index];
    }

    public int indexOf(T element){
        for (int i = 0; i<myArray.length; i++){
            if (this.myArray[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return false;
    }

    public int lastIndexOf(T element){
        return 0;
    }

    public void remove(int index){

    }

    public void remove(T object){

    }

    public void removeRange(int startInded, int endIndex){

    }

    public int size(){
        return this.myArray.length;
    }

    public T[] subArray(int startIndex, int endIndex){
        return null;
    }

    public <T> T[] toArray(T[] newArray){

       return (T[]) Arrays.copyOf(this.myArray, this.myArray.length, newArray.getClass());

    }

    public void trimToSize(){

    }

    private int countNulls(){
        int counter = 0;
        for (T t : this.myArray){
            if (t == null){
                counter++;
            }
        }
        return counter;
    }

    private int newArraySize(T[] input){
        if(this.countNulls() >= input.length){
            return this.myArray.length;
        }
        else{
            return this.myArray.length + (input.length-this.countNulls());
        }
    }









}
