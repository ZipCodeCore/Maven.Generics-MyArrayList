import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyArrayListTest {


    @Test
    public void addTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(3);
        myArrayList.add(6);
        //Then
        Integer[] actual = myArrayList.toArray(new Integer[myArrayList.size()]);
        Integer[] expected = new Integer[]{3, 6};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add1Test(){
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        myArrayList.add1(2, 7);

        //Then
        Integer expected = 2;
        Integer actual = myArrayList.get(7);

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        //Then
        Integer expected = 3;
        Assert.assertEquals(expected, myArrayList.get(2));
    }

    @Test
    public void removeTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.remove(1);
        //Then
        Integer[] actual = myArrayList.toArray(new Integer[myArrayList.size()]);
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};
        Integer[] actual = myArrayList.toArray(new Integer[myArrayList.size()]);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.clear();
        Assert.assertEquals(myArrayList.size(), 0);
        Assert.assertTrue(myArrayList.isEmpty());
    }


    @Test
    public void containsTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //When
        myArrayList.add(4);
        myArrayList.add(5);
        Assert.assertTrue(myArrayList.contains(4));
        Assert.assertFalse(myArrayList.contains(9));
    }




}