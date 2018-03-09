import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void nullaryConstructorTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>();

        //When
        int expected = 0;
        int actual = test.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void intConstructorTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(5);

        //When
        int expected = 0;
        int actual = test.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void intAddNullsTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(5);

        //When
        test.add(null);
        test.add(null);
        test.add(null);
        int expected = 3;
        int actual = test.size();

        //Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void addElementTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);

        //When
        test.add(10);
        int expected =10;
        int actual = test.get(0);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addElementIndexTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(3);

        //When
        test.add(10);
        test.add(0,25);
        int expected =25;
        int actual = test.get(0);
        Integer[] expected2 = {25,10,null};

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertArrayEquals(expected2,test.toArray(new Integer[0]));
    }

    @Test
    public void addAllTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(3);


        //When
        Integer[] expected = {5,10,15,20};
        test.addAll(expected);
        Integer [] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void addAllWithNullsTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(6);


        //When
        Integer[] expected = {5,10,15,20,null,null};
        test.addAll(expected);
        Integer [] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void addAllIndexTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        test.add(0);
        test.add(25);


        //When
        Integer[] values = {5,10,15,20};
        test.addAll(1,values);
        Integer[] expected = {0,5,10,15,20,25};
        Integer [] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void addAllIndexWithNullsTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(8);
        test.add(0);
        test.add(25);



        //When
        Integer[] values = {5,10,15,20};
        test.addAll(1,values);
        Integer[] expected = {0,5,10,15,20,25,null,null};
        Integer [] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void clearTest() {
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(3);
        test.add(0);
        test.add(25);

        //When
        test.clear();
        int expected = 0;
        int actual = test.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsTest() {
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        test.add(0);
        test.add(25);

        //Then
        Assert.assertTrue(test.contains(25));
    }

    @Test
    public void indexOfTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        test.add(0);
        test.add(25);

        //When
        int expected = 1;
        int actual = test.indexOf(25);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(5);

        //Then
        Assert.assertFalse(test.isEmpty());
    }

    @Test
    public void isEmptyFalseTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(5);
        test.add(25);

        //Then
        Assert.assertFalse(test.isEmpty());
    }

    @Test
    public void lastIndexOfTest() {
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        Integer[] testElements = {5,10,5,10,10};
        test.addAll(testElements);

        //When
        int expected = 2;
        int actual = test.lastIndexOf(5);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest() {
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        Integer[] testElements = {5, 10, 5, 10, 10};
        test.addAll(testElements);

        //When
        test.set(2,15);
        int expected = 15;
        int actual = test.get(2);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeIndexTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        Integer[] testElements = {5, 10, 5, 15, 20};
        test.addAll(testElements);

        //When
        test.remove(2);
        Integer[] expected = {5,10,15,20,null};
        Integer[] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size() == 4);
    }

    @Test
    public void removeElementTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        Integer[] testElements = {5, 10, 5, 15, 20};
        test.addAll(testElements);

        //When
        Integer value = 5;
        test.remove(value);
        Integer[] expected = {10,5,15,20,null};
        Integer[] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size() == 4);
    }

    @Test
    public void removeRangeTest(){
        //Given
        MyArrayList<Integer> test = new MyArrayList<>(0);
        Integer[] testElements = {5, 10, 5, 15, 20};
        test.addAll(testElements);

        //When
        test.removeRange(1,3);
        Integer[] expected = {5,20,null,null,null};
        Integer[] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size() == 2);
    }

    @Test
    public void subArrayTest(){
        //Given
        MyArrayList<Character> test = new MyArrayList<>(0);
        Character[] testElements = {'a','b','c','d','e','f'};
        test.addAll(testElements);

        //When
        Character[] expected = {'b','c','d','e'};
        Character[] actual = test.subArray(1,4, new Character[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void trimToSizeTest(){
        //Given
        MyArrayList<String> test = new MyArrayList<>(6);
        String [] elements = {"Hi", "I", "Am", "trimming"};
        test.addAll(elements);

        //When
        test.trimToSize();
        String[]  expected = {"Hi", "I", "Am", "trimming"};
        String[] actual  = test.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

}
