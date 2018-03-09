import org.junit.Assert;
import org.junit.Test;

public class MySetTest {


    @Test
    public void addTest(){
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        int expected = 3;
        int actual = testSet.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAtIndexTest(){
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.add(4,0);
        int expected = 4;
        int actual = testSet.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.remove(1);
        int expected = 2;
        int actual = testSet.get(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setTest(){
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.set(4,1);
        int expected = 4;
        int actual = testSet.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.clear();
        boolean expected = true;
        boolean actual = testSet.isEmpty();
        Assert.assertEquals(expected, actual);
    }
}
