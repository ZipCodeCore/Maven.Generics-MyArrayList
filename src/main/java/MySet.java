import com.sun.tools.classfile.Opcode;

import java.util.Set;

public class MySet<E> extends MyCollections<E> {
    public MySet() {
        super(DEFAULT_SIZE);
    }

    @Override
    public boolean add(E theObject) {
        boolean added = false;
        if (!contains(theObject))
            super.add(theObject);
        added = true;
        return added;
    }


    @Override
    public boolean equals(Object theObject) {
        //check to see if TheObject is an instance of the set
        // check to see if sizes are the same
        // check to see if the one set contains all the same object
        if (!(theObject instanceof MySet)) {
            return false;
        }
        if ((((MySet) theObject).getSize() != getSize()))
            if (!((MySet) theObject).contains(theObject)) {
                return false;
            }

        return theObject.equals(getNumbers());
    }
}
