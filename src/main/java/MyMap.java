public class MyMap<K,V> {

    private MySet<Mapping> mapSet;

    public MyMap(){
        mapSet = new MySet<>();

    }

    public void clear(){
        mapSet.clear();

    }

    public boolean containsKey(K key){
        for(Mapping m : mapSet.toArray(new Mapping[0])){
            if(m.getKey().equals(key)) return true;
        }
        return false;
    }

    public boolean containsValue(V value){
        for(Mapping m : mapSet.toArray(new Mapping[0])){
            if(m.getValue().equals(value)) return true;
        }
        return false;
    }

    public V get(K key){
        for(Mapping m : mapSet.toArray(new Mapping[0])){
            if(m.getKey().equals(key)) return (V) m.getValue();
        }
        return null;
    }

    public void put(K key, V value){
        Mapping m = new Mapping (key,value);
        mapSet.add(m);

    }

    public int size(){
        return mapSet.size();
    }




}
