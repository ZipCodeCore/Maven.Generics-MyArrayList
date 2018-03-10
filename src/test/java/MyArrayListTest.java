import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    MyArrayList testList = new MyArrayList(2);
    MyArrayList testListNullary = new MyArrayList();
    Object newElement = new Object();
    Object newElement1 = new Object();
    String testString1 = "One";
    String testString2= "Two";
    String testString3 = "Three";

    @Test
    public void nullaryConstructorTest() {
        //Given
        Object[] expected = new Object[10];
        //when
        Object[] actual = testListNullary.getMyArray();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorWithSizeTest() {
        //Given
        Object[] expected = new Object[2];
        //when
        Object[] actual = testList.getMyArray();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addObjectWithNullaryConstructorTest(){
        //When
        testListNullary.add(newElement);
        testListNullary.getMyArray();
        //Then
        Assert.assertTrue(testListNullary.size() == 1);
    }

    @Test
    public void addObjectWithOneArgumentConstructorTest(){
        //When
        Object newElement2 = new Object();
        testList.add(newElement);
        testList.add(newElement1);
        testList.add(newElement2);
        testList.getMyArray();
        //Then
        Assert.assertTrue(testList.size() == 3);
    }
    @Test
    public void addStringWithNullaryConstructorTest(){
        //When
        testListNullary.add(testString1);
        testListNullary.getMyArray();
        //Then
        Assert.assertTrue(testListNullary.size() == 1);
    }

    @Test
    public void addStringtWithOneArgumentConstructorTest(){
        //When
        testList.add(testString1);
        testList.add(testString2);
        testList.add(testString3);
        testList.getMyArray();
        //Then
        Assert.assertTrue(testList.size() == 3);
    }

    @Test
    public void getTest(){
        //Given
        Object expected = newElement1;
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        Object actual  = testListNullary.get(1);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStringTest(){
        //Given
       String expected = testString2;
        //When
        testListNullary.add(testString1);
        testListNullary.add(testString2);
        String actual  = testListNullary.get(1).toString();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStringTest(){
        //Given
        String expected = testString2;
        testListNullary.add(testString1);
        testListNullary.add(testString2);
        testListNullary.add(testString3);
        //When
        String actual = testListNullary.remove(1).toString();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest(){
        //Given
        Object newElement2 = new Object();
        Object expected = newElement1;
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        Object actual = testListNullary.set(1, newElement2);
        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(testListNullary.get(1).equals(newElement2));
    }

    @Test
    public void clearTest(){
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        testListNullary.clear();
        //Then
        Assert.assertTrue(testListNullary.size() == 0);
    }

    @Test
    public void isEmptyTest1(){
        Assert.assertTrue(testListNullary.isEmpty() == true);
    }

    @Test
    public void isEmptyTest2(){
        testList.add(newElement);
        testList.add(newElement1);
        Assert.assertTrue(testList.isEmpty() != true);
    }

    @Test
    public void containsTest(){
        testList.add(newElement);
        testList.add(newElement1);
        Assert.assertTrue(testList.contains(newElement1) == true);
    }

    @Test
    public void containsTest1(){
        testList.add(newElement);
        testList.add(newElement1);
        Assert.assertFalse(testList.contains(newElement1) != true);
    }

    @Test
    public void resizeMyArrayTest(){
        testList.add("Hi");
        testList.add("How");
        testList.add("are");
        testList.add("you");
        Assert.assertTrue(testList.getMyArray().length == 8);
    }
}
