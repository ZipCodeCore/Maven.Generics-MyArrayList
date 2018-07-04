package io.generics.myArrayList;


public class MyMap<K,V> {

    private KeyValuePair<K,V> pair;
    protected MyArrayList<KeyValuePair<K, V>> myMap;
    K key;
    V value;

    public MyMap(){
        this.myMap = new MyArrayList<>(16);
    }

    public MyMap(int size){
        this.myMap = new MyArrayList<>(size);
    }

    public MyMap(MyArrayList<KeyValuePair<K, V>> myMap){
        this.myMap = myMap;
    }

    public void setMyMap(MyArrayList<KeyValuePair<K, V>> myMap) {
        this.myMap = myMap;
    }

    public MyArrayList<KeyValuePair<K, V>> getMyMap() {
        return myMap;
    }

    public void add(KeyValuePair<K,V> value){
        for(int i=0; i<myMap.size(); i++){
            if(!myMap.get(i).equalTo(value.getKey())){
                myMap.add(value);
            }
        }
    }

    public void remove(int index){
        myMap.remove(index);
    }

    public int size(){
        return myMap.size();
    }


    public boolean containsKey(K value){
        return false;
    }

    public boolean isEmpty(){
        return myMap.isEmpty();
    }

    public void clear(){
        myMap.clear();
    }

    public KeyValuePair<K,V>[] toArray(){
        return myMap.getMyArrayList();
    }




}
