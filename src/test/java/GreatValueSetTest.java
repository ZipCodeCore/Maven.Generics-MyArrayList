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

    }

    @Test
    public void containsAll() {
    }

    @Test
    public void iterator() {
    }

    @Test
    public void removeAll() {
    }

    @Test
    public void retainAll() {
    }
}