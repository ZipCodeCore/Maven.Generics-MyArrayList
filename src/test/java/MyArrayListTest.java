import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void addToEndTest() {
        MyArrayList<String> test = new MyArrayList();
        String expected = "Hello";
        test.add(expected);

        String actual = test.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAtIndexTest() {
        MyArrayList<String> test = new MyArrayList();
        String s1 = "Hello";
        String expected = "World";
        int indexToTest = 1;
        test.add(0, s1);
        test.add(indexToTest, expected);

        String actual = test.get(indexToTest);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        MyArrayList<String> test = new MyArrayList();

        test.add("Hello");
        test.add("World");
        test.add("Hello Again");
        test.remove(0);

        String expected = "World";
        String actual = test.remove(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        MyArrayList<String> test = new MyArrayList();
        String s1 = "Hello";
        String s2 = "World";
        test.add(s1);
        test.add(s2);

        String expected = "Hello!!!!";

        test.set(1, expected);

        String actual = test.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MyArrayList<String> test = new MyArrayList();
        test.add("Hello");
        test.add("World");

        test.clear();

        String expected = null;
        String actual = test.get(0);
        String actual2 = test.get(1);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }

    @Test
    public void isEmptyTest() {
        MyArrayList<String> test = new MyArrayList();
        String s1 = "Hello";
        String s2 = "World";

        test.add(s1);
        test.add(s2);

        Assert.assertFalse(test.isEmpty());
    }

    @Test
    public void containsTest() {
        MyArrayList test = new MyArrayList();
        String s1 = "Hello";
        String s2 = "World";

        test.add(s1);
        test.add(s2);

        Assert.assertTrue(test.contains(s1));
    }
}
