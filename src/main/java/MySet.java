public class MySet <T> {

    private MyArrayList myArrayList;

    public MySet(){
        this.myArrayList = new MyArrayList<>();
    }

    public void add(T value) {
        if(!myArrayList.contains(value)){
                myArrayList.add(value);
        }
    }

    public void addAll(T[] array){
        for(int i = 0; i < array.length; i++){
            if(!myArrayList.contains(array[i])){
                myArrayList.add(array[i]);
            }
        }
    }

    public int size(){
        return this.myArrayList.size();
    }

    public void clear() {
        myArrayList.clear();
    }

    public <T> T[] toArray(T[] newArray){
        return (T[]) this.myArrayList.toArray(newArray);
    }

    public boolean contains(T element){
        return myArrayList.contains(element);
    }

    public boolean isEmpty(){
        return myArrayList.isEmpty();
    }


}
