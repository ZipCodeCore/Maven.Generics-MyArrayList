import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMapTest {

    @Test
    public void putTest()
    {
        //Given
        MyMap<String, Integer> stringIntegerMyMap = new MyMap<>();
        stringIntegerMyMap.put("Ahson", 1);
        stringIntegerMyMap.put("Leon", 2);
        Object expectedValue = 2;

        //When
        Object actualValue = stringIntegerMyMap.get("Leon");

        //Then
        Assert.assertEquals(expectedValue, actualValue);

    }

    @Test
    public void getTest()
    {
        //Given
        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");
        Object expectedValue = "Ahson";

        //When
        Object actualValue = integerStringMyMap.get(1);

        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void removeTest()
    {
        //Given
        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");
        integerStringMyMap.remove(2);

        Assert.assertFalse(integerStringMyMap.containsKey(2));
    }

    @Test
    public void sizeTest()
    {
        //Given
        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");

        Integer expected = 2;

        //When
        Integer actual = integerStringMyMap.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest1()
    {

        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");


        Assert.assertTrue(integerStringMyMap.containsKey(1));

    }

    @Test
    public void containsKeyTest2()
    {

        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");


        Assert.assertFalse(integerStringMyMap.containsKey(3));

    }

    @Test
    public void containsValueTest1()
    {
        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");


        Assert.assertTrue(integerStringMyMap.containsValue("Ahson"));

    }

    @Test
    public void containsValueTest2()
    {
        MyMap<Integer, String> integerStringMyMap = new MyMap<>();
        integerStringMyMap.put(1, "Ahson");
        integerStringMyMap.put(2, "Leon");


        Assert.assertFalse(integerStringMyMap.containsValue("Joe"));

    }


}