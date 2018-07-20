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
    public void constructor2Test(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Carolynn",100);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 300);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis", 400);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2,keyValue3};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String,Integer> myMap = new MyMap<>(myArrayList);
        String expected = "Carolynn";
        String actual = myMap.getMyMap().get(0).getKey();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructor3Test(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Carolynn",100);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 300);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis", 400);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2,keyValue3};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String,Integer> myMap = new MyMap<>(myArrayList);
        int expected = 300;
        int actual = myMap.getMyMap().get(0).getValue();
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void constructor4Test(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key",100);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 300);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis", 400);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2,keyValue3};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String,Integer> myMap = new MyMap<>(myArrayList);
        int expected = 3;
        int actual = myMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void putTest(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key", 5);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis",100);

        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        myMap.put(keyValue3);
        String actual = myMap.getMyMap().get(2).getKey();
        String expected = "Luis";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void put2Test(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        myMap.put(keyValue3);
        int actual = myMap.size();
        int expected = 2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis",100);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2, keyValue3};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        myMap.remove(myMap.size()-1);
        String expected = "Carolynn";
        String actual = myMap.getMyMap().get(myMap.size()-1).getKey();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis",100);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2, keyValue3};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        Assert.assertTrue(myMap.containsKey("Key"));
    }

    @Test
    public void containsValueTest(){
        KeyValuePair<String, Integer> keyValue1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> keyValue2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> keyValue3 = new KeyValuePair<>("Luis",100);
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{keyValue1,keyValue2, keyValue3};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        Assert.assertTrue(myMap.containsValue(100));
    }

    @Test
    public void isEmptyTest(){
        KeyValuePair<String, Integer>[] keyValueArray = new KeyValuePair[]{};
        MyArrayList<KeyValuePair<String, Integer>> myArrayList = new MyArrayList<>(keyValueArray);
        MyMap<String, Integer> myMap = new MyMap<>(myArrayList);
        Assert.assertTrue(myMap.isEmpty());
    }


}
