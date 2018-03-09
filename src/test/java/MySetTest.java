import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void addTest() {
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 5;

        mySet.add(expected);
        Integer actual = mySet.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 5;

        mySet.add(expected, 0);
        mySet.add(10);

        Integer actual = mySet.get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 5;

        mySet.add(10);
        mySet.add(expected);

        mySet.remove(0);
        Integer actual = mySet.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 5;

        mySet.add(10);
        mySet.set(expected, 0);

        Integer actual = mySet.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MySet<Integer> mySet = new MySet<>();
        Integer num = 5;

        mySet.add(10);
        mySet.add(num);

        mySet.clear();

        Assert.assertTrue(mySet.isEmpty());

    }

    @Test
    public void containsTest() {
        MySet<Integer> mySet = new MySet<>();
        Integer num = 5;

        mySet.add(10);
        mySet.add(num);

        Assert.assertTrue(mySet.contains(10));
    }

    @Test
    public void sizeTest() {
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 2;

        mySet.add(10);
        mySet.add(expected);

        Integer actual = mySet.size();

        Assert.assertEquals(expected, actual);
    }
}
