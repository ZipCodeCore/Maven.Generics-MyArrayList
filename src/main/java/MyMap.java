

public class MyMap<K,V>
{
    private MyArrayList<Entry> entries;

    public MyMap()
    {
        this.entries = new MyArrayList<>();
    }

    public void put(K key, V value)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if(entries.get(i).equals(key))
            {
                entries.set(i, new Entry<>(key, value));
                break;
            }
        }
        entries.add(new Entry<>(key, value));
    }

    public Object get(Object key)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if(entries.get(i).getKey().equals(key))
            {
                return entries.get(i).getValue();
            }
        }

        return null;
    }

    public void remove(Object key)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if (entries.get(i).getKey().equals(key))
            {
                remove(i);
            }
        }

    }

    public Integer size()
    {
        return entries.size();
    }

    public boolean containsKey(Object key)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if(entries.get(i).getKey().equals(key))
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(Object value)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            if(entries.get(i).getValue().equals(value))
            {
                return true;
            }
        }
        return false;
    }


    private class Entry<K, V>
    {
        private K key;
        private V value;

        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue(){
            return value;
        }
    }
}
