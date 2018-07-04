package io.generics.myArrayList;

import org.junit.Assert;
import org.junit.Test;

public class KeyValuePairTest {
    @Test
    public void constructorTest(){
        String k = "Key";
        Integer v = 5;
        KeyValuePair<String, Integer> myPair = new KeyValuePair<>(k, v);
        String expectedKey = "Key";
        Integer expectedValue = 5;
        String actualKey = myPair.getKey();
        Integer actualValue = myPair.getValue();
        Assert.assertEquals(expectedKey, actualKey);
        Assert.assertEquals(expectedValue, actualValue);

    }
}
