package io.generics.myArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyMapTest {

    @Test
    public void constructorTest(){
        MyMap<String, Integer> myMap = new MyMap<>();
        int expected = 16;
        int actual = myMap.getMyMap().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis",100);
        KeyValuePair<String, Integer> [] keyValueArray = new KeyValuePair[3];
        keyValueArray[0] = keyValue1;
        keyValueArray[1] = new KeyValuePair<>("Id",7);
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        myMap.add(keyValue3);
        KeyValuePair<String, Integer>[] actual = myMap.toArray();
        KeyValuePair<String, Integer>[] expected = new KeyValuePair []{keyValue1,keyValue2,keyValue3};

        Assert.assertArrayEquals(expected,actual);

    }

}
