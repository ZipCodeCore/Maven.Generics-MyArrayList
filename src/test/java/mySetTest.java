import org.junit.Assert;
import org.junit.Test;

public class mySetTest {

    @Test
    public void addIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(2);
        testSet.add(9);
        testSet.add(1);
        testSet.add(0);
        testSet.add(4);

        //When
        int expected = 5;
        int actual = testSet.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        //When
        int expected = 3;
        int actual = testSet.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(2);
        testSet.add(9);
        testSet.add(1);
        testSet.add(0);
        testSet.add(4);

        //When
        int expected = 0;
        int actual = testSet.get(3);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        //When
        String expected = "Pax";
        String actual = testSet.get(0);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(2);
        testSet.add(9);
        testSet.add(1);
        testSet.add(0);
        testSet.add(4);

        //When
        testSet.remove(3);

        int expected = 4;
        int actual = testSet.size();

        //THen
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        //When
        testSet.remove(2);

        int expected = 2;
        int actual = testSet.size();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);

        //When
        testSet.set(1, 4);

        int expected = 4;
        int actual = testSet.get(1);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        //When
        testSet.set(2, "hello");

        String expected = "hello";
        String actual = testSet.get(2);

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void clearIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);

        //When
        testSet.clear();

        int expected = 0;
        int actual = testSet.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        //When
        testSet.clear();

        int expected = 0;
        int actual = testSet.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);

        //When
        boolean expected = false;
        boolean actual = testSet.isEmpty();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        //When
        testSet.clear();

        boolean expected = true;
        boolean actual = testSet.isEmpty();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsIntTest() {
        //Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);

        boolean expected = false;
        boolean actual = testSet.contains(5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsStringTest() {
        //Given
        MySet<String> testSet = new MySet<>();
        testSet.add("Pax");
        testSet.add("Joe");
        testSet.add("Kay");

        boolean expected = true;
        boolean actual = testSet.contains("Pax");

        Assert.assertEquals(expected,actual);
    }
}
