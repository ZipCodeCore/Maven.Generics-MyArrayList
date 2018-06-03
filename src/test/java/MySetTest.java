

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
public class MySetTest {

    @Test
    public void constructorTest(){
        String[] in = new String[]{"a","b","c", "d"};
        MyArrayList<String> input = new MyArrayList<>(in);
        MySet<String> mySet = new MySet<>(input);
        int expected = 4;
        int actual = mySet.size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void constructor2Test(){
        MySet<Integer> mySet = new MySet<>();
        int expected = 16;
        int actual = mySet.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructor3Test(){
        MySet<Integer> mySet = new MySet<>(3);
        int expected = 3;
        int actual = mySet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Integer[] in = {1,2,3,4,6};
        MyArrayList<Integer> input = new MyArrayList<>(in);
        MySet<Integer> mySet = new MySet<>(input);
        Integer toBeAdded = 6;
        MyArrayList<Integer> expected = input;
        mySet.add(toBeAdded);
        MyArrayList<Integer> actual = mySet.getMySet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add2Test(){
        Integer[] in = {1,2,3,4,6};
        MyArrayList<Integer> input = new MyArrayList<>(in);
        MySet<Integer> mySet = new MySet<>(input);
        Integer toBeAdded = 7;
        Integer[] expected = {1,2,3,4,6,7};
        mySet.add(toBeAdded);
        Integer[] actual = mySet.toArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add3Test(){
        Integer[] in = {1,2,3,4,6};
        MyArrayList<Integer> input = new MyArrayList<>(in);
        MySet<Integer> mySet = new MySet<>(input);
        Integer toBeAdded = 7;
        Integer[] expected = {1,2,7,3,4,6};
        mySet.add(2, toBeAdded);
        Integer[] actual = mySet.toArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        int index = 2;
        mySet.remove(index);
        Integer[] expected = {1,2,4,5};
        Integer[] actual = mySet.toArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void sizeTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        int expected = 5;
        int actual = mySet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        boolean expected = true;
        boolean actual = mySet.contains(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        Integer[] input = {4};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        boolean expected = false;
        boolean actual = mySet.isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty2Test(){
        Integer[] input = {};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        boolean expected = true;
        boolean actual = mySet.isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        Integer[] expected = {};
        mySet.clear();
        Integer[] actual = mySet.toArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        Integer actual = mySet.get(1);
        Integer expected = 2;

        Assert.assertEquals(expected, actual);
    }


}
