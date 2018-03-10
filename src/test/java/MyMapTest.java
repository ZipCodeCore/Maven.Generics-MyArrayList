import org.junit.Assert;
import org.junit.Test;

public class MyMapTest {

    @Test
    public void constructorTest(){
        MyMap<String, Integer> myMap = new MyMap<>();
        int expected = 16;
        int actual = myMap.getMyMap().size();
        Assert.assertEquals(expected, actual);
    }

/*    @Test
    public void addTest(){
        MyMap<String, Integer> myMap = new MyMap<>();
        String k = "Key";
        Integer v = 5;
        KeyValuePair<String, Integer> myPair = new KeyValuePair<>(k, v);
        MyArrayList<KeyValuePair<String,Integer>> expected = new MyArrayList(myPair);
        myMap.add(myPair);
        MyArrayList actual = myMap.getMyMap();
    }
*/
}
