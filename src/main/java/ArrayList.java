public class ArrayList<T> {
    private T[] numbers;
    private boolean isEmpty;

    public ArrayList(T[] theNumbers) {
        this.numbers = theNumbers;
        this.isEmpty = false;
    }
  //adds to a specific index.
    public boolean add(T theObject, int index) {
        return false;
    }
    //adds to the last index
    public boolean add(T theObject){

        return false;
    }


    public boolean remove(T theObject) {

        return false;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }
    // clears array by setting new array to size zero;
    public void clear() {

    }

    public boolean contains() {

        return false;
    }

    public int getSize() {
        return this.numbers.length;
    }
}
