package io.generics.myArrayList;

public interface Collections<T> {
    boolean add(T value);
    boolean addAll(T[] toBeAdded);
    void clear();
    boolean contains(T object);
    boolean containsAll(T[] array);
    boolean isEmpty();
    boolean remove(T object);
    boolean removeAll(T[] array);
    boolean retainAll(T[] array);
    int size();
    Object[] toArray();
    T[] toArray(T[] array);

}
