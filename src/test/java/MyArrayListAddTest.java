import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListAddTest{

    private MyArrayList theList;
    private Integer[] numbers;

    @Before
    public void setUp() throws Exception {

        Integer size = 6;
        theList = new MyArrayList(size);
        numbers = new Integer[]{1, 5, 7, 8, 9, 10};
    }

    @Test
    public void addIntegerTest() {

        Integer test1 = 7;
        boolean expected = true;
        boolean actual = theList.add(test1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStringTest() {

        String test1 = "the Book";
        Integer test2 = 2;
        theList.add(test1);
        theList.add(test2);
        boolean expected = true;
        boolean actual = theList.contains(test2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToSpecificIndex() {
        for (int i = 1; i < 13; i++) {
            theList.add(i);
        }
        theList.add(5, 7);

        int expected = 5;
        int actual = (Integer)theList.get(7);

        assertEquals(expected, actual);
    }

}