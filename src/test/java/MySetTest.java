
import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void constructorTest(){
        String[] input = {"a", "b", "c", "a", "d", "a"};
        MySet<String> mySet = new MySet<>(input);
        Integer expected = 4;
        Integer actual = mySet.getMySet().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Integer[] input = {1,2,3,4,5};
        MySet<Integer> mySet = new MySet<>(input);
        Integer toBeAdded = 6;
        Object[] expected = {1,2,3,4,5,6};
        mySet.add(toBeAdded);
        Object[] actual = mySet.getMySet().getMyArrayList();
        Assert.assertArrayEquals(expected, actual);
    }

}
