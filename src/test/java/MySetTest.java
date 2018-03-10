import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void sizeTest(){
        MySet<Integer> testSet = new MySet();
        testSet.add(1);
        int expected = 1;
        int actual = testSet.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTest(){
        MySet<Integer> testSet = new MySet();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        int expected = 3;
        int actual = testSet.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTest2(){
        MySet<Integer> testSet = new MySet();
        testSet.add(1);
        testSet.add(2);
        testSet.add(2);
        testSet.add(2);
        int expected = 2;
        int actual = testSet.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTest3(){
        MySet<Integer> testSet = new MySet();
        testSet.add(1);
        testSet.add(2);
        testSet.add(2, 3);
        int expected = 3;
        int actual = testSet.get(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTest4(){
        MySet<Integer> testSet = new MySet();
        testSet.add(1);
        testSet.add(2);
        int expected = 2;
        int actual = testSet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        MySet<Integer> testSet = new MySet();
        testSet.add(1);
        testSet.add(2);
        testSet.remove(1);
        int actual = testSet.size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isEmptyTest(){
        MySet<Integer> testSet = new MySet();
        Assert.assertTrue(testSet.isEmpty());
    }
    @Test
    public void containsTest(){
        MySet<Integer> testSet = new MySet();
        testSet.add(5);
        Assert.assertTrue(testSet.contains(5));
    }
    @Test
    public void clearTest(){
        MySet<Integer> testSet = new MySet();
        testSet.add(5);
        testSet.add(1);
        testSet.clear();
        int expected = 0;
        int actual = testSet.size();
        Assert.assertEquals(expected, actual);
    }
}
