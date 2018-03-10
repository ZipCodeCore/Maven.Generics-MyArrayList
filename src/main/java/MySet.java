import java.util.Iterator;
import java.util.Set;

public class MySet<T> {

    private MyArrayList<T> set;

    public MySet() {
        this.set = new MyArrayList<>(1);

    }

    public void add(T aThing) {
        if (!contains(aThing)) {
            this.set.add(aThing);
        }
    }

    public void addAll(T... things) {
        for (int i = 0; i < things.length; i++) {
            add(things[i]);
        }
    }

    public void clear() {
        this.set.clear();
    }

    public boolean contains(T aThing) {

        for (int i = 0; i < set.size(); i++) {
            if (this.set.get(i).equals(aThing)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T... things) {
        for (int i = 0; i < things.length; i++) {
            if (!contains(things[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        if (this.set.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void remove(T aThing) {
        this.set.remove(aThing);
    }

    public void removeAll(T... things) {
        for (int i = 0; i < things.length; i++) {
            remove(things[i]);
        }
    }

    public int size() {
        return getSet().size();
    }

    public Object[] toArray() {

        Object[] objArray = new Object[size()];

        for (int i = 0; i < size(); i++) {
            objArray[i] = this.set.get(i);
        }

        return objArray;
    }

    public MyArrayList getSet() {
        return this.set;
    }

//    public Iterator<T> iterator() {
//        return new Iterator<T>() {
//            @Override
//            public void remove() {
//
//            }
//
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public T next() {
//
//
//                return null;
//            }
//        };
//    }


}
