import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void getTest(){
        MyHashMap<String, Integer> testMap = new MyHashMap<>();
        testMap.put("One", 1);
        int expected = 1;
        int actual = (Integer) testMap.get("One");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        MyHashMap<String, Integer> testMap = new MyHashMap<>();
        testMap.put("One", 1);
        testMap.remove("One");
        Assert.assertEquals(testMap.get("One"), null);
    }

    @Test
    public void overwriteTest(){
        MyHashMap<String, Integer> testMap = new MyHashMap<>();
        testMap.put("One", 1);
        testMap.put("One", 2);
        int expected =2;
        int actual = (Integer) testMap.get("One");
        Assert.assertEquals(expected, actual);
    }
}
