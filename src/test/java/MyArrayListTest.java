import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MyArrayListTest {



    @Test
    public void addTest() {
        //Given
        MyArrayList<Integer> testArray = new MyArrayList<Integer>(3);
        //When
        int expected = 4;
        testArray.add(1);
        //Then
        int actual = testArray.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {

    }

    @Test
    public void addAll() {

    }

    @Test
    public void get() {

    }

    @Test
    public void remove() {

    }

    @Test
    public void set() {

    }

    @Test
    public void clear() {

    }

    @Test
    public void isEmpty() {

    }

    @Test
    public void contains() {

    }
}
