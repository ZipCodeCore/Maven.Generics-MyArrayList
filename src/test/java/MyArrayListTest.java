import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void size() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(1);
        //When
        Integer actual = arrayListTest.size();
        Integer expected = 1;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArray() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(3);
        arrayListTest.add(8);
        arrayListTest.add(9);
        //When
        Object[] actual = arrayListTest.toArray();
        Object[] expected = {3,8,9};
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(1);
        arrayListTest.add(1);
        //When
        Integer actual = arrayListTest.size();
        Integer expected = 2;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToIndexTest() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(1);
        arrayListTest.add(1);
        arrayListTest.addToIndex(1, 1);
        //When
        Integer actual = arrayListTest.size();
        Integer expected = 3;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(3);
        arrayListTest.add(8);
        arrayListTest.add(9);
        arrayListTest.remove(9);
        //When
        Object[] actual = arrayListTest.toArray();
        Object[] expected = {3,8};
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(1);
        arrayListTest.clear();
        //When
        Integer actual = arrayListTest.size();
        Integer expected = 0;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(1);
        arrayListTest.add(4);
        arrayListTest.add(8);
        //When
        Boolean actual = arrayListTest.contains(8);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void empty() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        //When
        Boolean actual = arrayListTest.empty();
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void indexOf() {
        //Given
        MyArrayList <Integer> arrayListTest = new MyArrayList<>();
        arrayListTest.add(1);
        arrayListTest.add(4);
        arrayListTest.add(7);
        //When
        Integer actual = arrayListTest.indexOf(7);
        Integer expected = 2;
        //Then
        Assert.assertEquals(expected, actual);
    }
}