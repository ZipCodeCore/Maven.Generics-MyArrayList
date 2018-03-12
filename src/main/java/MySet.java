import java.util.Arrays;

public class MySet <T>
{
    private MyArrayList<T> mySetList;

    //Constructors
    public MySet()
    {
        this.mySetList = new MyArrayList<T>();
    }

    public MySet(T[] elements)
    {
        mySetList = new MyArrayList<>();

        for (T index : elements)
        {
            if(!contains(index))
            {
                mySetList.add(index);
            }
        }
    }

    //add
    public void add(T element)
    {
        if(!contains(element))
        {
            mySetList.add(element);
        }
    }

    //size
    public Integer size()
    {
        return this.mySetList.size();
    }

    //get
    public T get(int index)
    {
        return mySetList.get(index);
    }

    //set
    public void set (T element, int index)
    {
        mySetList.set(index, element);
    }

    //clear
    public void clear()
    {
        mySetList.clear();

    }

    //contains
    public boolean contains(T element)
    {
        return mySetList.contains(element);
    }

    //remove
    public void remove(T element)
    {
        mySetList.remove(element);
    }

    //isEmpty
    public boolean isEmpty()
    {
        if(mySetList.size().equals(0))
        {
            return true;
        }

       return false;
    }




}
