import org.junit.Assert;
import org.junit.Test;

public class myArrayListTest {

    @Test
    public void addLongTest() {
        //Given
        MyArrayList<Long, V> myArrayList = new MyArrayList<>();
        Long valueToAdd = 4L;
        myArrayList.add(1L);
        myArrayList.add(2L);
        myArrayList.add(3L);
        myArrayList.add(valueToAdd);
        myArrayList.add(5L);
        myArrayList.add(6L);

        //When
        Long[] expected = {1L, 2L, 3L, 4L, 5L, 6L};
        Long[] actual = myArrayList.toArray(new Long[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addStringTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();
        String valueToAdd = "Paxton";
        myArrayList.add("Kay");
        myArrayList.add(valueToAdd);
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add(valueToAdd);
        myArrayList.add(valueToAdd);

        //When
        String[] expected = {"Kay", "Paxton", "Joseph", "Elisha", "Paxton", "Paxton"};
        String[] actual = myArrayList.toArray(new String[0]);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addIntegerTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();
        Integer valueToAdd = 12;
        myArrayList.add(2);
        myArrayList.add(9);
        myArrayList.add(1);
        myArrayList.add(valueToAdd);
        myArrayList.add(valueToAdd);
        myArrayList.add(0);
        myArrayList.add(valueToAdd);
        myArrayList.add(4);
        myArrayList.add(valueToAdd);

        // When
        Integer[] expected = {2, 9, 1, 12, 12, 0, 12, 4, 12};
        Integer[] actual = myArrayList.toArray(new Integer[0]);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();
        Integer valueToAdd = 12;
        myArrayList.add(2);
        myArrayList.add(9);
        myArrayList.add(1);
        myArrayList.add(valueToAdd);
        myArrayList.add(valueToAdd);
        myArrayList.add(0);
        myArrayList.add(valueToAdd);
        myArrayList.add(4);
        myArrayList.add(valueToAdd);

        //When
        int expected = 9;
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeStringTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();
        String valueToAdd = "Paxton";
        myArrayList.add("Kay");
        myArrayList.add(valueToAdd);
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add(valueToAdd);
        myArrayList.add(valueToAdd);

        //When
        int expected = 6;
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIntTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.set(1, 8);
        myArrayList.add(4);

        //When
        Integer[] expected = {0, 8, 2, 3, 4};
        Integer[] actual = myArrayList.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void setStringTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();
        myArrayList.add("Kay");
        myArrayList.add("Paxton");
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add("Nico");
        myArrayList.set(0, "Paxton");

        //When
        String[] expected = {"Paxton", "Paxton", "Joseph", "Elisha", "Nico"};
        String[] actual = myArrayList.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }



    @Test
    public void addIndexTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(0,7);

        //When
        Integer[] expected = {7, 0, 1, 2, 3, 4};
        Integer[] actual = myArrayList.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addStringIndexTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Kay");
        myArrayList.add("Paxton");
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add("Nico");
        myArrayList.add(0, "Paxton");

        //When
        String[] expected = {"Paxton", "Kay", "Paxton", "Joseph", "Elisha", "Nico"};
        String[] actual = myArrayList.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void toArrayIntTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //When
        Integer[] expected = {0, 1, 2, 3, 4};
        Integer[] actual = myArrayList.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void toArrayStringTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Kay");
        myArrayList.add("Paxton");
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add("Nico");

        //When
        String[] expected = {"Kay", "Paxton", "Joseph", "Elisha", "Nico"};
        String[] actual = myArrayList.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getIndexIntTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //When
        Integer expected = 3;
        Integer actual = myArrayList.get(3);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIndexStringTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Kay");
        myArrayList.add("Paxton");
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add("Nico");

        //When
        String expected = "Paxton";
        String actual = myArrayList.get(1);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeIntTest(){
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.remove(0);

        //When
        Integer[] expected = {1, 2, 3, 4};
        Integer[] actual = myArrayList.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeStringTest(){
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Kay");
        myArrayList.add("Paxton");
        myArrayList.add("Joseph");
        myArrayList.add("Elisha");
        myArrayList.add("Nico");
        myArrayList.remove(2);

        //When
        String[] expected = {"Kay", "Paxton", "Elisha", "Nico"};
        String[] actual = myArrayList.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //When
        myArrayList.clear();

        int expected = 0;
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearStringTest(){
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Hello");
        myArrayList.add("There");
        myArrayList.add("Big");
        myArrayList.add("World");

        //When
        myArrayList.clear();

        int expected = 0;
        int actual = myArrayList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.clear();

        //When
        boolean expected = true;
        boolean actual = myArrayList.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyStringTest() {
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Hello");
        myArrayList.add("There");
        myArrayList.add("Big");
        myArrayList.add("World");

        //When
        boolean expected = false;
        boolean actual = myArrayList.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        //Given
        MyArrayList<Integer, V> myArrayList = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //When
        boolean expected = false;
        boolean actual = myArrayList.contains(5);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsStringTest(){
        //Given
        MyArrayList<String, V> myArrayList = new MyArrayList<>();

        myArrayList.add("Hello");
        myArrayList.add("There");
        myArrayList.add("Big");
        myArrayList.add("World");

        //When
        boolean expected = true;
        boolean actual = myArrayList.contains("World");

        //Then
        Assert.assertEquals(expected, actual);
    }
}

