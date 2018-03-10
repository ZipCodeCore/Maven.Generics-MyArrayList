
public class MyMap<K, V> {

    private MyArrayList<Entry> map;

    public MyMap() {
        map = new MyArrayList<>();
    }

    public boolean containsKey(K key) {
        for (int i = 0; i < this.map.size(); i++) {
            if (map.get(i).getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < this.map.size(); i++) {
            if (map.get(i).getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void put(K key, V value) {
        for (int i = 0; i < map.size(); i++) {
            if (containsKey(key)) {
                map.set(i, new Entry<>(key, value));
                return;
            }
        }
        map.add(new Entry<>(key, value));
    }

    public V get(K key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey().equals(key)) {
                return (V)map.get(i).getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey().equals(key)) {
                map.remove(i);
            }
        }

    }

    public Integer size() {
        return map.size();
    }



}
