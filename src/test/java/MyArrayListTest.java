import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {



    @Test
    public void addIntegerTest() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        int expected = 6;
        testArray.add(1);
        int actual = testArray.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStringTest() {
        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        int expected = 6;
        testArray.add("Ain't no thang!");
        int actual = testArray.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addIntegerTestTwoArgs() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        int expected = 7;
        testArray.add(6, 22);
        int actual = testArray.size();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addStringTestTwoArgs() {

        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        int expected = 7;
        testArray.add(6, "Isn't it ironic?");
        int actual = testArray.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        String[] people = {"Dan Stooser", "Martin Kleadman", "Freudman Rachborn", "Seanly Priborg"};
        testArray.add(0, "Reinhardt Massvender");
        testArray.add(1, "Cloryfa Dergen");
        testArray.add(2, "Sudentra Swalmner");
        testArray.add(3, "Clarrifa Mantfloyva");
        testArray.add(4, "Blunth Deshman");
        testArray.addAll(people);
        int expected = 9;
        int actual = testArray.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAllIntegers() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        Integer[] people = {12, 21, 344,  3234, 324344};
        testArray.add(0, 98372);
        testArray.add(1, 23421);
        testArray.add(2, 2343144);
        testArray.add(3, 234234322);
        testArray.add(4, 2382);
        testArray.addAll(people);
        int expected = 10;
        int actual = testArray.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        Assert.assertTrue(testArray.get(3) == null);
        //Then
    }

    @Test
    public void getInteger() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        testArray.set(4, 3);
        //Then
        Assert.assertTrue(testArray.get(4) == 3 );
    }

    @Test
    public void remove() {

        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        int expected = 4;
        testArray.remove(6);
        //Then
        int actual = testArray.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void set() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        int testIndex = 3;
        //When
        testArray.set(testIndex, 5);
        //Then
        Integer expected = 5;
        Integer actual = testArray.get(testIndex);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void clear() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        testArray.clear();
        //Then
        Assert.assertTrue(testArray.isEmpty());
    }

    @Test
    public void isEmptyTrue() {
        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        testArray.add(0, "Hoobastank");
        testArray.add(1, "Coldplay");
        testArray.add(2, "Green Day");
        testArray.add(3, "Blue Jupiter");
        testArray.add(4, "Blue Monday");
        testArray.remove(0);
        testArray.remove(1);
        testArray.remove(2);
        testArray.remove(3);
        testArray.remove(4);
        //Then
        Assert.assertTrue(testArray.isEmpty());
    }

    @Test
    public void isEmptyStringFalse() {
        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        testArray.set(0, "Twilight");
        testArray.set(1,  "Princess");
        testArray.set(2, "Filter");
        testArray.set(3, "Zone");
        testArray.set(4, "Sparkle");
        //Then
        Assert.assertFalse(testArray.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<>();
        //When
        testArray.set(0, 221);
        testArray.set(1,  12);
        testArray.set(2, 33);
        testArray.set(3, 345);
        testArray.set(4, 6546);
        //Then
        Assert.assertFalse(testArray.isEmpty());
    }

    @Test
    public void containsFalse() {
    //Given
        MyArrayList<String> testArray = new MyArrayList<>();
    //When
        String searchCriteria = "Imperium";
        testArray.set(0, "Twilight");
        testArray.set(1,  "Princess");
        testArray.set(2, "Filter");
        testArray.set(3, "Zone");
        testArray.set(4, "Sparkle");
    //Then
        Assert.assertFalse(testArray.contains(searchCriteria));
    }

    @Test
    public void containsTrue() {
        //Given
        MyArrayList<String> testArray = new MyArrayList<>();
        //When
        String searchCriteria = "Imperium";
        testArray.set(0, "Twilight");
        testArray.set(1,  "Princess");
        testArray.set(2, searchCriteria);
        testArray.set(3, "Zone");
        testArray.set(4, "Sparkle");
        //Then
        Assert.assertTrue(testArray.contains(searchCriteria));
    }
}
