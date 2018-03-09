import java.util.Arrays;

public class MyArrayList <T> {
    private T[] data;

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        this.data = (T[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int n){
        this.data = (T[]) new Object[n];
    }

    public T get(int index){
        return data[index];
    }

    public T[] getArray(){
        return this.data;
    }

    public int size(){
        return this.data.length;
    }

    public void add(T entry){
        int index = this.data.length;
        data = Arrays.copyOf(data, index + 1);
        data[index] = entry;
    }

    @SuppressWarnings("unchecked")
    public void clear(){
        this.data = (T[]) new Object[0];
    }

    public void remove(T tToRemove){
        T[] newArray = Arrays.copyOf(this.data, this.data.length - 1);
        int index = 0;
        for (T t:this.data) {
            if (!t.equals(tToRemove)){
                newArray[index] = t;
                index++;
            }
        }
        this.data = newArray;
    }

    public void remove(int targetIndex){
        T[] newArray = Arrays.copyOf(this.data, this.data.length - 1);
        int currentIndex = 0;
        while (currentIndex != targetIndex){
            newArray[currentIndex] = this.data[currentIndex];
            currentIndex++;
        }
        for (int i = currentIndex; i < data.length-1; i++){
            newArray[i] = data[i+1];
        }
        this.data = newArray;
    }

    public void set(T[] newArray){
        this.data = newArray;
    }


}
