public class MySet<E>{

    private MyArrayList myArrayList = new MyArrayList();

    public MySet() {
        this.myArrayList = new MyArrayList();
    }

    public void add(E thingToAdd) {
        if (!(myArrayList.contains(thingToAdd))) {
            myArrayList.add(thingToAdd);
        }
    }

    public int size() {
        return myArrayList.size();
    }

    public void clear() {
        myArrayList.clear();
    }

    public E[] toArray() {
        return (E[]) myArrayList.toArray();
    }

    public boolean contains(E thing) {
        return myArrayList.contains(thing);
    }

    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }



    // Recreate all methods, have them call MyArrayList methods
    // Only ones that need to be different are add because it needs to check the array for the thing you're trying to add first

}
