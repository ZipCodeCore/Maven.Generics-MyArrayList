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
        String[] input = {"1", "2", "3", "4"};
        MyArrayList<String> it = new MyArrayList<>(input);
        String toBeAdded = "5";
        String[] expected = {"1","2","3","4","5"};
        boolean x = it.add(toBeAdded);
        String[] actual = it.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add3Test(){
        MyArrayList<Integer> myArray = new MyArrayList<>();
        Integer toBeAdded = 5;
        Integer[] expected = {5};
        boolean x = myArray.add(toBeAdded);
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
    public void addAllTest1(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> id = new MyArrayList<>(input);
        Integer[] toAdd = {6,7,8};
        boolean x = id.addAll(toAdd);
        Integer [] expected = {1,2,3,4,5,6,7,8};
        Integer[] actual = id.getMyArrayList();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addAllTest2(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> id = new MyArrayList<>(input);
        Integer[] toAdd = {6,7,8};
        Integer[] expected = {1,2,6,7,8,3,4,5};
        id.addAll(2, toAdd);
        Integer[] actual = id.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
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
    public void remove2Test(){
        String[] input = {"a","b","c","d","e","f"};
        MyArrayList<String> arrayList = new MyArrayList<>(input);
        String[] expected = {"a","b","d","e","f"};
        arrayList.remove("c");
        String[] actual = arrayList.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void removeAllTest(){
//        Integer[] input ={1,2,3,4,5,6,7,8};
//        MyArrayList<Integer> id = new MyArrayList<>(input);
//        Integer[] toRemove = {1,2,3,4};
//        id.removeAll(toRemove);
//        Integer[] actual = id.getMyArrayList();
//        Integer[] expected = {5,6,7,8};
//
//        Assert.assertArrayEquals(expected, actual);
//    }

    @Test
    public void retainAllTest(){
        Integer[] input ={1,2,3,4,5,6,7,8};
        MyArrayList<Integer> arrayList = new MyArrayList<>(input);
        Integer[] expected = {2,4,6,8};
        arrayList.retainAll(new Integer[]{2,4,6,8});
        Integer[] actual = arrayList.getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void retainAll2Test(){
        String[] input= {"a","b","c","d","e","f"};
        MyArrayList<String> arrayList = new MyArrayList<>(input);
        String[] expected = {"a","c","f"};
        arrayList.retainAll(new String[]{"a","c","f"});
        String[] actual = arrayList.getMyArrayList();
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
        Integer actual = array.set(1,10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest2() {
        Integer[] input = {1, 2, 3, 4};
        MyArrayList<Integer> array = new MyArrayList<>(input);
        Integer expected = 10;
        Integer removed = array.set(1, 10);
        Integer actual = array.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        Integer[] input = {1,2,3,4,5,6};
        MyArrayList<Integer> array = new MyArrayList<>(input);

        Assert.assertTrue(array.contains(4));
    }

    @Test
    public void isEmptyTest(){
        String[] input = {};
        MyArrayList<String> array = new MyArrayList<>(input);
        
        Assert.assertTrue(array.isEmpty());
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
    public void toArrayTest2(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer[] expected = {1,2,3,4,5,4,4};
        Integer[] actual = myArrayList.toArray(expected);
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
