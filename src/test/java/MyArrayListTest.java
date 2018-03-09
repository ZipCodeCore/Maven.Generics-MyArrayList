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
       theList.ensureCapacity(size+1);
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
    public void ensureCapacityListisNotNegtiveTest() {


    }

    @Test
    public void growTest() {
        theList.grow();
        int expected = numbers.length + 10;
        int actual = theList.getSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trimSizeTest() {


    }

    @Test
    public void reFactorArraySize() {
    }
}