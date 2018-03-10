

public class MyMap<K,V> {

    protected MyArrayList<KeyValuePair<K,V>> myMap;

    public MyMap(){
        this.myMap = new MyArrayList<>(16);
    }

    public MyMap(int size){
        this.myMap = new MyArrayList<>(size);
    }


/**    public void setMyMap(Object[] input) {
        this.myMap = new MyArrayList<>(input);
        for(int i = 0; i<myMap.size(); i++){
            KeyValuePair pair1 = myMap.get(i);
            if(myMap.countDuplicateKeys(pair1)>1) {
                myMap.remove(i);
            }
        }
    }*/

    public MyArrayList getMyMap() {
        return myMap;
    }

}
