import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MySetTest {

    @Test
    public void addTestTest(){
        //Given
        MySet<Integer> setTest = new MySet<Integer>();
        setTest.add(1);
        setTest.add(2);
        setTest.add(3);
        setTest.add(2);

        //When
        Integer[] expected = {1, 2, 3};
        Integer[] actual = setTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        //Given
        MySet<Integer> setTest = new MySet<Integer>();
        setTest.add(1);
        setTest.add(2);
        setTest.add(3);

        setTest.clear();

        //When
        int expected = 0;
        int actual = setTest.toArray(new Integer[0]).length;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArrayTest() {
        //Given
        MySet<Integer> setTest = new MySet<Integer>();
        setTest.add(1);
        setTest.add(2);
        setTest.add(3);
        setTest.add(4);

        //When
        Integer[] expected = {1, 2, 3, 4};
        System.out.println(Arrays.toString(expected));
        Integer[] actual = setTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addAllTest(){
        //Given
        MySet<Integer> setTest = new MySet<Integer>();
        setTest.add(5);
        Integer[] addArray = {1,2,3,4,5};

        setTest.addAll(addArray);

        //When
        Integer[] expected = {5, 1, 2, 3, 4};
        Integer[] actual = setTest.toArray(new Integer[0]);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        //Given
        MySet<Integer> setTest = new MySet<Integer>();
        setTest.add(1);
        setTest.add(2);
        setTest.add(3);
        setTest.add(4);

        //When
        boolean expected = true;
        boolean actual = setTest.contains(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //Given
        MySet<Integer> setTest = new MySet<Integer>();

        setTest.add(1);

        //When
        boolean expected = false;
        boolean actual = setTest.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        //Given
        MySet<String> setTest = new MySet<>();
        setTest.add("Bobby");
        setTest.add("Peter");
        setTest.add("Judy");

        //When
        int expected = 3;
        int actual = setTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}