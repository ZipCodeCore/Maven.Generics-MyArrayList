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
    public void removeTestMultiple() {
        MyArrayList myArrayList = new MyArrayList();
        Byte[] setArray = {1, 2, 3, 4, 5, 6, 5};
        myArrayList.setTheArray(setArray);
        myArrayList.remove(5);
        int expected = 5;
        int actual = myArrayList.getTheArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestFail() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        Assert.assertTrue(myArrayList.remove(5));
    }

    @Test
    public void removeAtIndexTestSuccess() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        myArrayList.removeAtIndex(1);
        Integer[] expected = {1, 3, 4};
        Integer[] actual = (Integer[]) myArrayList.getTheArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeAtIndexFail() {
        MyArrayList myArrayList = new MyArrayList();
        Integer[] setArray = {1, 2, 3, 4};
        myArrayList.setTheArray(setArray);
        Assert.assertEquals(myArrayList.removeAtIndex(6), null);
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
    public void containsTestSuccess() {
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
        Assert.assertTrue(!(myArrayList.contains("nope")));
    }

    @Test
    public void setAtIndexTest() {
        MyArrayList myArrayList = new MyArrayList();
        String[] setArray = {"does", "this", "work"};
        myArrayList.setTheArray(setArray);
        String here = "here";
        myArrayList.setAtIndex(1, here);
        Assert.assertEquals(myArrayList.getTheArray()[1], here);
    }

    @Test
    public void sizeTest() {
        MyArrayList myArrayList = new MyArrayList();
        Short[] setArray = {3, 4, 5, 6, 7};
        myArrayList.setTheArray(setArray);
        int expected = 5;
        int actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }

}
