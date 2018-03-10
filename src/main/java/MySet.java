public class MySet<T> {

    MyArrayList<T> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
    }
    public MySet(int sizeOfSet){
        mySet = new MyArrayList<>(sizeOfSet);
    }

    public void add(T valueToAdd){
        if (!mySet.contains(valueToAdd)){
            mySet.add(valueToAdd);
        }
    }
    public void add(T valueToAdd, int index){
        if(!mySet.contains(valueToAdd)){
            mySet.addAnywhere(valueToAdd, index);
        }
    }
    public void remove(int index){
        mySet.remove(index);
    }
    public void set(T value, int index){
        mySet.set(value, index);
    }
    public T get(int index){
        return mySet.get(index);
    }
    public void clear(){
        mySet.clear();
    }
    public Integer size(){
        return this.size();
    }
    public Boolean contains(T value){
       if (mySet.contains(value)){
           return true;
       }
       return false;
    }
    public Boolean isEmpty(){
       if (mySet.isEmpty()){
           return true;
       }
       return false;
    }
}
