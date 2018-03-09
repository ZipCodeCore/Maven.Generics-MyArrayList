import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void addTest1() {
        MyArrayList tester = new MyArrayList();
        tester.add(7);
        int expected = 1;
        int actual = tester.getArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        MyArrayList tester = new MyArrayList(3);
        tester.add("Hello");
        int expected = 4;
        int actual = tester.getArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest3() {
        MyArrayList tester = new MyArrayList(3);
        Object expected = null;
        Object actual = tester.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest1() {
        MyArrayList tester = new MyArrayList(3);
        tester.add("Hello");
        Object expected = "Hello";
        Object actual = tester.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest2() {
        MyArrayList tester = new MyArrayList();
        double input = 8.885;
        tester.add(input);
        Object expected = input;
        Object actual = tester.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1() {
        MyArrayList tester = new MyArrayList();
        tester.add("Abra");
        tester.add("Kadabra");
        tester.add("Alakazam");
        tester.remove("Kadabra");
        int expected = 2;
        int actual = tester.getArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2() {
        MyArrayList tester = new MyArrayList();
        tester.add(3);
        tester.add(6);
        tester.add(9);
        tester.remove(9);
        tester.remove(3);
        int expected = 1;
        int actual = tester.getArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest1() {
        MyArrayList tester = new MyArrayList();
        Object expected = "Will";
        tester.add("Marky");
        tester.add("Ricky");
        tester.add("Danny");
        tester.set(1, expected);
        Object actual = tester.getArray()[1];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest2() {
        MyArrayList tester = new MyArrayList();
        Integer expected = 14;
        tester.add(9);
        tester.add(4);
        tester.add(11);
        tester.set(1, expected);
        Integer actual = (Integer) tester.getArray()[1];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {


    }

    @Test
    public void isEmptyTest() {


    }

    @Test
    public void containsTest() {


    }

}
