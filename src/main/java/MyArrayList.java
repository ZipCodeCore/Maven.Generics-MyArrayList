import java.util.Arrays;


public class MyArrayList <T>{

    private T[] myArray;
    private int counter = 0;

    public MyArrayList(){
        this.myArray = (T[]) new Object[0];
    }

    public MyArrayList(int size){
        this.myArray = (T[]) new Object[size];
    }

    public <T> T[] toArray(T[] newArray){
        return (T[]) Arrays.copyOf(this.myArray, this.myArray.length, newArray.getClass());
    }

    public void set(int index, T element){
        this.myArray[index] = element;
    }

    public T get(int index){
        return this.myArray[index];
    }

    public Integer size(){
        return this.counter;
    }

    public void add(T element){
        T[] addArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        addArray[addArray.length - 1] = element;
        counter++;
        this.myArray = addArray;
    }

    public void add(int index, T element){

        this.myArray = Arrays.copyOf(this.myArray, this.myArray.length + 1);

        for (int i = this.myArray.length - 1; i > index; i--){
             this.myArray[i] = this.myArray[i-1];
            }
            this.myArray[index]= element;
        counter++;

    }

    public void addAll(T[] array){
        T[] addAllArray = Arrays.copyOf(this.myArray, this.myArray.length + array.length);
        System.arraycopy(array, 0, addAllArray, this.myArray.length, array.length);
        this.myArray = addAllArray;
        this.counter += array.length;
    }

    public void remove(int index){

        for (int i = index; i < this.myArray.length - 1; i++){
            this.myArray[i] = this.myArray[i + 1] ;
        }
        this.myArray = Arrays.copyOf(this.myArray, this.myArray.length - 1);
        this.counter--;
    }

    public boolean removeObject(T object){
        int count = 0;
        int remove = 0;
        if(!contains(object)){
            return false;
        }
        for (int i = 0; i < this.myArray.length; i++) {
            if (this.myArray[i] == object) {
                count++;
            }
        }
        T[] newArray = Arrays.copyOf(this.myArray, this.myArray.length - count);
        for (int j = 0; j < this.myArray.length; j++) {
            if (this.myArray[j] != object) {
                newArray[remove] = this.myArray[j];
                remove++;
            }
        }
        this.myArray = newArray;
        this.counter--;
        return true;
    }

    public void clear(){
        this.counter = 0;
        this.myArray = (T[]) new Object[0];
    }

    public boolean isEmpty(){
        return (this.myArray.length == 0);
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.myArray.length; i++) {
            if (value.equals(this.myArray[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T value){
        for(int i = 0; i < this.myArray.length; i++){
            if(this.myArray[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value){
        for(int i = this.myArray.length - 1; i > 0; i--){
            if(this.myArray[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

}
