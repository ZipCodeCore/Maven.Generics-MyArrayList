public class MyMap <K, V>{

    private MyMap<K, V> myMap;
    private K key;
    private V value;


    public void set (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public MyMap() {
        myMap = new MyMap<>();
    }

    public int size() {
        return myMap.size();
    }

    public boolean isEmpty() {
        return myMap.isEmpty();
    }

    public boolean containsKey(K key){
        if (myMap.getKey() == key) {
            return true;
        }else
            return false;
    }

    public boolean containsValue(K value){
        if(myMap.getValue() == value) {
            return true;
        }else
            return false;
    }

    public void put(K key, K value){
        if (myMap.getKey() != key) {
            myMap.put(key, value);
        }
    }

    public void remove(K key) {
        myMap.remove(key);
    }

    public void clear() {
        myMap.clear();
    }


    public void values(){
    }

    public void equals(){
    }

    public int hashCode(){
        return myMap.hashCode();
    }


    //Getters & Setters for Key & Value
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
