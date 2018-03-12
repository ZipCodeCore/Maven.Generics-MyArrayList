import java.util.Arrays;
import java.lang.reflect.Array;

public class MyArrayList <T>
{
    protected T[] inputArray;



    //Constructors
    public MyArrayList()
    {
        this.inputArray = (T[]) new Object[0];
    }

    public MyArrayList(int size)
    {
        this.inputArray = (T[]) new Object[size];
    }

    //adds
    public void add(T element)
    {

        T[] finalArray = Arrays.copyOf(inputArray, inputArray.length + 1);
        finalArray[finalArray.length-1]= element;
        this.inputArray = finalArray;

    }

    public void addAnywhere(T value, int index)
    {

        T[] otherArray = Arrays.copyOf(inputArray, inputArray.length + 1);


        if (otherArray[index].equals(null))
        {
            otherArray[index] = value;
        }
        else
        {
            Integer count = inputArray.length;

            while (index < count)
            {
                otherArray[count] = otherArray[count - 1];
                count--;
            }

            otherArray[index] = value;

        }

        inputArray = otherArray;

    }

    //size
    public Integer size()
    {
        return this.inputArray.length;
    }

    //get
    public T get(int index)
    {
        return this.inputArray[index];
    }

    //set
    public void set(int index, T element)
    {
        inputArray[index] = element;
    }

    //clear
    public void clear()
    {
        inputArray = Arrays.copyOf(inputArray, 0);
    }

    //indexOf
    public Integer indexOf(T element)
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            if (element.equals(inputArray[i]))
            {
                return i;
            }
        }
        return null;
    }

    //contains
    public boolean contains(T element)
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            if (element.equals(inputArray[i]))
            {
                return true;
            }
        }
        return false;
    }

    //remove
    public void remove(T element)
    {
       if(!contains(element))
       {
           T[] identicalArray = Arrays.copyOf(inputArray, inputArray.length);
           inputArray = identicalArray;
       }

       else
       {
           T[] reducedArray = Arrays.copyOf(inputArray, inputArray.length - 1);

           int indexToRemove = indexOf(element);

           for (int i = indexToRemove; i < inputArray.length -1; i++)
           {
               reducedArray[i] = inputArray[i + 1];
           }

           inputArray = reducedArray;
       }

    }


    public T[] toArray(T[] newArray)
    {
        return (T[]) Arrays.copyOf(inputArray, inputArray.length, newArray.getClass());
    }

    public T[] toArray()
    {
        T[] temp = (T[]) new Object[size()];

        for (int i = 0; i < size(); i++)
        {
            temp[i] = get(i);
        }

        return inputArray = temp;
    }

    //isEmpty
    public boolean isEmpty()
    {
        if (inputArray.length == 0)
        {
            return true;
        }

        return false;
    }


    //Display Array Contents
    public void printArrayContents()
    {
        String arrayAsString = Arrays.toString(inputArray);
        System.out.println(arrayAsString);

    }



}
