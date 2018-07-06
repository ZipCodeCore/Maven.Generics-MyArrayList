package io.generics.myArrayList;

import org.junit.Assert;
import org.junit.Test;

public class KeyValuePairTest {
    @Test
    public void constructorTest(){
        KeyValuePair<String, Integer> myPair = new KeyValuePair<>("Key", 5);
        String expectedKey = "Key";
        Integer expectedValue = 5;
        String actualKey = myPair.getKey();
        Integer actualValue = myPair.getValue();
        Assert.assertEquals(expectedKey, actualKey);
        Assert.assertEquals(expectedValue, actualValue);

    }

    @Test
    public void equalsTest(){
        KeyValuePair<String, Integer> myPair = new KeyValuePair<>("Key", 5);
        boolean actual = myPair.equals("Key");
        Assert.assertTrue(actual);
    }
}
