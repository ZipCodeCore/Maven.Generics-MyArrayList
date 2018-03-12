import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void addTest(){
        //Given
        Object elementToAdd = "s";
        Object[] originalArray = {"g", "r", "a", "p", "e"};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.add(elementToAdd);
        //Then
        Assert.assertEquals("s", myArrayList.get(5));
    }
    @Test
    public void getTest(){
        //Given
        Object indexToGet = "g";
        Object[] originalArray = {"d", "o", "g", "e"};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.get(2);
        //Then

    }
    @Test
    public void removeTest(){
        //Given
        Object elementToRemove = "d";
        Object[] expectedArray = {"b", "e", "a", "r", "s", };
        Object[] originalArray = {"b", "e", "a", "r", "d", "s"};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.remove(elementToRemove);
        //Then
        Assert.assertNotEquals("d", myArrayList.get(4));
    }
    @Test public void setTest(){
        //Given
        Object elementToSet = "r";
        int expectedIndex = 2;
        Object[] expectedArray = {"a", "p", "r", "i", "l"};
        Object[] originalArray = {"a", "p", "i", "l"};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.set(expectedIndex, elementToSet);
        boolean actualArray = myArrayList.contains(elementToSet);
        //Then
        Assert.assertEquals(expectedArray, actualArray);
    }
    @Test
    public void clearTest(){
        //Given
        Object[] originalArray = {"H", "E", "Y", "O"};
        Object[] expectedArray = {};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.clear(originalArray);
        //Then
        Assert.assertTrue(expectedArray.equals(true));

    }
    @Test
    public void isEmptyTest(){
        //Given
        Object[] originalArray = {"I", "h", "a", "v", "e", "t", "h", "i", "n", "g", "s"};
        Object[] expectedArray = {};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.clear(originalArray);
        boolean actualArray = myArrayList.isEmpty();
        //Then
        Assert.assertEquals(expectedArray, actualArray);

    }
    @Test
    public void containsTest(){
        //Given
        Object expectedElement = "t";
        Object[] originalArray = {"c", "a", "t", "s"};
        MyArrayList<Object> myArrayList = new MyArrayList<>(originalArray);
        //When
        myArrayList.contains("t");
        //Then
        Assert.assertEquals("t", myArrayList.get(2));
    }
}
