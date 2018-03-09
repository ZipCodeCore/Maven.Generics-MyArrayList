package com.zipcodewilmington.myarraylist.carolynn;

import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void constructorTest(){
        String[] input = {"a", "b", "c", "a", "d"};
        MySet<String> mySet = new MySet<>(input);
        String[] expected = {"a", "b", "c", "d"};
        String[] actual = mySet.getMySet();
        Assert.assertArrayEquals(expected, actual);
    }
}
