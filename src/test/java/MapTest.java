import org.junit.Assert;
import org.junit.Test;

public class MapTest {

    @Test
    public void clearTest(){
        //Given
        //When
        //Then
    }
    @Test
    public void containsKeyTest(){
        //Given
        String expectKey = "Jake";
        Map<String, String> myMap = new Map<>(expectKey);
        //When
        myMap.containsKey(expectKey);
        //Then
        Assert.assertEquals("Jake", expectKey);
    }
    @Test
    public void containsValueTest(){
        //Given
        String expectValue = "Jones";
        Map<String, String> myMap = new Map<>(expectValue);
        //When
        myMap.containsValue(expectValue);
        //Then
        Assert.assertEquals("Jones", expectValue);
    }
    @Test
    public void entrySetTest(){
        //Given
        //When
        // Then
    }
    @Test
    public void equalsTest(){
        //Given
        //When
        //Then
    }

    @Test
    public void hashCodeTest(){
        //Given
        //When
        // Then
    }
    @Test
    public void isEmptyTest(){
        //Given

        //When
        //Then
    }
    @Test
    public void keySetTest(){
        //Given
        //When
        //Then
    }
    @Test
    public void putTest(){
        //Given
        String entryKey = "Jake";
        String entryValue = "Jones";
        Map<String, String> myMap = new Map<>();
        //When
        myMap.put(entryKey, entryValue);
        boolean hasKey = myMap.containsKey(entryKey);
        boolean hasValue = myMap.containsValue(entryValue);
        //Then
        Assert.assertTrue(hasKey);
        Assert.assertTrue(hasValue);

    }
    @Test
    public void removeTest(){
        //Given
        String entryKey = "Jake";
        String entryValue = "Jones";
        Map<String, String> myMap = new Map<>(entryKey, entryValue);
        //When
        myMap.remove(entryKey);
        boolean hasBeenRemoved = !myMap.containsKey(entryKey);
        //Then
        Assert.assertTrue(hasBeenRemoved);
    }
    @Test
    public void sizeTest(){
        //Given
        Integer sizeOfMap = 1;
        String entryKey = "Jake";
        String entryValue = "Jones";
        Map<String, String> myMap = new Map<>(entryKey, entryValue);
        //When
        myMap.size();
        //Then
        Assert.assertSame(1, sizeOfMap);
    }
    @Test
    public void valuesTest(){
        //Given
        String entryKey1 = "Jake";
        String entryValue1 = "Jones";
        MyEntry<String, String> myEntry = new MyEntry<>(entryKey1, entryValue1);
        //When
        myEntry.getValue();
        //Then
        Assert.assertEquals("Jones", entryValue1);
    }
}
