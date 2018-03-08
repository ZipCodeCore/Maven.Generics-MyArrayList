import java.util.ArrayList;
import java.util.Collection;

public class MyArrayList<E> {


    public E[] myArray;

    public MyArrayList(){
        this.myArray = (E[]) new Object();

    }

    public MyArrayList(int size){
        this.myArray = (E[]) new Object[size];
    }

    public int size() { return myArray.length;}

    public void add(E e, int index){}

    public void add(E e){}

    public void addAll(Collection<? extends E> c){}

    public E get(int index){
        return null;
    }

    public void remove(int index){}

    public void set(E e, int index){}

    public void clear(){}

    public boolean isEmpty(){
        return false;
    }

    public boolean contains(E e){
        return false;
    }

}
