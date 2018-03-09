import java.util.Objects;

public class Mapping<K,V> {

    K key;
    V value;

    public Mapping(K key, V value){
        this.key = key;
        this.value = value;

    }

    public V getValue(){
        return this.value;
    }

    public K getKey(){
        return this.key;
    }

    public void setValue(V newValue){
        this.value = newValue;

    }

    @Override
    public boolean equals(Object o){
        if(o==this)return true;
        if(!(o instanceof Mapping))return false;

        Mapping m = (Mapping) o;
        return this.key.equals(m.key);

    }

    @Override
    public int hashCode(){
        return Objects.hash(key,value);
    }




}
