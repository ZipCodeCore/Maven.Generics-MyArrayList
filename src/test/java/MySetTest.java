import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void get() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(1);
        mySetTest.add(4);
        mySetTest.add(9);
        //When
        Integer actual = mySetTest.get(1);
        Integer expected = 4;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArray() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(1);
        mySetTest.add(4);
        mySetTest.add(9);
        //When
        Object[] actual = mySetTest.toArray();
        Object[] expected = {1, 4, 9};
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(1);
        mySetTest.add(1);
        //When
        Object[] actual = mySetTest.toArray();
        Object[] expected = {1};
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(1);
        mySetTest.add(1);
        mySetTest.remove(1);
        //When
        Object[] actual = mySetTest.toArray();
        Object[] expected = {};
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(1);
        mySetTest.add(1);
        mySetTest.clear();
        //When
        Object[] actual = mySetTest.toArray();
        Object[] expected = {};
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(2);
        mySetTest.add(3);
        mySetTest.add(4);
        //When
        Boolean actual = mySetTest.contains(4);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void empty() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        //When
        Boolean actual = mySetTest.empty();
        //Then
        Assert.assertTrue(actual);
    }
}