package com.zipcodewilmington.myarraylist.carolynn;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void constructor1Test(){
        MyArrayList<String> it = new MyArrayList<>();
        Assert.assertNotNull(it);
    }

    @Test
    public void constructor2Test(){
        MyArrayList<String> it = new MyArrayList<>(3);
        Assert.assertNotNull(it);
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
        MyArrayList<Integer> actual = new MyArrayList<>();
        Integer[] input = {1, 2, 4, 5};
        Integer toBeAdded = 3;
        int indexPosition = 2;
        Integer[] expected = {1, 2, 3, 4, 5};
        actual.add(indexPosition, toBeAdded);
        Integer[] it = actual.getMyArrayList();
        Assert.assertArrayEquals(expected, it);
    }

    @Test
    public void getTest(){
        Integer[] input = {};
    }

}
