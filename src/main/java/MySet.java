public class MySet <T> {

    private MyArrayList<T> mySet;
    //Only reference types can be type parameters
    //avoiding compile time checks with generic types
    //the compiler will cast at run time where needed
    //Compiler will implicitly perform the type conversion
    public MySet() {
        mySet = new MyArrayList<>();
    }

    public void add(T value) { //add value if set does not contain it
        if (!mySet.contains(value)) {
            mySet.add(value);
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int index) { //get the value at desired index
        return mySet.get(index);
    }

    public void remove(int index) { //removes all elements within this set, isEmpty method will return true upon calling
        mySet.remove(index);
    }

    public void set(int index, T value) { //set the value at a desired index
        mySet.set(index, value);
    }

    public void clear() { //delete everything within the set
        mySet.clear();
    }

    public boolean contains(T value) { //if the desired value is within the set return true
        return mySet.contains(value);
    }

    public boolean isEmpty() { //if this set contains no elements return true
        return mySet.isEmpty();
    }

    public int getSize(){ //If this set contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE
        return mySet.getSize(); //in this case if my generic array/ my set of type T objects has the max value return the max value
    }

    public T[] toArray(T[] value){ //Returns an array containing all elements in set depending on Type. If the array fits then it returns those values.
        return mySet.toArray(value);//Otherwise, a new array is allocated same runtime type of the used array and the size of this set. i.e. 10 goes to 20 and so on

    }
}