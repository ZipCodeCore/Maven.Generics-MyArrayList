import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void addTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("Hello");

        int expected = 1;
        int actual = test.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        MySet<String> test = new MySet<>();
        test.add(0,"Hello");
        test.add(1, "World");
        test.add(2, "Hola");

        String expected = "Hola";
        String actual = test.get(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("World");

        test.clear();

        String expected = null;
        String actual = test.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("World");

        Assert.assertTrue(test.contains("Hello"));
    }

    @Test
    public void isEmptyTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("World");

        Assert.assertFalse(test.isEmpty());
    }

    @Test
    public void removeTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("World");

        test.remove(0);

        String expected = "World";
        String actual = test.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("World");

        int expected = 2;
        int actual = test.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        MySet<String> test = new MySet<>();
        test.add("Hello");
        test.add("World");

        test.set(0, "Hello!!!!!!");

        String expected = "Hello!!!!!!";
        String actual = test.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArrayTest() {

    }
}