public class MySet <T>{

    MyArrayList<T> mySet;

    public MySet(){
        mySet = new MyArrayList<>();
    }

    public MySet(int size){
        mySet = new MyArrayList<>(size);
    }

    public void add(T valueToAdd){
        if (!mySet.contains(valueToAdd)){
            mySet.add(valueToAdd);
        }
    }

    public void add(T valueToAdd, int index){
        if (!mySet.contains(valueToAdd)){
            mySet.add(valueToAdd, index);
        }
    }

    public T get(int location){
        return mySet.get(location);
    }

    public void remove(int index){
        mySet.remove(index);
    }

    public void set(T value, int index){
        mySet.set(value, index);
    }

    public void clear(){
        mySet.clear();
    }

    public boolean isEmpty(){
        return mySet.isEmpty();
    }

    public boolean contains(T value){
        return mySet.contains(value);
    }
}
