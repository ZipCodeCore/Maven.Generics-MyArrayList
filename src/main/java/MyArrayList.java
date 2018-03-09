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
        E[] newArray = Arrays.copyOf(this.theArray, this.theArray.length + 1);
        newArray[newArray.length-1] = thingToAdd;
        this.theArray = newArray;
    }

    public E[] getTheArray() {
        return theArray;
    }

    public boolean remove(E thingToRemove) {
        // If thing is found and removed, returns true.  If thing is not found, returns false
        int counter = 0;
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i].equals(thingToRemove)) {
                counter++;
            }
        }
        if (counter == 0) {return false;}
        E[] newArray = Arrays.copyOf(this.theArray, this.theArray.length - counter);
        counter = 0;
        for (int i = 0; i < theArray.length; i++) {
            if (!(theArray[i].equals(thingToRemove))) {
                newArray[counter] = theArray[i];
                counter++;
            }
        }
        this.theArray = newArray;
        return true;
    }

    public E removeAtIndex(int index) {
        // Removes E from the array and returns it, if the index is out of bounds it returns null
        if (index > theArray.length - 1 || index < 0) {
            return null;
        } else {
            // Return E and resize array
            return null;
        }
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
        return theArray.length == 0;
    }

    public boolean contains(E thingToCheckFor) {
        for (E aTheArray : theArray) {
            if (aTheArray.equals(thingToCheckFor)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return theArray.length;
    }

}
