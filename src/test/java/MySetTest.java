import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    MySet<String> stringSetTest = new MySet<>();
    MySet<Integer> integerSetTest = new MySet<>();

    @Test
    public void addStringTest(){
        //Given
        String newString = "Hi";
        //When
        stringSetTest.add(newString);
        //Then
        Assert.assertTrue(stringSetTest.size() == 1);
    }

    @Test
    public void addIntegerTest(){
        //Given
        Integer newInteger = 3;
        //When
        integerSetTest.add(newInteger);
        //Then
        Assert.assertTrue(integerSetTest.size() == 1);
    }

    @Test
    public void integerSetSizeTest(){
        //Given
        Integer expected = 3;
        //When
        integerSetTest.add(5);
        integerSetTest.add(6);
        integerSetTest.add(7);
        //Then
        Integer actual = integerSetTest.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void stringSetSizeTest(){
        //Given
        Integer expected = 3;
        //When
        stringSetTest.add("Foo");
        stringSetTest.add("Bar");
        stringSetTest.add("Baz");
        //Then
        Integer actual = stringSetTest.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsStringTest(){
        //When
        stringSetTest.add("Foo");
        stringSetTest.add("Bar");
        stringSetTest.add("Baz");
        //Then
        Assert.assertTrue(stringSetTest.contains("Hi") != true);
    }

    @Test
    public void containsIntegerTest(){
        //When
        integerSetTest.add(5);
        integerSetTest.add(6);
        integerSetTest.add(7);
        //Then
        Assert.assertTrue(integerSetTest.contains(9) != true);

    }

    @Test
    public void clearStringTest(){
        //When
        stringSetTest.add("Foo");
        stringSetTest.add("Bar");
        stringSetTest.add("Baz");
        stringSetTest.clear();
        //Then
        Assert.assertTrue(stringSetTest.size() == 0);
    }

    @Test
    public void clearIntegerTest(){
        //When
        integerSetTest.add(5);
        integerSetTest.add(6);
        integerSetTest.add(7);
        integerSetTest.clear();
        //Then
        Assert.assertTrue(integerSetTest.size() == 0);
    }

    @Test
    public void isEmptyStringTest1(){
        Assert.assertTrue(stringSetTest.isEmpty() == true);
    }

    @Test
    public void isEmptyStringTest2(){
        stringSetTest.add("Hello");
        stringSetTest.add("World");
        Assert.assertTrue(stringSetTest.isEmpty() != true);
    }


    @Test
    public void isEmptyIntegerTest1(){
        Assert.assertTrue(integerSetTest.isEmpty() == true);
    }

    @Test
    public void isEmptyIntegerTest2(){
        integerSetTest.add(9);
        integerSetTest.add(15);
        Assert.assertTrue(integerSetTest.isEmpty() != true);
    }


}
