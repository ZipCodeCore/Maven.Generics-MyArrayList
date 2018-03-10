public class Entry<K, V> {

    K key;
    V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return this.value;
    }

    public K getKey() {
        return this.key;
    }

    public void setValue(V anotherValue) {
        this.value = anotherValue;
    }

}
