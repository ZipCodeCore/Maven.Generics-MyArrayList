import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void addTest() {
        MySet<Integer> testSet = new MySet<>();
        testSet.add(3);
        testSet.add(11);
        testSet.add(12);
        int expected = 11;
        int actual = testSet.get(1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addAtIndexTest() {
        MySet<Integer> testSet = new MySet<>();
        testSet.add(3);
        testSet.add(11);
        testSet.add(12);
        testSet.addAtIndex(0, 10);
        int expected = 10;
        int actual = testSet.get(0);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeTest() {
        MySet<Integer> testSet = new MySet<>();
        testSet.add(3);
        testSet.add(11);
        testSet.add(12);
        testSet.remove(1);
        int expected = 11;
        int actual = testSet.get(1);
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void setTest() {
        MySet<Integer> testSet = new MySet<>();
        testSet.add(3);
        testSet.add(12);
        testSet.set(1, 11);
        int expected = 11;
        int actual = testSet.get(1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clearTest() {
        MySet<Integer> testSet = new MySet<>();
        testSet.add(3);
        testSet.add(12);
        testSet.clear();

        boolean expected = true;
        boolean actual = testSet.isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        MySet<Integer> testSet = new MySet<>();
        testSet.add(3);
        testSet.add(12);

        boolean expected = true;
        boolean actual = testSet.contains(3);

        Assert.assertEquals(expected, actual);
    }
}