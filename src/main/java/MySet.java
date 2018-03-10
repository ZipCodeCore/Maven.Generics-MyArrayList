public class MySet<T> {

    private MyArrayList<T> mySet;

    public MySet(){
        this.mySet = new MyArrayList<>(10);
    }

    public void add(T setElement){
        if (!contains(setElement)){
            this.mySet.add(setElement);
        } else{
            System.out.println("This element is already in this set!");
        }
    }

    public Integer size(){
        return this.mySet.size();
    }

    public void clear(){
        this.mySet.clear();
    }

    public boolean contains(T element){
       return this.mySet.contains(element);
    }

    public boolean isEmpty(){
        return this.mySet.isEmpty();
    }
}
