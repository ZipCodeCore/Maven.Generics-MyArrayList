import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void size() {
        MySet<String> mySet = new MySet<>();

        Integer expected = 0;
        Integer actual = mySet.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add() {
        MySet<Integer> mySet = new MySet<>();
        mySet.add(111);
        mySet.add(222);
        mySet.add(333);

        Integer expected = 3;
        Integer actual = mySet.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addDuplicate(){
        MySet<Integer> mySet = new MySet<>();
        mySet.add(111);
        mySet.add(222);
        mySet.add(333);

//        boolean expected1 = false;
//        boolean actual1 = mySet.add(222);
//
//        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void get() {
        MySet<Integer> mySet = new MySet<>();
        mySet.add(111);
        mySet.add(222);
        mySet.add(333);

        Integer expected = 222;
        Integer actual = mySet.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        MySet<String> mySet = new MySet<>();
        mySet.add("hello");
        mySet.add("my");
        mySet.add("name");
        mySet.add("is");
        mySet.add("bob");

        Integer expected = 2;
        Integer actual = mySet.indexOf("name");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        MySet<String> mySet = new MySet<>();
        mySet.add("hello");
        mySet.add("my");
        mySet.add("name");
        mySet.add("is");
        mySet.add("bob");

        mySet.remove(1);

        Integer expected = 5;
        Integer actual = mySet.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void set() {
        MySet<String> mySet = new MySet<>();
        mySet.add("hello");
        mySet.add("my");
        mySet.add("name");
        mySet.add("is");
        mySet.add("bob");

        mySet.set(1, "name");

        String expected = "name";
        String actual = mySet.get(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clear() {
        MySet<String> mySet = new MySet<>();
        mySet.add("hello");
        mySet.add("my");
        mySet.add("name");
        mySet.add("is");
        mySet.add("bob");

        mySet.clear();

        int expected = 0;
        int actual = mySet.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmpty() {
        MySet<String> mySet = new MySet<>();
        mySet.add("hello");
        mySet.add("my");
        mySet.add("name");
        mySet.add("is");
        mySet.add("bob");

        boolean expected = false;
        boolean actual = mySet.isEmpty();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void contains() {

        MySet<String> mySet = new MySet<>();
        mySet.add("hello");
        mySet.add("my");
        mySet.add("name");
        mySet.add("is");
        mySet.add("bob");

        boolean expected = true;
        boolean actual = mySet.contains("bob");

        Assert.assertEquals(expected,actual);
    }
}