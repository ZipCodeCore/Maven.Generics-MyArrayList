import java.util.Arrays;

public class Map <K,V> {

    private int size;
    private int defaultCapacity = 15;
    @SuppressWarnings("unchecked")
    private MyEntry<K, V>[] myEntry = new MyEntry[defaultCapacity];

    public Map(K key, V value) {
    }
    public Map(K key){
    }
    public Map() {
    }

    public void clear(){

    }
    public boolean containsKey(K key){
        for(int i = 0; i < myEntry.length; i++){
            if(key.equals(i)){
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(V value){
        for(int i = 0; i < myEntry.length; i++){
            if(value.equals(i)){
                return true;
            }
        }
        return false;
    }
    public Map entrySet(){
        return null;
    }
    public boolean equals(Object o){
        for(int i = 0; i < myEntry.length; i++){
            if(myEntry[i] == o){
                return true;
            }
        }
        return false;
    }
    public V get(K key) {
        for (int i = 0; i < myEntry.length; i++) {
            if (myEntry[i] != null) {
                if (myEntry[i].getKey().equals(key)) {
                    return myEntry[i].getValue();
                }
            }
        }
        return null;
    }

    public int hashCode(){
        return 0;
    }
    public boolean isEmpty(){
        if(myEntry.length == 0){
            return true;
        }
        return false;
    }
    public Set<K> keySet(){
        return null;
    }
    public void put(K key, V value) {
        boolean addToMap = true;
        for (int i = 0; i < myEntry.length; i++) {
            if (myEntry[i].getKey().equals(key)) {
                myEntry[i].setValue(value);
                addToMap = false;
            }
            if (addToMap) {
                increaseSize();
                myEntry[size++] = new MyEntry<>(key, value);
            }
        }
    }
    public void increaseSize(){
        if(size == myEntry.length){
            int newSize = myEntry.length * 2;
            myEntry = Arrays.copyOf(myEntry, newSize);
        }
    }
    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (myEntry[i].getKey().equals(key)) {
                myEntry[i] = null;
                size--;
            }
        }
    }
    public int size(){
        return size;
    }
    public V values(){
        return null;
    }
    }

