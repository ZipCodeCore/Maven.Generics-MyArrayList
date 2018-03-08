import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void setTheArrayTest() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        int expected = 4;
        int actual = myArrayList.getTheArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTheArrayTest() {
        MyArrayList myArrayList = new MyArrayList();
        Double[] setArray = {1.0, 2.0, 3.0, 4.0};
        myArrayList.setTheArray(setArray);
        Assert.assertArrayEquals(myArrayList.getTheArray(), setArray);
    }

    @Test
    public void addTest() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(8L);
        myArrayList.add(9L);
        int expected = 2;
        int actual = myArrayList.getTheArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestSuccess() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        Assert.assertTrue(myArrayList.remove(2));
    }

    @Test
    public void removeTestFail() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        Assert.assertTrue(myArrayList.remove(5));
    }

    @Test
    public void clearTest() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        myArrayList.clear();
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, myArrayList.getTheArray());
    }

    @Test
    public void isEmptyTest() {
        MyArrayList myArrayList = new MyArrayList();
        Object[] setArray = {};
        myArrayList.setTheArray(setArray);
        Assert.assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void containsTestSuccessful() {
        MyArrayList myArrayList = new MyArrayList();
        String[] setArray = {"does", "this", "work"};
        myArrayList.setTheArray(setArray);
        Assert.assertTrue(myArrayList.contains("this"));
    }

    @Test
    public void containsTestFail() {
        MyArrayList myArrayList = new MyArrayList();
        String[] setArray = {"does", "this", "work"};
        myArrayList.setTheArray(setArray);
        Assert.assertTrue(myArrayList.contains("nope"));
    }

}
