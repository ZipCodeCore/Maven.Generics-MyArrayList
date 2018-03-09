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

}
