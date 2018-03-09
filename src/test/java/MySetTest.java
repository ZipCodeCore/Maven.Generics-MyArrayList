import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MySetTest{
    MySet mySet;

    @Before
    public void setup(){
        mySet = new MySet();
    }

    @Test
    public void uniqueAddTrueTest(){
        Integer one = 1;
        mySet.add(one);
        Assert.assertTrue(mySet.contains(one));
    }

    @Test
    public void uniqueAddFalseTest(){
        Integer one = 1;
        mySet.add(one);
        mySet.add(one);
        Assert.assertEquals(mySet.size(), 1);
    }

    @Test
    public void containsTest(){
        Integer one = 1;
        mySet.add(one);
        Assert.assertTrue(mySet.contains(one));
    }

    @Test
    public void hashTest(){
        String one = "iowheiorhioewh";
        int expected = one.hashCode();
        mySet.add(one);
        int actual = mySet.getHash();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void varArgsAddTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        Integer[] expected = new Integer[]{one, two, three, four, five};
        mySet.add(one, two, three, four, five);
        Assert.assertEquals(mySet.getArray(), expected);
    }

}
