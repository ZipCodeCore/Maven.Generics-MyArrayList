import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

//    @Before
//    MyArrayList<Integer> testMyArrayList = new MyArrayList<>();

    @Test
    public void addTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();
        Integer expected = 12;
        testMyArrayList.add(expected);
        Integer actual = testMyArrayList.get(0);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void addAtIndexTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();
        testMyArrayList.add(3);
        testMyArrayList.add(12);
        testMyArrayList.addAtIndex(1, 12);

        Integer expected = 12;

        Integer actual = testMyArrayList.get(1);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();

        testMyArrayList.add(3);
        testMyArrayList.add(12);
        testMyArrayList.remove(0);

        int expected = 3;
        int actual = testMyArrayList.get(0);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();

        testMyArrayList.add(3);
        testMyArrayList.add(12);

        testMyArrayList.set(1, 69);

        int expected = 69;
        int actual = testMyArrayList.get(1);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void clearTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();

        testMyArrayList.add(3);
        testMyArrayList.add(12);

        testMyArrayList.clear();

        Assert.assertTrue(testMyArrayList.isEmpty());
    }


    @Test
    public void isEmptyTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();

        testMyArrayList.add(3);
        testMyArrayList.add(12);

        testMyArrayList.clear();

        Assert.assertTrue(testMyArrayList.isEmpty());
    }


    @Test
    public void containsTest() {
        MyArrayList<Integer> testMyArrayList = new MyArrayList<>();

        testMyArrayList.add(3);
        testMyArrayList.add(12);

        boolean expected = true;
        boolean actual = testMyArrayList.contains(12);

        Assert.assertEquals(expected, actual);

    }
}