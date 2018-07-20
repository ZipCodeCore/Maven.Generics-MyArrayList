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
        this.myMap = myMap1;
        for(int i = 0; i<myMap.size(); i++){
            int count = 0;
            KeyValuePair<K,V> temp = myMap.get(i);
            for(int j = 0; j<myMap.size(); j++){
                if(myMap.get(i).getKey().equals(myMap.get(j).getKey())){
                    count++;
                }
            }
            if(count > 1){
                myMap.remove(i);
            }
        }
    }

    public void setMyMap(MyArrayList<KeyValuePair<K, V>> myMap1) {

    }

    public MyArrayList<KeyValuePair<K, V>> getMyMap() {
        return myMap;
    }

    public void clear(){
        myMap.clear();
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

    public boolean containsValue(V value){
        for(int i = 0; i<myMap.size(); i++){
            V val = myMap.get(i).getValue();
            if(val.equals(value)){
                return true;
            }
        }
        return false;
    }

    public MySet<KeyValuePair<K,V>> entrySet(){

    }

    public V get(K key){

    }

    public boolean isEmpty(){
        return myMap.isEmpty();
    }

    public MySet<K> keySet(){

    }

    public boolean put(KeyValuePair<K,V> value) {
        myMap.add(value);
        for (int i = 0; i < myMap.size(); i++) {
            int count = 0;
            KeyValuePair<K,V> temp = myMap.get(i);
            for(int j = 0; j<myMap.size(); j++){
                if(myMap.get(i).getKey().equals(myMap.get(j).getKey())){
                    count++;
                }
            }
            if(count > 1){
                myMap.remove(i);
            }
        }
        return true;
    }

    public boolean putAll(MyArrayList<KeyValuePair<K,V>> arrayList){
        return true;
    }

    public void remove(int index){
        myMap.remove(index);
    }

    public int size(){
        return myMap.size();
    }

    public MyArrayList<V> values(){

    }








}
