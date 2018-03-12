import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest<T> {
    public MyArrayListTest() {
    }

    private MyArrayList<String> myStrArrayList = new MyArrayList<>();
    private MyArrayList<Integer> myIntArrayList = new MyArrayList<>();
    private MySet<Integer> genericIntSet = new MySet<>();
    private MySet<String> genericStrSet = new MySet<>();

    @Test
    public void addTest1() {
        //Given
        int expected = 2;
        genericIntSet.add(7);
        genericIntSet.add(8);

        //When
        int actual = genericIntSet.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        //Given
        int expected = 4;
        genericStrSet.add("This");
        genericStrSet.add("Lab");
        genericStrSet.add("Sucks");
        genericStrSet.add("Bruh");

        //When
        int actual = genericStrSet.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest1() {
        //Given
        int expected = 5;
        genericIntSet.add(1);
        genericIntSet.add(2);
        genericIntSet.add(3);
        genericIntSet.add(4);
        genericIntSet.add(5);

        //When
        int actual = genericIntSet.get(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest2() {
        //Given
        String expected = "Warlock";
        genericStrSet.add("Super");
        genericStrSet.add("Jump");
        genericStrSet.add("Warlock");
        genericStrSet.add("is");
        genericStrSet.add("easy");

        //When
        String actual = genericStrSet.get(2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1() {
        //Given
        int expected = 6;
        genericIntSet.add(1);
        genericIntSet.add(2);
        genericIntSet.add(3);
        genericIntSet.add(4);
        genericIntSet.add(5);
        genericIntSet.add(6);

        //When
        genericIntSet.remove(6);
        int actual = genericIntSet.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2() {
        //Given
        int indexToRemove = 3;
        String expected = "Damn";
        genericStrSet.add("Get");
        genericStrSet.add("Money");
        genericStrSet.add("All");
        genericStrSet.add("Damn");
        genericStrSet.add("Day");

        //When
        genericStrSet.remove(indexToRemove);
        String actual = genericStrSet.get(indexToRemove);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest1() {
        //Given
        genericIntSet.add(2);
        genericIntSet.add(3);
        genericIntSet.add(4);
        genericIntSet.add(5);
        genericIntSet.add(7);
        genericIntSet.add(90);

        //When
        genericIntSet.set(4, 6);
        int expected = 6;
        int actual = genericIntSet.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest2() {
        //Given
        genericStrSet.add("My");
        genericStrSet.add("Favorite");
        genericStrSet.add("Color");
        genericStrSet.add("Is");
        genericStrSet.add("Blue");

        //When
        genericStrSet.set(4, "Red");
        String expected = "Red";
        String actual = genericStrSet.get(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest1() {
        //Given
        genericIntSet.add(6);
        genericIntSet.add(7);
        genericIntSet.add(34);
        genericIntSet.add(9);
        genericIntSet.add(5);
        genericIntSet.add(4);
        genericIntSet.add(44);
        genericIntSet.add(3);
        int expected = 8;

        //When
        genericIntSet.clear();
        int actual = genericIntSet.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest2() {
        //Given
        genericStrSet.add("Goku");
        int expected = 1;

        //When
        genericStrSet.clear();
        int actual = genericStrSet.getSize();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest1() {
        //Given
        genericIntSet.add(8);
        genericIntSet.add(7);
        genericIntSet.add(4);
        boolean expected = true;

        //When
        boolean actual = genericIntSet.contains(4);

        //Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void containsTest2() {
        //Given
        genericStrSet.add("I");
        genericStrSet.add("Want");
        genericStrSet.add("Red's");
        genericStrSet.add("Money");
        boolean expected = true;

        //When
        boolean actual = genericStrSet.contains("Money");

        //Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void containsTest3() {
        //Given
        genericIntSet.add(8);
        genericIntSet.add(7);
        genericIntSet.add(4);
        genericIntSet.add(12);
        boolean expected = false;

        //When
        boolean actual = genericIntSet.contains(11);

        //Then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void containsTest4() {
        //Given
        genericStrSet.add("I");
        genericStrSet.add("Want");
        genericStrSet.add("Red's");
        genericStrSet.add("Money");
        boolean expected = false;

        //When
        boolean actual = genericStrSet.contains("Deebo");

        //Then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void isEmptyTest1() {
        //Given
        myIntArrayList.add(2);
        boolean expected = false;

        //When
        //clear/Remove method never used so it should still contain its value
        boolean actual = myIntArrayList.isEmpty();

        //Then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void isEmptyTest2() {
        //Given
        genericStrSet.add("Vegeta");
        boolean expected = false;

        //When
        //clear/Remove method never used so it should still contain its value
        boolean actual = genericStrSet.isEmpty();

        //Then
        Assert.assertEquals(false, actual);
    }
//
//    @Test
//    public void toArrayTest() {
//        //Given
//        String[] strings = new String[myStrArrayList.getSize()];
//        myStrArrayList.add("Hope");
//        myStrArrayList.add("This");
//        myStrArrayList.add("Works");
//        expected
//        //When
//        myStrArrayList.toArray(strings);
//        actual
//
//        //Then
//        Assert.assertEquals(expected, actual);
//
//    }
}