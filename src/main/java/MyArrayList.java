import java.util.Arrays;

public class MyArrayList<E> {


    public E[] myArray;

    public MyArrayList() {

        this.myArray = (E[]) new Object[5];

    }

    public MyArrayList(int size) {

        this.myArray = (E[]) new Object[size];
    }

    public int size() {

        return this.myArray.length;
    }

    public void add(int index, E e) {

        E[] myArrayNew = Arrays.copyOf(this.myArray, index + 1);
        myArrayNew[index] = e;
        this.myArray = myArrayNew;
    }

    public void add(E e) {

        E[] myArrayNew = Arrays.copyOf(this.myArray, this.myArray.length + 1);
        myArrayNew[myArrayNew.length - 1] = e;
        this.myArray = myArrayNew;
    }

    public void addAll(E[] c) {

        int counter = 0;
        E[] combinedArray = Arrays.copyOf(myArray, myArray.length + c.length);

        for (int i = myArray.length; i < combinedArray.length; i++) {
            combinedArray[i] = c[counter];
            counter++;
        }
        this.myArray = combinedArray;
    }

    public E get(int index) {

        if (myArray.length > index) return myArray[index];

        return null;
    }

    public void remove(int index) {

        if (myArray.length > index && myArray.length > 0) {

            E[] removedArray = Arrays.copyOf(this.myArray, this.myArray.length - 1);
            int count = 0;

            for (int i = 0; i < removedArray.length; i++) {

                if (i != index) {
                    removedArray[count] = myArray[i];
                    count++;
                }
            }
            this.myArray = removedArray;

        }
    }

    public void remove(E e) {

            E[] removedArray = Arrays.copyOf(this.myArray, this.myArray.length - 1);
            int count = 0;

            for (int i = 0; i < removedArray.length; i++) {

                if (myArray != e) {
                    removedArray[count] = myArray[i];
                    count++;
                }
            }
            this.myArray = removedArray;
    }

    public void set(int index, E e) {

        myArray[index] = e;
    }

    public void clear() {

        E[] myClearedArray = Arrays.copyOf(this.myArray, 0);
        this.myArray = myClearedArray;
    }

    public boolean isEmpty() {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null)
                return false;
        }
        return true;
    }

    public boolean contains(E e) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == e) return true;
        }
        return false;
    }

}
