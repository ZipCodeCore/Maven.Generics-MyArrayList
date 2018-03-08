import java.util.Arrays;

public class MyArrayList<E> {

    private E[] theArray;

    public MyArrayList() {
        this.theArray = Arrays.copyOf(theArray, 0);
    }

    public void add(E thingToAdd) {

    }

    public E[] getTheArray() {
        return theArray;
    }

    public boolean remove(E thingToRemove) {
        return false;
    }

    public void setTheArray(E[] theArray) {
        this.theArray = theArray;
    }

    public void clear() {

    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(E thingToCheckFor) {
        return false;
    }

}
