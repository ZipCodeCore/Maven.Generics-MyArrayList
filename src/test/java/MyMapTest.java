

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMapTest {

    @Test
    public void getTest(){
        //Given
        MyMap<String, Integer> myMapTest = new MyMap<>();

        //When
        Object expected = null;
        Object actual = myMapTest.get("Bridget");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void putTest(){
        //Given
        MyMap<String, Integer> myMapTest = new MyMap<>();
        myMapTest.put("Gary", 8);

        //When
        Object expected = 8;
        Object actual = myMapTest.get("Gary");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //Given
        MyMap<String, Integer> myMapTest = new MyMap<>();
        myMapTest.put("Elvis", 10);
        myMapTest.remove("Elvis");

        //When
        Object expected = null;
        Object actual = myMapTest.get("Elvis");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest(){
        //Given
        MyMap<String, Integer> myMapTest = new MyMap<>();
        myMapTest.put("Roger", 22);

        //When
        boolean expected = true;
        boolean actual = myMapTest.containsKey("Roger");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValueTest(){
        //Given
        MyMap<String, Integer> myMapTest = new MyMap<>();
        myMapTest.put("Roger", 22);

        //When
        boolean expected = true;
        boolean actual = myMapTest.containsValue(22);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear(){
        //Given
        MyMap<String, Integer> myMapTest = new MyMap<>();
        myMapTest.put("George", 88);
        myMapTest.put("Alex", 28);

        myMapTest.clear();

        //When
        Object expected = null;
        Object actual = myMapTest.get("George");

        //Then
        Assert.assertEquals(expected, actual);
    }
}