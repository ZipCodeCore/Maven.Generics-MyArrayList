

import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void constructor1Test(){
        MyArrayList<String> array = new MyArrayList<>();
        Assert.assertNotNull(array);
    }

    @Test
    public void constructor2Test(){
        MyArrayList<String> array = new MyArrayList<>(3);
        int expected = 3;
        int actual = array.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        String[] input = {"1", "2", "3", "4"};
        MyArrayList<String> it = new MyArrayList<>(input);
        String toBeAdded = "5";
        String[] expected = {"1","2","3","4","5"};
        it.add(toBeAdded);
        String[] actual = it.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add3Test(){
        MyArrayList<Integer> myArray = new MyArrayList<>();
        Integer toBeAdded = 5;
        Integer[] expected = {5};
        myArray.add(toBeAdded);
        Object[] actual = myArray.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add2Test(){
        Integer[] input = {1, 2, 4, 5};
        MyArrayList<Integer> actual = new MyArrayList<>(input);
        Integer toBeAdded = 3;
        int indexPosition = 2;
        Integer[] expected = {1, 2, 3, 4, 5};
        actual.add(indexPosition, toBeAdded);
        Integer[] it = actual.getMyArrayList();
        Assert.assertArrayEquals(expected, it);
    }

    @Test
    public void addAllTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> id = new MyArrayList<>(input);
        Integer[] toAdd = {6,7,8};
        id.addAll(toAdd);
        Integer [] expected = {1,2,3,4,5,6,7,8};
        Integer[] actual = id.getMyArrayList();

        Assert.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void removeAllTest(){
//        Integer[] input ={1,2,3,4,5,6,7,8};
//        MyArrayList<Integer> id = new MyArrayList<>(input);
//        Integer[] toRemove = {2,4,6,8};
//        id.removeAll(toRemove);
//        Integer[] actual = id.getMyArrayList();
//        Integer[] expected = {1,3,5,7};
//
//        Assert.assertArrayEquals(expected, actual);
//    }

    @Test
    public void getTest(){
        Integer[] input = {1, 2, 3, 4, 5, 6};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer expected = 4;
        Integer actual = array.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer[] expected = {1,2,3,5};
        array.remove(3);
        Integer[] actual = array.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer[] expected = {};
        array.clear();
        Integer[] actual = array.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void setTest(){
        Integer[] input = {1,2,3,4};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer expected = 2;
        Integer actual = array.set(10,1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        Integer[] input = {1,2,3,4,5,6};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        boolean expected = true;
        boolean actual = array.contains(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        String[] input = {};
        MyArrayList<String> array = new MyArrayList<>(input);
        boolean expected = true;
        boolean actual = array.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subListTest(){
        Integer[] input = {1,2,3,4,5,6,7};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer[] expected = {3,4,5};
        Integer[] actual = array.subList(2, 5);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void size(){
        Integer[] input = {1,2,3,4,5,6,7};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        int expected = 7;
        int actual = array.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countDupesTest(){
        Integer[] input = {1,1,2,1,3,1,4,1,5,1,6,1,7};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer expected = 7;
        Integer actual = array.countDupes(0);
        Assert.assertEquals(expected, actual);
    }
}
