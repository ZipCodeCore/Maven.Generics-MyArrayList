public class MySet <T> {

    //private T[] mySet;
    private MyArrayList mySet;

    public MySet () {
        this.mySet =  new MyArrayList<T>();
    }

//    public MySet(int size){
//        //this.mySet = (T[]) new MyArrayList[size];
//    }

    public boolean add(T element){
        if(!mySet.contains(element)) {
            if (mySet.size() < 5) {
                mySet.ensureCapacity();
            }
            mySet.add(element);
            return true;
        }
        return false;

    }

    public boolean add(int index, T element){
        if(!mySet.contains(element)){
            if(mySet.size()<5){
                mySet.ensureCapacity();
            }
            mySet.add(index,element);
            return true;
        }
        return false;
    }

    public boolean remove(int index){
        Object temp = mySet.get(index);
        mySet.remove(index);
        if(mySet.contains(temp)){
            return false;
        }
        return true;
    }

    public boolean remove(T elementToBeRemoved){
        if(mySet.contains(elementToBeRemoved)){
            mySet.remove(elementToBeRemoved);
            return true;
            }
            return false;
    }
    public boolean contains(T element){

        return mySet.contains(element);
//        for(int i =0;i<mySet.size();i++){
//            if(mySet.get(i).equals(element)){
//                return true;
//            }
//        }
//        return false;
    }

    public T get(int index){
        for(int i=0;i<mySet.size();i++){
            if(mySet.get(i).equals(mySet.get(index))){
                //return mySet.get(i);
            }
        }
        return null;
    }
    public int size(){
        return mySet.size();
    }

    public boolean equals(T[] newSet){
        if(newSet.length!=mySet.size()){
            return false;
        }else{
            for(int i=0;i<newSet.length;i++){
                if(!mySet.contains(newSet[i])){
                    return false;
                }
            }
        }
        return newSet.equals(mySet);
    }
}
