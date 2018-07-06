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

    public MyMap(MyArrayList<KeyValuePair<K, V>> myMap1){
        myMap = myMap1;
    }

    public void setMyMap(MyArrayList<KeyValuePair<K, V>> myMap1) { }

    public MyArrayList<KeyValuePair<K, V>> getMyMap() {
        return myMap;
    }

    public boolean add(KeyValuePair<K,V> value) {
        MyArrayList<K> keySet = new MyArrayList<>();
        for(int i = 0; i<myMap.size(); i++){
            keySet.add(myMap.get(i).getKey());
        }
        K valueKey = value.getKey();
        if(keySet.contains(valueKey)) {
            return false;
        } else {
            myMap.add(value);
        }
        return true;
    }

    public void remove(int index){
        myMap.remove(index);
    }

    public int size(){
        return myMap.size();
    }


    public boolean containsKey(K key){
        for(int i = 0; i<myMap.size(); i++){
            K key1 = myMap.get(i).getKey();
            if(key1.equals(key)){
                return true;
            }
        }
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
