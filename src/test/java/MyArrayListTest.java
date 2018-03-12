import org.junit.Assert;
import org.junit.Test;


public class MyArrayListTest
{

    @Test
    public void addTest()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        Integer expected = 5;
        myArrayList.add(expected);

        //When
        Integer actual = myArrayList.get(0);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addAnyWhereTest()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(4);
        myArrayList.add(5);
        Integer expected = 3;
        myArrayList.addAnywhere(3, 2);

        //When
        Integer actual = 3;

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();


    }

    @Test
    public void getTest()
    {
        //Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("I");
        myArrayList.add("love");
        myArrayList.add("myself");
        String expected = "myself";

        //When
        String actual = myArrayList.get(2);

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void setTest()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(4);
        Integer expected = 3;
        myArrayList.set(2, 3);

        //When
        Integer actual = myArrayList.get(2);

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();

    }

    @Test
    public void clearTest()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        myArrayList.clear();

        boolean expected = true;

        //When
        boolean actual = myArrayList.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();


    }


    @Test
    public void indexOfTest()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(2);
        myArrayList.add(5);
        Integer expected = 3;

        //When
        Integer actual = myArrayList.indexOf(5);

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();


    }

    @Test
    public void containsTest1()
    {
        //Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("I");
        myArrayList.add("love");
        myArrayList.add("Myself");
        boolean expected = true;

        //When
        boolean actual = myArrayList.contains("love");

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();

    }

    @Test
    public void containsTest2()
    {
        //Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("I");
        myArrayList.add("love");
        myArrayList.add("Myself");
        boolean expected = false;

        //When
        boolean actual = myArrayList.contains("you");

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();

    }


    @Test
    public void removeTest1()
    {
        //Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("I");
        myArrayList.add("love");
        myArrayList.add("myself");
        myArrayList.add("too");


        myArrayList.remove("I");

        String [] expected = {"love", "myself", "too"};

        //When
        String [] actual = myArrayList.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
        myArrayList.printArrayContents();
    }

    @Test
    public void removeTest2()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        myArrayList.remove(1);

        Integer [] expected = {2, 3, 4};

        //When
        Integer [] actual = myArrayList.toArray(new Integer[0]);

        Assert.assertArrayEquals(expected, actual);
        myArrayList.printArrayContents();
    }

    @Test
    public void toArrayTest1()
    {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        Integer [] expected = {1, 2, 3, 4};

        //When
        Integer [] actual = myArrayList.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
        myArrayList.printArrayContents();

    }

    @Test
    public void toArrayTest2()
    {
        //Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("I");
        myArrayList.add("like");
        myArrayList.add("pizza");

        String [] expected = {"I", "like", "pizza"};

        //When
        Object [] actual = myArrayList.toArray();

        //Then
        Assert.assertArrayEquals(expected, actual);
        myArrayList.printArrayContents();
    }








    @Test
    public void isEmptyTest()
    {
        //Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("I");
        myArrayList.add("love");
        myArrayList.add("myself");
        boolean expected = false;

        //When
        boolean actual = myArrayList.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
        myArrayList.printArrayContents();


    }




}
