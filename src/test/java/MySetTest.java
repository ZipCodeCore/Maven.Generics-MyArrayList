import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void addTest() {
        MySet<Integer> mySet = new MySet<>();
        mySet.add(4);
        mySet.add(5);
        mySet.add(5);
        mySet.add(4);
        Integer[] actual = mySet.toArray(new Integer[mySet.size()]);
        Integer[] expected = new Integer[]{4, 5};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        MySet<String> mySet = new MySet<>();
        mySet.add("Hello");
        mySet.add("World");
        String[] actual = mySet.toArray(new String[mySet.size()]);
        String[] expected = new String[]{"Hello", "World"};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        MySet<Integer> mySet = new MySet<>();
        mySet.add(4);
        mySet.add(5);
        mySet.remove(5);
        Integer[] actual = mySet.toArray(new Integer[mySet.size()]);
        Integer[] expected = new Integer[]{4};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MySet<Double> mySet = new MySet<>();
        mySet.add(4.0);
        mySet.add(5.5);
        mySet.add(7.8);
        mySet.clear();
        Assert.assertEquals(mySet.size(), 0);
        Assert.assertTrue(mySet.isEmpty());
    }


    @Test
    public void setTest() {
        MySet<Double> mySet = new MySet<>();
        mySet.add(4.0);
        mySet.add(5.5);
        mySet.add(7.8);
        mySet.add(2, 10.4);
        Double[] actual = mySet.toArray(new Double[mySet.size()]);
        Double[] expected = new Double[]{4.0, 5.5, 10.4, 7.8};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        MySet<Long> myLongList = new MySet<>();
        myLongList.add(46457L);
        myLongList.add(57876757L);
        Assert.assertTrue(myLongList.contains(46457L));
        Assert.assertFalse(myLongList.contains(6757467636457L));
    }

    @Test
    public void getTest(){
        MySet<Double> mySet = new MySet<>();
        mySet.add(4.0);
        mySet.add(5.5);
        mySet.add(7.8);
        Object expected = 5.5;
        Assert.assertEquals(expected, mySet.get(1));
    }
}
