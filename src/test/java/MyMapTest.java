import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyMapTest {

    private MyMap tester;

    @Before
    public void setup() {
        tester = new MyMap();
    }

    @Test
    public void putTest() {
        tester.put(1, "Red");
        Assert.assertTrue(tester.containsKey(1));
        Assert.assertTrue(tester.containsValue("Red"));
    }

    @Test
    public void getTest() {
        tester.put(2, "Orange");
        Object expected = "Orange";
        Object actual = tester.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        tester.put(1, "Red");
        tester.put(2, "Orange");
        tester.put(3, "Yellow");
        tester.remove(2);
        Assert.assertFalse(tester.containsValue(2));
    }

    @Test
    public void sizeTest() {
        tester.put(1, "Red");
        tester.put(2, "Orange");
        tester.put(3, "Yellow");
        tester.remove(2);
        Integer expected = 2;
        Integer actual = tester.size();
        Assert.assertEquals(expected, actual);
    }


}
