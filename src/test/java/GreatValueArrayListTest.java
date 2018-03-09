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
public class GreatValueArrayListTest {
    GreatValueArrayList<Integer> greatValueArrayList;

    @Before
    public void setUp() {
        greatValueArrayList = new GreatValueArrayList<>();
    }

    @Test
    public void addWithEnoughSpace() {
        int expected = greatValueArrayList.size() + 1;
        greatValueArrayList.add(1);
        int actual = greatValueArrayList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToFullArray() {
        greatValueArrayList = new GreatValueArrayList<>(1);

        int expectedSize = greatValueArrayList.size() + 1;
        int expectedCapacity = greatValueArrayList.getCapacity();

        greatValueArrayList.add(1);

        int actualSize = greatValueArrayList.size();
        int actualCapacity = greatValueArrayList.getCapacity();

        Assert.assertEquals(expectedCapacity, actualCapacity);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void ensureCapacity() {
        greatValueArrayList = new GreatValueArrayList<>(0);
        int expected = (greatValueArrayList.getCapacity() + 2) * 2;

        greatValueArrayList.grow();
        int actual = greatValueArrayList.getCapacity();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void resizeArray() {
        int newCapacity = 100;
        greatValueArrayList.grow(newCapacity);
        int actual = greatValueArrayList.getCapacity();

        Assert.assertEquals(newCapacity, actual);
    }

    @Test
    public void get() {
        Integer expected = 4;
        greatValueArrayList.add(expected);
        Integer actual = greatValueArrayList.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer valueToRemove = 4;
        greatValueArrayList = new GreatValueArrayList<>(Arrays.asList(input));
        greatValueArrayList.remove(valueToRemove);
        Integer[] actual = greatValueArrayList.toArray(new Integer[0]);

        for (Integer i : actual) {
            if (i.equals(4))
                Assert.fail();
        }
    }

    @Test
    public void clear() {
        Integer[] input = {1, 2, 3, 4, 5};
        greatValueArrayList = new GreatValueArrayList<>(Arrays.asList(input));

        Assert.assertEquals(greatValueArrayList.size(), input.length);

        greatValueArrayList.clear();
        int expected = 0;
        int actual = greatValueArrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrue() {
        greatValueArrayList = new GreatValueArrayList<>(0);
        Assert.assertTrue(greatValueArrayList.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        Integer[] input = {1, 2, 3, 4, 5};
        greatValueArrayList = new GreatValueArrayList<>(Arrays.asList(input));

        Assert.assertFalse(greatValueArrayList.isEmpty());
    }

    @Test
    public void containsTrue() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer inArray = input[0];
        greatValueArrayList = new GreatValueArrayList<>(Arrays.asList(input));

        Assert.assertTrue(greatValueArrayList.contains(inArray));
    }

    @Test
    public void containsFail() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer notInArray = 6;
        greatValueArrayList = new GreatValueArrayList<>(Arrays.asList(input));

        Assert.assertFalse(greatValueArrayList.contains(notInArray));
    }
}