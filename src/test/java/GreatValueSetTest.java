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
public class GreatValueSetTest {
    GreatValueSet<Integer> set;

    @Before
    public void setup() {
        set = new GreatValueSet<>();
    }

    @Test
    public void addNewElement() {
        Integer[] input = {1, 2};
        Integer addMe = 3;
        int[] eArray = {1, 2, 3};
        String expected = Arrays.toString(eArray);

        set = new GreatValueSet<>(Arrays.asList(input));
        set.add(addMe);
        String actual = Arrays.toString(set.toArray());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addDuplicateElement() {
        Integer[] input = {1, 2, 3};
        Integer addMe = 3;
        int[] eArray = {1, 2, 3};
        String expected = Arrays.toString(eArray);

        set = new GreatValueSet<>(Arrays.asList(input));
        set.add(addMe);
        String actual = Arrays.toString(set.toArray());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAll() {
        Integer[] input = {1, 2, 3};
        Integer[] addMe = {4, 5, 6};
        Integer[] expectedArray = {1, 2, 3, 4, 5, 6};
        String expected = Arrays.toString(expectedArray);

        set = new GreatValueSet<>(Arrays.asList(input));
        set.addAll(Arrays.asList(addMe));

        Integer[] actualArray = set.toArray(new Integer[0]);

        Arrays.sort(actualArray);
        Arrays.sort(expectedArray);

        String actual = Arrays.toString(actualArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsAllYes() {
        Integer[] input = {1, 2, 3};
        Integer[] checkMe = {1, 2};

        set = new GreatValueSet<>(Arrays.asList(input));

        Assert.assertTrue(set.containsAll(Arrays.asList(checkMe)));
    }

    @Test
    public void containsAllNope() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] checkMe = {1, 2, 3, 4, 6};

        set = new GreatValueSet<>(Arrays.asList(input));

        Assert.assertFalse(set.containsAll(Arrays.asList(checkMe)));
    }

    @Test
    public void removeAll() {
        Integer[] input = {1, 2, 3};
        Integer[] removeUs = {2, 3};
        Integer[] expectedArray = {1};

        set = new GreatValueSet<>(Arrays.asList(input));
        set.removeAll(Arrays.asList(removeUs));

        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(set.toArray(new Integer[0]));

        Assert.assertEquals(expected, actual);
    }
}