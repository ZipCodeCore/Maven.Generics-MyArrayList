import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void sizeTest() {
        MyArrayList tester = new MyArrayList(5);
        int expected = 0;
        int actual = tester.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest1() {
        MyArrayList tester = new MyArrayList();
        tester.add(7);
        int expected = 1;
        int actual = tester.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        MyArrayList tester = new MyArrayList(2);
        tester.add("Test");
        tester.add("hello");
        tester.add("world");
        int expected = 4;
        int actual = tester.getArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest3() {
        MyArrayList tester = new MyArrayList();
        Integer expected = 14;
        tester.add(11);
        tester.add(expected);
        tester.add(22);
        Integer actual = (Integer) tester.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest4() {
        MyArrayList tester = new MyArrayList(3);
        Object expected = "Go";
        tester.add("Grease");
        tester.add("Lightning");
        tester.add(expected, 0);
        Object actual = tester.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest5() {
        MyArrayList tester = new MyArrayList(2);
        Integer expected = 99;
        tester.add(14);
        tester.add(7);
        tester.add(expected);
        tester.add(11);
        tester.add(197, 2);
        Integer actual = (Integer) tester.get(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest1() {
        MyArrayList tester = new MyArrayList(3);
        tester.add("Hello");
        Object expected = "Hello";
        Object actual = tester.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest2() {
        MyArrayList tester = new MyArrayList();
        double input = 8.885;
        tester.add(3.14);
        tester.add(input);
        Object expected = input;
        Object actual = tester.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1() {
        MyArrayList tester = new MyArrayList();
        Object toRemove = "Kadabra";
        Object expected = "Alakazam";
        tester.add("Abra");
        tester.add(toRemove);
        tester.add(expected);
        tester.remove(toRemove);
        Object actual = tester.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2() {
        MyArrayList tester = new MyArrayList();
        tester.add(3);
        tester.add(6);
        tester.add(9);
        tester.remove(1);
        int expected = 2;
        int actual = tester.size();
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
        tester.set(2, expected);
        Integer actual = (Integer) tester.getArray()[2];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest1() {
        MyArrayList tester = new MyArrayList();
        tester.add("Scooby");
        tester.add("Dooby");
        tester.add("Do");
        tester.clear();
        int expected = 0;
        int actual = tester.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest2() {
        MyArrayList tester = new MyArrayList();
        tester.add("Scooby");
        tester.add("Dooby");
        tester.add("Do");
        tester.clear();
        int expected = 10;
        int actual = tester.getArray().length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest3() {
        MyArrayList tester = new MyArrayList();
        tester.add("Scooby");
        tester.add("Dooby");
        tester.add("Do");
        tester.clear();
        Object expected = null;
        Object actual = tester.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest1() {
        MyArrayList tester = new MyArrayList(8);
        tester.add(14);
        tester.add(7);
        boolean expected = false;
        boolean actual = tester.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest2() {
        MyArrayList tester = new MyArrayList(8);
        tester.add(14);
        tester.add(7);
        tester.clear();
        Assert.assertTrue(tester.isEmpty());
    }

    @Test
    public void containsTest1() {
        MyArrayList tester = new MyArrayList();
        String thing = "Pinocchio";
        tester.add(thing);
        Assert.assertTrue(tester.contains(thing));
    }

    @Test
    public void containsTest2() {
        MyArrayList tester = new MyArrayList();
        String thing = "Pinocchio";
        String anotherThing = "Aladdin";
        tester.add(thing);
        Assert.assertFalse(tester.contains(anotherThing));
    }

}
