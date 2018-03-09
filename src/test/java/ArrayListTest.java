import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private MyArrayList theList;
    private Integer[] numbers;

    @Before
    public void setUp() throws Exception {

        Integer size = 10;
        theList = new MyArrayList(size);
        numbers = new Integer[]{1, 5, 7, 8, 9, 10};
    }

    @Test
    public void addTest() {
        Integer test1 = 7;
        boolean expected = false;
        boolean actual = theList.add(test1);
    }

    @Test
    public void add1() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void reSizeTest(){

    }
}