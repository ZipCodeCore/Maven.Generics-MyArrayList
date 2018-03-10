import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MyArrayListTest {

    @Test
    public void addTest() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("hello");
        myArrayList.add("world");

        Integer expected = 2;
        Integer actual = myArrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addByIndexTest() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("my");
        myArrayList.add("name");
        myArrayList.add("is");
        myArrayList.add("bo");
        myArrayList.add(0, "hey");

        String expected = "hey";
        String actual = myArrayList.get(0);
        System.out.println(myArrayList.printOut());;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(333);
        myArrayList.add(222);

        Integer expected = 222;
        Integer actual = myArrayList.get(1);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(333.1);
        myArrayList.add(222.99);
        myArrayList.add(21.34);
        myArrayList.remove(1);

        Double expected = 21.34;
        Double actual = myArrayList.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(333.1);
        myArrayList.add(222.99);
        myArrayList.add(21.34);
        myArrayList.set(1, 99.8);

        Double expected = 99.8;
        Double actual = myArrayList.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(333.1);
        myArrayList.add(222.99);
        myArrayList.add(21.34);

        myArrayList.clear();

        int expected = 0;
        int actual = myArrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(333.1);
        myArrayList.add(222.99);
        myArrayList.add(21.34);
        myArrayList.remove(1);

        boolean expected = false;
        boolean actual = myArrayList.isEmpty();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void sizeTest() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("welcome");
        myArrayList.add("home");

        Integer expected = 4;
        Integer actual = myArrayList.size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void containsTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(333.1);
        myArrayList.add(222.99);
        myArrayList.add(21.34);
        myArrayList.remove(1);

        boolean expected = false;
        boolean actual = myArrayList.contains(21.22);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(333.1);
        myArrayList.add(222.99);
        myArrayList.add(21.34);

        Integer expected = 2;
        Integer actual = myArrayList.indexOf(21.34);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printOut(){
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("my");
        myArrayList.add("name");
        myArrayList.add("is");
        myArrayList.add("bo");

        String expected = "hello world my name is bo ";
        String actual = myArrayList.printOut();
        Assert.assertEquals(expected, actual);
    }
}