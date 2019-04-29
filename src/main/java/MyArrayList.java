import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> extends MyCollections<E>{
    private final static int DEFAULT_SIZE = 10;

    public MyArrayList(int length) {
        super(length);
    }
    /* if there is no size given create Default with size of 10.*/
    public MyArrayList() {
        super(DEFAULT_SIZE);
    }

    @Override
    public boolean equals(Object theObject) {
        return false;
    }

    //adds to a specific index.
    public boolean add(E theObject, int index) {
        int size = getSize();
        E[] objects = (E[]) getNumbers();
        ensureCapacity(size + 1);

        System.arraycopy(getNumbers(), index, objects, index + 1,
                size - index);
        objects[index] = theObject;
        super.incrementSizeByOne();
        return true;
    }



}
