import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void set() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(2);
        arrayListTest.set(2,5);

        //When
        Integer expected = 2;
        Integer actual = arrayListTest.indexOf(5);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void get() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(2);

        //When
        Integer expected = 4;
        Integer actual = arrayListTest.get(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(2);

        //When
        Integer expected = 1;
        Integer actual = arrayListTest.indexOf(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArray() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(5);

        //When
        Integer[] expected = {3, 4, 5};
        Integer[] actual = arrayListTest.toArray(new Integer[0]);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toArrayFromArrayList() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(5);

        //When
        Integer[] expected = {3, 4, 5};
        Object[] actual = arrayListTest.toArray();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void add() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);

        //When
        Integer expected = 1;
        Integer actual = arrayListTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToIndex() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(1,3);

        //When
        Integer expected = 3;
        Integer actual = arrayListTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        Integer[] intArray = {3,4,5};
        arrayListTest.addAll(intArray);

        //When
        Integer[]expected = {3,4,3,4,5};
        Integer[] actual = arrayListTest.toArray(new Integer[0]);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void remove() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(6);
        arrayListTest.add(5);
        arrayListTest.add(4);
        arrayListTest.add(2);

        arrayListTest.remove(4);

        //When
        Integer[] expected = {3,6,5,4,2};
        Integer[] actual = arrayListTest.toArray(new Integer[0]);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove1() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        arrayListTest.add(5);
        arrayListTest.remove(7);

        //When
        Integer[] expected = {3,4,5};
        Integer[] actual = arrayListTest.toArray(new Integer[0]);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void clear() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        Integer[] intArray = {3,4,5};
        arrayListTest.addAll(intArray);
        arrayListTest.clear();

        //When
        Integer expected = 0;
        Integer actual = arrayListTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();
        arrayListTest.add(3);
        arrayListTest.add(4);
        Integer[] intArray = {3,4,5};
        arrayListTest.addAll(intArray);

        //When
        boolean actual = arrayListTest.contains(3);

        //Then
        Assert.assertTrue(actual);
    }


    @Test
    public void isEmpty() {
        //Given
        MyArrayList<Integer> arrayListTest = new MyArrayList<Integer>();

        //When
        boolean actual = arrayListTest.isEmpty();

        //Then
        Assert.assertTrue(actual);
    }
}