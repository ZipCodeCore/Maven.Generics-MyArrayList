public class MySet<E> {
    MyArrayList<E> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
        }

    public MySet(int sizeOfSet){
        mySet = new MyArrayList<>(sizeOfSet);
        }

    public void add(E valueToAdd){
        if (!mySet.contains(valueToAdd)){
            mySet.add(valueToAdd);
        }
    }

    public void add(int index, E valueToAdd){
        if(!mySet.contains(valueToAdd)){
            mySet.add1(index, valueToAdd);
            }
        }

    public void remove(int index){
        mySet.remove(index);
    }


    public void set(E value, int index){
        mySet.set(value, index);
    }
    public E get(int index){
        return mySet.get(index);
    }
    public void clear(){
        mySet.clear();
    }
    public Integer size(){
        return this.size();
        }
    public Boolean contains(E value){
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
