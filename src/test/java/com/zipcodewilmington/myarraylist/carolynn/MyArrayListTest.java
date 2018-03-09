package com.zipcodewilmington.myarraylist.carolynn;

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
        Assert.assertNotNull(array);
    }

    @Test
    public void addTest(){
        Integer[] input = {1, 2, 3, 4};
        MyArrayList<Integer> it = new MyArrayList<Integer>(input);
        Integer toBeAdded = 5;
        Integer[] expected = {1, 2, 3, 4, 5};
        it.add(toBeAdded);
        Integer[] actual = it.getMyArrayList();
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
        Integer[] input = {};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        boolean expected = true;
        boolean actual = array.isEmpty();
        Assert.assertEquals(expected, actual);
    }
}
