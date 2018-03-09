import org.junit.Assert;
import org.junit.Test;

public class MyMapTest {

    @Test
    public void newMapTest(){
        //Given
        MyMap <String,Integer> test = new MyMap<>();

        //When
        int expected = 0;
        int actual = test.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void putTest(){
        //Given
        MyMap <String,Integer> test = new MyMap<>();

        //When
        test.put("Test",5);
        Integer expected = 5;
        Integer actual = test.get("Test");

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void putDuplicatesTest(){
        //Given
        MyMap <String,Integer> test = new MyMap<>();

        //When
        test.put("Test",5);
        test.put("Test",5);
        test.put("Test",5);

        //Then
        Assert.assertTrue(test.size() == 1);
    }

    @Test
    public void containsKeyTest(){
        //Given
        MyMap <String,Integer> test = new MyMap<>();

        //When
        test.put("Test",5);

        //Then
        Assert.assertTrue(test.containsKey("Test"));
    }

    @Test
    public void containsValueTest(){
        //Given
        MyMap <String,Integer> test = new MyMap<>();

        //When
        test.put("Test",5);

        //Then
        Assert.assertTrue(test.containsValue(5));
    }

    @Test
    public void clearTest(){
        //Given
        MyMap<String, Integer> test = new MyMap<>();

        //When
        test.put("Test", 5);
        test.clear();

        //Then
        Assert.assertTrue(test.size()==0);
    }




}
