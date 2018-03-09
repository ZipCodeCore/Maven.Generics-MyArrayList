import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void addTest() {
        // If this fails you're fucked lol
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        int expected = 3;
        int actual = mySet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        Assert.assertEquals(mySet.size(), 2);
    }

    @Test
    public void clearTest() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.clear();
        Assert.assertEquals(mySet.size(), 0);
    }

    @Test
    public void toArrayTest() {
        MySet mySet = new MySet();
        Integer[] expected = {1, 2};
        mySet.add(1);
        mySet.add(2);
        Assert.assertArrayEquals(mySet.toArray(), expected);
    }

    @Test
    public void containsTest() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        Assert.assertTrue(mySet.contains(2));
    }

    @Test
    public void isEmptyTest() {
        MySet mySet = new MySet();
        Assert.assertTrue(mySet.isEmpty());
    }

}
