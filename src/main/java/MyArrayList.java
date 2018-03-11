import java.util.Arrays;


public class MyArrayList <K, V>{

    private K[] inputArray;

    public MyArrayList(){
        inputArray = (K[]) new Object[0];
    }

    public MyArrayList(int size){
        inputArray = (K[]) new Object[size];
    }

    public <K> K[] toArray(K[] newArray){
        return (K[]) Arrays.copyOf(inputArray, inputArray.length, newArray.getClass());
    }

    public void set(int index, K element){
        inputArray[index] = element;
    }

    public K get(int index){
        return inputArray[index];
    }

    public int size(){
        return inputArray.length;
    }

    public void add(K obj){

        K[] addArray = Arrays.copyOf(inputArray, inputArray.length + 1);
        addArray[addArray.length - 1] = obj;
        inputArray = addArray;
    }

    public void add(int index, K obj) {

        inputArray = Arrays.copyOf(inputArray, inputArray.length + 1);

        for (int i = inputArray.length - 1; i > index; i--){
            inputArray[i] = inputArray[i-1];
            }
            inputArray[index]= obj;
    }


    public void remove(int index){

        for (int i = index; i < inputArray.length - 1; i++){
            inputArray[i] = inputArray[i + 1] ;
            }
        inputArray = Arrays.copyOf(inputArray, inputArray.length - 1);
    }

    public void clear() {
        //reassigned it to an empty array
        inputArray = (K[]) new Object[0];
    }

    public boolean isEmpty(){
        if (inputArray.length == 0) {
            return true;
        }else
            return false;
    }

    public boolean contains(K value) {
        for (int i = 0; i < inputArray.length; i++) {
            if (value.equals(inputArray[i])) {
                return true;
            }
        }
        return false;
    }
}