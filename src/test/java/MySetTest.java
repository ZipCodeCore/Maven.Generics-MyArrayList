import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void set() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(3);
        mySetTest.add(4);
        mySetTest.add(2);
        mySetTest.set(2,5);

        //When
        Object[] expected = {3,4,5};
        Object[] actual = mySetTest.toArray();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        //Given
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(3);
        mySetTest.add(4);
        mySetTest.add(2);

        //When
        int expected = 4;
        int actual = mySetTest.get(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArray() {
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(4);
        mySetTest.add(2);
        mySetTest.add(1);

        //When
        Integer[] expected = {4,2,1};
        Integer[] actual = mySetTest.toArray(new Integer[0]);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArray1() {
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(4);
        mySetTest.add(2);
        mySetTest.add(1);

        //When
        Object[] expected = {4,2,1};
        Object[] actual = mySetTest.toArray();


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add() {
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(3);
        mySetTest.add(2);
        mySetTest.add(5);


        //When
        Integer[] expected = {3,2,5};
        Integer[] actual = mySetTest.toArray(new Integer[0]);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(3);
        mySetTest.add(2);
        mySetTest.add(5);
        mySetTest.remove(5);


        //When
        Integer[] expected = {3,2};
        Integer[] actual = mySetTest.toArray(new Integer[0]);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(3);
        mySetTest.add(2);
        mySetTest.add(5);
        mySetTest.remove(5);
        mySetTest.clear();


        //When
        Integer[] expected = {};
        Integer[] actual = mySetTest.toArray(new Integer[0]);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() {
        MySet<Integer> mySetTest = new MySet<>();
        mySetTest.add(3);
        mySetTest.add(2);
        mySetTest.add(5);


        //When
        boolean actual = mySetTest.contains(3);


        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isEmpty() {
        MySet<Integer> mySetTest = new MySet<>();


        //When
        boolean actual = mySetTest.isEmpty();


        //Then
        Assert.assertTrue(actual);
    }
}