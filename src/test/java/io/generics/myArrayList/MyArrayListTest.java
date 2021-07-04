package io.generics.myArrayList;

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
        MyArrayList<String> myArrayList = new MyArrayList<>(new String[]{"1", "2", "3", "4"});
        String toBeAdded = "5";
        String[] expected = {"1","2","3","4","5"};
        myArrayList.add(toBeAdded);
        String[] actual = myArrayList.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add2Test(){
        MyArrayList<Integer> myArray = new MyArrayList<>(new Integer[]{1, 2, 4, 5});
        Integer toBeAdded = 3;
        Integer[] expected = {1, 2, 3, 4, 5};
        myArray.addAt(2, toBeAdded);
        Integer[] actual = myArray.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addAllTest1(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>(new Integer[]{1,2,3,4,5});
        Integer[] toAdd = {6,7,8};
        boolean x = myArrayList.addAll(toAdd);
        Integer [] expected = {1,2,3,4,5,6,7,8};
        Integer[] actual = myArrayList.toMyArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addAllTest2(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> id = new MyArrayList<>(input);
        Integer[] toAdd = {6,7,8};
        Integer[] expected = {1,2,6,7,8,3,4,5};
        id.addAll(2, toAdd);
        Integer[] actual = id.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getTest(){
        MyArrayList<Integer> array = new MyArrayList<>(new Integer[]{1, 2, 3, 4, 5, 6});
        Integer expected = 4;
        Integer actual = array.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIndexTest(){
        MyArrayList<Integer> array = new MyArrayList<>(new Integer[]{1,2,3,4,5});
        Integer[] expected = {1,2,3,5};
        array.remove(3);
        Integer[] actual = array.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeItemTest(){
        MyArrayList<String> arrayList = new MyArrayList<>(new String[]{"a","b","c","d","e","f"});
        String[] expected = {"a","b","d","e","f"};
        arrayList.remove("c");
        String[] actual = arrayList.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeAllTest(){
        MyArrayList<String> arrayList = new MyArrayList<>(new String[]{"a","b","c","d","e","f","g","h"});
        String[] expected = {"a","b","c","f"};
        String[] toRemove = {"d","e","g","h"};
        arrayList.removeAll(toRemove);
        String[] actual = arrayList.toMyArray();
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void replaceTest(){
        MyArrayList<String> arrayList = new MyArrayList<>(new String[]{"a","b","c","d","e","f"});
        String[] expected = {"a","b","c","c","e","f"};
        arrayList.replace(3,"c");
        String[] actual = arrayList.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void retainAllTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>(new Integer[]{1,2,2,3,4,5,6,7,8});
        Integer[] expected = {2,2,4,6,8};
        arrayList.retainAll(new Integer[]{2,4,6,8});
        Integer[] actual = arrayList.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void retainAll2Test(){
        String[] input= {"a","b","c","d","e","f"};
        MyArrayList<String> arrayList = new MyArrayList<>(input);
        String[] expected = {"a","c","f"};
        arrayList.retainAll(new String[]{"a","c","f"});
        String[] actual = arrayList.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void clearTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer[] expected = {};
        array.clear();
        Integer[] actual = array.toMyArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void setTest(){
        Integer[] input = {1,2,3,4};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer expected = 2;
        Integer actual = array.set(1,10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest2() {
        MyArrayList<Integer> array = new MyArrayList<>(new Integer[]{1, 2, 3, 4});
        Integer expected = 10;
        array.set(1, 10);
        Integer actual = array.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        MyArrayList<Integer> array = new MyArrayList<>(new Integer[]{1,2,3,4,5,6});
        boolean actual = array.contains(4);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsAllTest(){
        MyArrayList<Integer> array = new MyArrayList<>(new Integer[]{1,2,3,4,5,6});
        boolean actual = array.containsAll(new Integer[]{2,4});
        Assert.assertTrue(actual);
    }

    @Test
    public void isEmptyTest(){
        MyArrayList<String> array = new MyArrayList<>(new String[]{});
        
        Assert.assertTrue(array.isEmpty());
    }

    @Test
    public void subListTest(){
        MyArrayList<Integer> array = new MyArrayList<>(new Integer[]{1,2,3,4,5,6,7});
        Integer[] expected = {3,4,5};
        Integer[] actual = array.subList(2, 5);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        Integer[] input = {1,2,3,4,5,6,7};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        int expected = 7;
        int actual = array.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfTest(){
        Integer[] input = {1,2,3,4,5,4,4};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        int expected = 3;
        int actual = array.indexOf(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastIndexOfTest(){
        Integer[] input = {1,2,3,4,5,4,4};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        int expected = 6;
        int actual = array.lastIndexOf(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArrayTest1(){
        Integer[] input = {1,2,3,4,5,6,7};
        MyArrayList<Integer> myArrayList = new MyArrayList<>(input);
        Object[] expected = {1,2,3,4,5,6,7};
        Object[] actual = myArrayList.toArray();
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void countDupesTest(){
        Integer[] input = {1,1,2,1,3,1,4,1,5,1,6,1,7};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer expected = 7;
        Integer actual = array.countDuplicates(0);
        Assert.assertEquals(expected, actual);
    }
}
