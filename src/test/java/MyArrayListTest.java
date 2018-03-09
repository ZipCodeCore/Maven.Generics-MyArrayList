import org.junit.Assert;
import org.junit.Test;

/**
 * made by Frankie!
 */
public class MyArrayListTest {

    @Test
    public void addTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(4);
        myArrayList.add(5);
        Integer[] actual = myArrayList.toArray(new Integer[myArrayList.size()]);
        Integer[] expected = new Integer[]{4, 5};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("World");
        String[] actual = myArrayList.toArray(new String[myArrayList.size()]);
        String[] expected = new String[]{"Hello", "World"};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.remove(5);
        Integer[] actual = myArrayList.toArray(new Integer[myArrayList.size()]);
        Integer[] expected = new Integer[]{4};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(4.0);
        myArrayList.add(5.5);
        myArrayList.add(7.8);
        myArrayList.clear();
        Assert.assertEquals(myArrayList.size(), 0);
        Assert.assertTrue(myArrayList.isEmpty());
    }


    @Test
    public void setTest() {
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(4.0);
        myArrayList.add(5.5);
        myArrayList.add(7.8);
        myArrayList.add(2, 10.4);
        Double[] actual = myArrayList.toArray(new Double[myArrayList.size()]);
        Double[] expected = new Double[]{4.0, 5.5, 10.4, 7.8};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        MyArrayList<Long> myLongList = new MyArrayList<>();
        myLongList.add(46457L);
        myLongList.add(57876757L);
        Assert.assertTrue(myLongList.contains(46457L));
        Assert.assertFalse(myLongList.contains(6757467636457L));
    }

    @Test
    public void getTest(){
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        myArrayList.add(4.0);
        myArrayList.add(5.5);
        myArrayList.add(7.8);
        Object expected = 5.5;
        Assert.assertEquals(expected, myArrayList.get(1));
    }
}
