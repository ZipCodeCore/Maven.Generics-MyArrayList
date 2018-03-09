import org.junit.Assert;
import org.junit.Test;

public class MyMapTest {

    @Test
    public void sizeTest() {
        MyMap myMap = new MyMap();
        Integer expected = 0;
        Integer actual = myMap.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        MyMap myMap = new MyMap();
        myMap.put("Brian", 5);
        Assert.assertEquals(myMap.get("Brian"), 5);
    }

    @Test
    public void containsKeyTest() {
        MyMap myMap = new MyMap();
        myMap.put("Brian", 5);
        Assert.assertTrue(myMap.containsKey("Brian"));
    }

    @Test
    public void containsValueTest() {
        MyMap myMap = new MyMap();
        myMap.put("Brian", 5);
        Assert.assertTrue(myMap.containsValue(5));
    }

    @Test
    public void removeTest() {
        MyMap myMap = new MyMap();
        myMap.put("Brian", 5);
        myMap.remove("Brian");
        Assert.assertFalse(myMap.containsKey("Brian"));
    }

}
