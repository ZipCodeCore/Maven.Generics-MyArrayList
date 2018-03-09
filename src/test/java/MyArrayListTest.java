import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    MyArrayList testList = new MyArrayList(2);
    MyArrayList testListNullary = new MyArrayList();
    Object newElement = new Object();
    Object newElement1 = new Object();

    @Test
    public void nullaryConstructorTest() {
        //Given
        Object[] expected = new Object[0];
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
    public void addTest(){
        //When
        testListNullary.add(newElement);
        testListNullary.getMyArray();
        //Then
        Assert.assertTrue(testListNullary.getMyArray().length == 1);
    }

    @Test
    public void addTest1(){
        //When
        Object newElement2 = new Object();
        testList.add(newElement);
        testList.add(newElement1);
        testList.add(newElement2);
        testList.getMyArray();
        //Then
        Assert.assertTrue(testList.getMyArray().length == 3);
    }

    @Test
    public void getTest(){
        //Given
        Object expected = newElement1;
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        Object actual  = testListNullary.get(2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        testListNullary.remove(2);
        //Then
        Assert.assertTrue(testListNullary.getMyArray().length == 1);
    }

    @Test
    public void setTest(){
        //Given
        Object newElement2 = new Object();
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        testListNullary.set(2, newElement2);
        //Then
        Assert.assertTrue(testListNullary.getMyArray().length == 2);
        Assert.assertTrue(testListNullary.get(2).equals(newElement2));
    }

    @Test
    public void clearTest(){
        //When
        testListNullary.add(newElement);
        testListNullary.add(newElement1);
        testListNullary.clear();
        //Then
        Assert.assertTrue(testListNullary.getMyArray() == null);
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
    public void sizeTest(){
        Assert.assertTrue(testList.size() == testList.getMyArray().length);
    }
}
