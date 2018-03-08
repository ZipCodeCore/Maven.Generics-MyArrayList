import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayListTest {

    @Test
    public void addTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>(5);
        Integer num = 8;
        Integer expected = 8;
        testArrayList.add(num);
        Integer actual = testArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTestSize(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        Integer actual = testArrayList.size();
        Integer expected = 2;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        Integer[] visual = {3, 4, 8};
        testArrayList.add(3);
        testArrayList.add(4);
        testArrayList.add(8);
        testArrayList.remove(1);
        Integer[] removed = {4, 8};
        Integer expected = 2;
        Integer actual = testArrayList.size();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest2(){
        MyArrayList<String> testArrayList = new MyArrayList<>();
        String[] visual = {"3", "4", "8"};
        testArrayList.add("3");
        testArrayList.add("4");
        testArrayList.add("8");
        testArrayList.remove("3");
        Integer expected = 2;
        Integer actual = testArrayList.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(3);
        testArrayList.add(4);
        testArrayList.add(5);
        Integer expected = 5;
        Integer actual = testArrayList.get(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(5);
        testArrayList.set(0, 10);
        Integer expected = 10;
        Integer actual = testArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void clearTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(5);
        testArrayList.add(6);
        testArrayList.add(7);
        Integer expected = 0;
        testArrayList.clear();
        Integer actual = testArrayList.size();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void isEmptyTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        Assert.assertTrue(testArrayList.isEmpty());
    }
    @Test
    public void containsTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(5);
        testArrayList.add(6);
        testArrayList.add(7);
        boolean actual = testArrayList.contains(5);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sizeTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(5);
        testArrayList.add(6);
        testArrayList.add(7);
        Integer expected = 3;
        Integer actual = testArrayList.size();
        Assert.assertEquals(expected, actual);
    }
}
