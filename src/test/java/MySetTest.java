import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MySetTest   {

    private MySet tester;

    @Before
    public void setup() {
        tester = new MySet();
    }

    @Test
    public void addTest1() {
        tester.add(14);
        int expected = 1;
        int actual = tester.getSet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        tester.add(14);
        tester.add(11);
        tester.add(14);
        int expected = 2;
        int actual = tester.getSet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAllTest1() {
        String[] stringArray = {"Scooby", "Dooby", "Do"};
        tester.addAll(stringArray);
        int expected = 3;
        int actual = tester.getSet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAllTest2() {
        String[] stringArray = {"Scooby", "Scooby", "Do"};
        tester.addAll(stringArray);
        int expected = 2;
        int actual = tester.getSet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        Integer[] intArray = {50, 25, 14, 11};
        tester.addAll(intArray);
        int expected = 0;
        tester.clear();
        int actual = tester.getSet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest1() {
        Object toAdd = new Object();
        tester.add(toAdd);
        Assert.assertTrue(tester.contains(toAdd));
    }

    @Test
    public void containsTest2() {
        String[] stringArray = {"Super", "Duper", "Fly"};
        tester.addAll(stringArray);
        String testing = "Duper";
        boolean expected = true;
        boolean actual = tester.contains(testing);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsAllTest1() {
        tester.add("Marky");
        tester.add("Ricky");
        tester.add("Danny");
        tester.add("Terri");
        boolean expected = true;
        String[] stringArray = {"Terri", "Ricky"};
        boolean actual = tester.containsAll(stringArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsAllTest2() {
        tester.add(14);
        tester.add(11);
        tester.add(7);
        tester.add(99);
        boolean expected = false;
        Integer[] intArray = {7, 11, 16, 99};
        boolean actual = tester.containsAll(intArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest1() {
        Integer[] intArray = {4, 8, 15, 16, 23, 42};
        tester.addAll(intArray);
        boolean expected = false;
        boolean actual = tester.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest2() {
        boolean expected = true;
        boolean actual = tester.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1() {
        String[] stringArray = {"Going", "up", "the", "river"};
        tester.addAll(stringArray);
        tester.remove("the");
        boolean expected = false;
        boolean actual = tester.contains("the");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2() {
        Integer input = 612;
        Integer[] intArray = {98, 5, input, 17};
        tester.addAll(intArray);
        tester.remove(input);
        boolean expected = false;
        boolean actual = tester.contains(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest1() {
        String[] stringArray = {"Going", "up", "the", "river"};
        tester.addAll(stringArray);
        tester.removeAll(stringArray);
        int expected = 0;
        int actual = tester.getSet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest2() {
        String[] stringArray = {"Going", "up", "the", "river"};
        tester.addAll(stringArray);
        tester.removeAll(stringArray);
        Assert.assertFalse(tester.contains("the"));
    }

    @Test
    public void sizeTest() {
        Integer[] intArray = {645, 809, 765, 238};
        tester.addAll(intArray);
        int expected = 4;
        int actual = tester.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArrayTest() {
        Integer[] intArray = {645, 809, 765, 238};
        tester.addAll(intArray);
        Object[] expected = {645, 809, 765, 238};
        Object[] actual = tester.toArray();
        Assert.assertEquals(expected, actual);
    }


}
