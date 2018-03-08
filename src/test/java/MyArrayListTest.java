import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void addIntegerTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer expected = 5;
        myArrayList.add(expected);

        Integer actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStringTest() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        String expected = "Hi";
        myArrayList.add(expected);

        String actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addWithIndexTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(7);
        Integer expected = 6;

        myArrayList.add(expected, 1);
        Integer actual = myArrayList.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(6);

        myArrayList.remove(0);
        Integer expected = 6;
        Integer actual = myArrayList.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(6);

        myArrayList.set(200, 1);

        Integer expected = 200;
        Integer actual = myArrayList.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(6);

        myArrayList.clear();

        Assert.assertTrue(myArrayList.isEmpty());

    }

    @Test
    public void containsTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(6);

        Assert.assertTrue(myArrayList.contains(6));
    }
}
