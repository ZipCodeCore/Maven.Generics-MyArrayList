public class MySet <T> {

    MyArrayList myArrayList;

    public MySet(){
        this.myArrayList = new MyArrayList<>();
    }

    public MySet(T[] array){

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
