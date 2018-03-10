

import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void constructorTest(){
        String[] input = {"a", "b", "c", "a", "d", "a"};
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
        Integer[] input = {1,2,3,4,6};
        MySet<Integer> mySet = new MySet<>(input);
        Integer toBeAdded = 6;
        Object[] expected = {1,2,3,4,6};
        mySet.add(toBeAdded);
        Object[] actual = mySet.getMySet();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        Integer[] input = {1,2,3,4,5};
        MySet<Integer> mySet = new MySet<>(input);
        int index = 2;
        Object[] expected = {1,2,4,5};
        mySet.remove(index);
        Object[] actual = mySet.getMySet();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        Integer[] input = {1,2,3,4,5};
        MySet<Integer> mySet = new MySet<>(input);
        int expected = 5;
        int actual = mySet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        Integer[] input = {1,2,3,4,5};
        MySet<Integer> mySet = new MySet<>(input);
        boolean expected = true;
        boolean actual = mySet.contains(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        Integer[] input = {4};
        MySet<Integer> mySet = new MySet<>(input);
        boolean expected = false;
        boolean actual = mySet.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty2Test(){
        Integer[] input = {};
        MySet<Integer> mySet = new MySet<>(input);
        boolean expected = true;
        boolean actual = mySet.isEmpty();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clearTest(){
        Integer[] input = {1,2,3,4,5};
        MySet<Integer> mySet = new MySet<>(input);
        Object[] expected = {};
        mySet.clear();
        Object[] actual = mySet.getMySet();
        Assert.assertArrayEquals(expected, actual);
    }

}
