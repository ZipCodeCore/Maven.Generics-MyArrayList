package io.generics.myArrayList;

public class KeyValuePair<K,V> {


    protected K key;
    protected V value;


    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public KeyValuePair(){
        this.setValue(value);
        this.setKey(key);

    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        this.setKey(key);
        return key;
    }

    public V getValue() {
        this.setValue(value);
        return value;
    }

    public boolean equalTo(K key){
        if(getKey().equals(key)){
            return true;
        }
        return false;
    }

    public void replace(V value1){
        this.value = value1;
    }

}
