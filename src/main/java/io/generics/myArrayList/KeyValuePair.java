package io.generics.myArrayList;

public class KeyValuePair<K,V> {


    protected K key;
    protected V value;


    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public boolean equalTo(K key1){
        if(key.equals(key1)){
            return true;
        }
        return false;
    }

}
