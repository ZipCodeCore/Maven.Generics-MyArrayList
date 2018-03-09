import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class MappingTest {

    @Test
    public void newMappingTest(){
        //Given
        Mapping<String,Integer> test = new Mapping("Test", 1);

        //When
        Integer expectedValue = 1;
        String expectedKey = "Test";
        Integer actualValue = test.getValue();
        String actualKey = test.getKey();

        //Then
        Assert.assertEquals(expectedKey,actualKey);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void setValueTest(){
        //Given
        Mapping<String,Integer> test = new Mapping("Test", 1);

        //When
        test.setValue(5);
        int expected = 5;
        int actual = test.getValue();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void equalsTest(){
        //Given
        Mapping<String,Integer> test = new Mapping("Test", 1);
        Mapping<String,Integer> test2 = new Mapping("Test", 5);

        //When

        //Then
        Assert.assertTrue(test.equals(test2));
    }

    @Test
    public void equalsFalseTest(){
        //Given
        Mapping<String,Integer> test = new Mapping("Test", 1);
        Mapping<String,Integer> test2 = new Mapping("T3st", 1);

        //When

        //Then
        Assert.assertFalse(test.equals(test2));
    }


}
