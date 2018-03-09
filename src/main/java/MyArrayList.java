

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class MyArrayList<T> {



    private T[] myArray;
    private int numberOfObjects;



    public MyArrayList(){
        this.myArray = (T[]) new Object[0];

    }

    public MyArrayList(int capacity){
        this.myArray = (T[]) new Object[capacity];

    }

    public void add(T element){
        if(this.contains(null)){
            this.set(this.indexOf(null), element);
        }
        else{
            this.myArray = Arrays.copyOf(myArray, myArray.length+1);
            this.myArray[this.myArray.length-1] = element;
        }
        this.numberOfObjects++;
    }

    public void add(int index, T element){
        if(this.myArray[index] == null){
            this.myArray[index] = element;
            this.numberOfObjects++;
        }

        else if(this.contains(null)){
            this.myArray = Arrays.copyOf(myArray, this.myArray.length);
            this.shiftValuesAndReplaceTargets(index,element);
        }

        else{
            this.myArray = Arrays.copyOf(myArray, this.myArray.length+1);
            this.shiftValuesAndReplaceTargets(index,element);
        }
    }

    public void addAll(T[] elements){
        if(this.contains(null)){
            this.myArray = Arrays.copyOf(myArray, this.newArraySize(elements));
            int counter = this.indexOf(null) ;
            for(int i = 0 ; i<elements.length; i++){
                this.myArray[counter] = elements[i];
                counter++;
                this.numberOfObjects++;
            }
        }
        else{
            for(T t : elements){
                this.add(t);
            }
        }
    }

    public void addAll(int index, T[] elements){
        if(this.myArray[index] == null && elements.length <= (this.myArray.length-this.size())){
            int counter = index;
            for(int i = 0; i< elements.length; i++) {
                this.myArray[counter] = elements[i];
                this.numberOfObjects++;
            }
        }

        else if(this.contains(null)){
            this.myArray = Arrays.copyOf(myArray, newArraySize(elements));
            shiftValuesAndReplaceTargets(index,elements);
        }

        else{
            this.myArray = Arrays.copyOf(myArray, newArraySize(elements));
            shiftValuesAndReplaceTargets(index,elements);
        }

    }

    public void clear(){
        for(int i = 0; i<this.myArray.length; i++){
            this.myArray[i] = null;
        }
        this.numberOfObjects=0;

    }

    public boolean contains(T element){
        if (element == null){
            for (T t : myArray){
                if(t == null) return true;
            }
        }

        for (T t : myArray){
            if(t == null) continue;
            else if (t.equals(element)) return true;
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

        if (element == null){
            for (int i = 0; i<myArray.length; i++){
                if (this.myArray[i] == element){
                    return i;
                }
            }
        }

        for (int i = 0; i<myArray.length; i++){
            if (this.myArray[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){

        return this.size() == 0;
    }

    public int lastIndexOf(T element){
        for(int i = this.myArray.length-1; i>=0; i--){
            if (this.myArray[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        T[] tempArray = (T[]) new Object[0];
        for(int i = 0; i<this.myArray.length; i++){
            if(i != index){
                tempArray = Arrays.copyOf(tempArray,tempArray.length+1);
                tempArray[tempArray.length-1] = this.myArray[i];
            }
        }
        tempArray = Arrays.copyOf(tempArray,tempArray.length+1);
        this.myArray = tempArray;
        this.numberOfObjects -= 1;
    }

    public void remove(T object){
        this.remove(this.indexOf(object));

    }

    public void removeRange(int startIndex, int endIndex){
        T[] tempArray = (T[]) new Object[0];
        for(int i = 0; i<this.myArray.length; i++){
            if (i < startIndex || i > endIndex){
                tempArray = Arrays.copyOf(tempArray,tempArray.length+1);
                tempArray[tempArray.length-1] = this.myArray[i];
            }
        }
        tempArray = Arrays.copyOf(tempArray,tempArray.length+(endIndex-startIndex)+1);
        this.myArray = tempArray;
        this.numberOfObjects -= (endIndex - startIndex)+1;

    }

    public int size(){
        return this.numberOfObjects;
    }

    public T[] subArray(int startIndex, int endIndex, T[] newArray){
        T[] tempArray = (T[]) new Object[0];
        int counter = 0;
        for(int i = startIndex; i <= endIndex; i++){
            tempArray = Arrays.copyOf(tempArray,tempArray.length+1);
            tempArray[counter] = this.myArray[i];
            counter++;
        }
        return (T[]) Arrays.copyOf(tempArray, tempArray.length, newArray.getClass());
    }

    public T[] toArray(T[] newArray){

        return (T[]) Arrays.copyOf(this.myArray, this.myArray.length, newArray.getClass());
    }

    public void trimToSize(){
        this.myArray = Arrays.copyOf(this.myArray, this.size());

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

    private void shiftValuesAndReplaceTargets(int index, T ... elements){
        int count = index;
        T[] tempArray = Arrays.copyOf(myArray, myArray.length);
        for(int i = (index+elements.length); i<tempArray.length; i++){
            tempArray[i] = this.myArray[i-elements.length];
        }

        for(int i = 0; i<elements.length; i++) {
            tempArray[count] = elements[i];
            count++;
            this.numberOfObjects++;
        }
        this.myArray = tempArray;
    }

}
