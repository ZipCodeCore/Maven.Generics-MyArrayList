import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MyArrayListTest {


    @Test
    public void sizeTest() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>(5);
        listTest.add(1);

        //When
        int expected = 1;
        int actual = listTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>(5);

        //When
        int expected = 0;
        int actual = listTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);
        listTest.set(2, 5);

        //When
        Integer[] expected = {1, 2, 5, 4};
        System.out.println(Arrays.toString(expected));
        Integer[] actual = listTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTest() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(5);

        //When
        Integer[] expected = {5};
        Integer[] actual = listTest.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addIndex() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);
        listTest.add(2, 5);

        //When
        Integer[] expected = {1, 2, 5, 3, 4};
        System.out.println(Arrays.toString(expected));
        Integer[] actual = listTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void toArray() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);

        //When
        Integer[] expected = {1, 2, 3, 4};
        System.out.println(Arrays.toString(expected));
        Integer[] actual = listTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getIndexTest() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);

        Integer expected = 2;
        Integer actual = listTest.get(1);

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void addAllTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(5);
        Integer[] addArray = {1,2,3,4,5};

        listTest.addAll(addArray);

        //When
        Integer[] expected = {5, 1, 2, 3, 4, 5};
        Integer[] actual = listTest.toArray(new Integer[0]);

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);

        listTest.remove(0);

        //When
        Integer[] expected = {2, 3, 4};
        System.out.println(Arrays.toString(expected));
        Integer[] actual = listTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByObjectTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(2);
        listTest.add(4);

        int object = 2;
        listTest.removeObject(object);

        //When
        Integer[] expected = {1, 3, 4};
        System.out.println(Arrays.toString(expected));
        Integer[] actual = listTest.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);

        listTest.clear();

        //When
        int expected = 0;
        int actual = listTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();

        listTest.add(1);

        //When
        boolean expected = false;
        boolean actual = listTest.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);

        //When
        boolean expected = true;
        boolean actual = listTest.contains(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);

        //listTest.indexOf(2);

        //When
        int expected = 1;
        int actual = listTest.indexOf(2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastIndexOfTest(){
        //Given
        MyArrayList<Integer> listTest = new MyArrayList<Integer>();
        listTest.add(1);
        listTest.add(4);
        listTest.add(3);
        listTest.add(1);
        listTest.add(4);
        listTest.add(2);

        //listTest.indexOf(2);

        //When
        int expected = 3;
        int actual = listTest.lastIndexOf(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

}
