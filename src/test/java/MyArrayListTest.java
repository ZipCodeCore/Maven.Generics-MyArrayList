import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * filename:
 * project: generics
 * author: https://github.com/vvmk
 * date: 3/8/18
 */
public class MyArrayListTest {
    MyArrayList<Integer> myArrayList;

    @Before
    public void setUp() {
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void addWithEnoughSpace() {
        int expected = myArrayList.size() + 1;
        myArrayList.add(1);
        int actual = myArrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToFullArray() {
        myArrayList = new MyArrayList<>(1);

        int expectedSize = myArrayList.size() + 1;
        int expectedCapacity = myArrayList.getCapacity();

        myArrayList.add(1);

        int actualSize = myArrayList.size();
        int actualCapacity = myArrayList.getCapacity();

        Assert.assertEquals(expectedCapacity, actualCapacity);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void ensureCapacity() {
        myArrayList = new MyArrayList<>(0);
        int expected = (myArrayList.getCapacity() + 2) * 2;

        myArrayList.grow();
        int actual = myArrayList.getCapacity();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void resizeArray() {
        int newCapacity = 100;
        myArrayList.grow(newCapacity);
        int actual = myArrayList.getCapacity();

        Assert.assertEquals(newCapacity, actual);
    }

    @Test
    public void get() {
        Integer expected = 4;
        myArrayList.add(expected);
        Integer actual = myArrayList.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer valueToRemove = 4;
        myArrayList = new MyArrayList<>(Arrays.asList(input));
        myArrayList.remove(valueToRemove);
        Integer[] actual = myArrayList.toArray(new Integer[0]);

        for (Integer i : actual) {
            if (i.equals(4))
                Assert.fail();
        }
    }

    @Test
    public void clear() {
        Integer[] input = {1, 2, 3, 4, 5};
        myArrayList = new MyArrayList<>(Arrays.asList(input));

        Assert.assertEquals(myArrayList.size(), input.length);

        myArrayList.clear();
        int expected = 0;
        int actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrue() {
        myArrayList = new MyArrayList<>(0);
        Assert.assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        Integer[] input = {1, 2, 3, 4, 5};
        myArrayList = new MyArrayList<>(Arrays.asList(input));

        Assert.assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void containsTrue() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer inArray = input[0];
        myArrayList = new MyArrayList<>(Arrays.asList(input));

        Assert.assertTrue(myArrayList.contains(inArray));
    }

    @Test
    public void containsFail() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer notInArray = 6;
        myArrayList = new MyArrayList<>(Arrays.asList(input));

        Assert.assertFalse(myArrayList.contains(notInArray));
    }
}