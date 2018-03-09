public class MySet<T> {

    private MyArrayList<T> setList;

    public MySet(){
        setList = new MyArrayList<>();

    }

    public MySet(T[] initialArray){
        setList = new MyArrayList<>();
        setList.addAll(initialArray);

    }

    public MySet(int initialCapacity){
        setList = new MyArrayList<>(initialCapacity);

    }

    public void add(T element){
        if(!setList.contains(element)) {
            setList.add(element);
        }

    }

    public void clear(){
        setList.clear();
    }

    public boolean contains(T element){
        return setList.contains(element);
    }

    public boolean isEmpty(){
        return setList.isEmpty();
    }

    public void remove(T element){
        setList.remove(element);

    }

    public int size(){
        return setList.size();
    }

    public T[] toArray (T[] typeArray){
        return setList.toArray(typeArray);
    }






}
