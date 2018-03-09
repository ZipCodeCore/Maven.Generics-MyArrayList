import java.util.Arrays;

public class MyArrayList<E> {

    private E[] theArray;

    public MyArrayList() {
        theArray = (E[]) new Object[0];
    }

    public MyArrayList(int size) {
        theArray = (E[]) new Object[size];
    }

    public void add(E thingToAdd) {
        E[] newArray = Arrays.copyOf(this.theArray, this.theArray.length+1);
        newArray[newArray.length-1] = thingToAdd;
        this.theArray = newArray;
    }

    public E[] getTheArray() {
        return theArray;
    }

    public boolean remove(E thingToRemove) {
        // If thing is found and removed, returns true.  If thing is not found, returns false
        return false;
    }

    public void setTheArray(E[] theArray) {
        this.theArray = theArray;
    }

    public void setAtIndex(int index, E thingToSet) {
        this.theArray[index] = thingToSet;
    }

    public void clear() {
        this.theArray = Arrays.copyOf(theArray, 0);
    }

    public boolean isEmpty() {
        if (theArray.length == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(E thingToCheckFor) {
        for (E aTheArray : theArray) {
            if (aTheArray.equals(thingToCheckFor)) {
                return true;
            }
        }
        return false;
    }

}
