import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyArrayListTest {
    private int length;
    private int size;
    private MyArrayList theList;
    private Integer[] numbers;

    @Before
    public void setUp() throws Exception {
        size = 0;
        length = 6;
        theList = new MyArrayList(length);
        numbers = new Integer[]{1, 5, 7, 8, 9, 10};
    }

    @Test
    public void ensureCapacityStaysSameTest() {
        // check to see if current size - current length is great 0
        // if its < grow the array by 10;
        theList.ensureCapacity(size + 1);
        int expected = 6;
        int actual = theList.getCapacity();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ensureCapacityGrowsTest() {
        // check to see if current size - current length is great 0
        // if its < grow the array by 10;
        theList.ensureCapacity(+8);
        int expected = 16;
        int actual = theList.getCapacity();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void growTest() {
        theList.grow();
        int expected = numbers.length + 10;
        int actual = theList.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAtSpecificIndexMixTest() {
        int index = 0;
        String test1 = "the Book";
        Integer test2 = 2;
        theList.add(test1);
        theList.add(test2);

        String expected = test1;
        String actual = (String) theList.get(index);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAtSpecificIndexStringTest() {
        int index = 0;
        String[] names = new String[]{"dave", "the Cat", "Bob", "Tim", "something", "anotherOne"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);

        String expected = "dave";
        String actual = (String) theList.get(index);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAtSpecificIndexIntegerTest() {
        int index = 0;
        Integer[] num = new Integer[]{1, 3, 5};

        theList.add(num[0]);
        theList.add(num[1]);
        theList.add(num[2]);

        Integer expected = 1;
        Integer actual = (Integer) theList.get(index);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNullTest() {
        int index = 12;
        String[] names = new String[]{"dave", "the Cat", "Bob", "Tim", "something", "anotherOne"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);

        String expected = null;
        String actual = (String) theList.get(index);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeTest() {
        int index = 12;
        String[] names = new String[]{"dave", "the Cat", "Bob"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);
        theList.remove(names[1]);

        int expected = 2;
        int actual = theList.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCheckIfContainsObjectTest() {
        int index = 12;
        String[] names = new String[]{"dave", "the Cat", "Bob"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);
        theList.remove(names[1]);

        boolean expected = false;
        boolean actual = theList.contains("the Cat");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCheckObjectsWhereShiftedTest() {
        int index = 12;
        String[] names = new String[]{"dave", "the Cat", "Bob"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);
        theList.remove(names[1]);

        int expected = 1;
        int actual = theList.indexOf("Bob");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeObjecDoesNotExistTest() {
        int index = 12;
        String[] names = new String[]{"dave", "the Cat", "Bob"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);
        theList.remove(names[1]);
        theList.remove("the Cat");
        boolean expected = false;
        boolean actual = theList.remove("the Cat");
        Assert.assertEquals(expected, actual);
    }


    @Test

    public void indexOfTest() {

        String[] names = new String[]{"dave", "the Cat", "Bob"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);

        int expected = 2;
        int actual = theList.indexOf("Bob");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfNullTest() {
        int index = 12;
        String[] names = new String[]{"dave", "the Cat", "Bob"};

        theList.add(names[0]);
        theList.add(names[1]);
        theList.add(names[2]);

        int expected = -1;
        int actual = theList.indexOf(12);
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void clearTest() {
        for (int i = 0; i < 50; i++) {
            theList.add(i);
        }
        theList.clear();

        int expected = 10;
        int actual = theList.getCapacity();

        assertEquals(expected, actual);
    }


}