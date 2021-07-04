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
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Carolynn",100);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 300);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis", 400);
        MyMap<String,Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2,kV3}));
        KeyValuePair<String, Integer> expected = kV2;
        KeyValuePair<String, Integer> actual = myMap.getMyMap().get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructor3Test(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",100);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 300);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis", 400);
        MyMap<String,Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2,kV3}));
        int expected = 3;
        int actual = myMap.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void putTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key", 5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",100);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2}));
        myMap.put(kV3);
        KeyValuePair<String, Integer> expected = kV3;
        KeyValuePair<String, Integer> actual = myMap.getMyMap().get(2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void put2Test(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Carolynn", 200);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2}));
        myMap.put(kV3);
        int actual = myMap.getMyMap().get(myMap.size()-1).getValue();
        int expected = 200;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void putAllTest() {
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key", 5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis", 100);
        MyMap<String, Integer> myMap1 = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1, kV2, kV3}));

        KeyValuePair<String,Integer> kV4  = new KeyValuePair<>("Sandra", 50);
        KeyValuePair<String,Integer> kV5 = new KeyValuePair<>("Andy", 75);
        MyArrayList<KeyValuePair<String,Integer>> myMap2 = new MyArrayList<>(new KeyValuePair[]{kV4,kV5,kV3});

        myMap1.putAll(myMap2);
        KeyValuePair<String,Integer>[] expected = new KeyValuePair[]{kV1,kV2,kV4,kV5,kV3};
        KeyValuePair<String,Integer> [] actual = myMap1.getMyMap().toMyArray();
        Assert.assertArrayEquals(expected,actual);
    }



    @Test
    public void removeTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",100);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        myMap.remove(myMap.size()-1);
        String expected = "Carolynn";
        String actual = myMap.getMyMap().get(myMap.size()-1).getKey();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",100);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        Assert.assertTrue(myMap.containsKey("Key"));
    }

    @Test
    public void containsValueTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",200);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        Assert.assertTrue(myMap.containsValue(100));
    }

    @Test
    public void isEmptyTest(){
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{}));
        Assert.assertTrue(myMap.isEmpty());
    }

    @Test
    public void clearTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",100);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        myMap.clear();
        Assert.assertTrue(myMap.isEmpty());
    }

    @Test
    public void getTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",200);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        Integer actual = myMap.get("Luis");
        Integer expected = 200;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void keySetTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",200);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        String[] expected = {"Key","Carolynn","Luis"};
        Object[] actual = myMap.keySet().getMySet().toMyArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void valuesTest(){
        KeyValuePair<String, Integer> kV1 = new KeyValuePair<>("Key",5);
        KeyValuePair<String, Integer> kV2 = new KeyValuePair<>("Carolynn", 100);
        KeyValuePair<String, Integer> kV3 = new KeyValuePair<>("Luis",200);
        MyMap<String, Integer> myMap = new MyMap<>(new MyArrayList<>(new KeyValuePair[]{kV1,kV2, kV3}));
        Integer[] expected = {5,100,200};
        Object[] actual = myMap.values().toMyArray();
        Assert.assertArrayEquals(expected,actual);
    }




}
