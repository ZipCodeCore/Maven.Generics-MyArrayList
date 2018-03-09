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
        Assert.assertTrue(mySet.setAdd(one));
        Assert.assertEquals(mySet.size(), 1);
    }

    @Test
    public void uniqueAddFalseTest(){
        Integer one = 1;
        mySet.setAdd(one);
        Assert.assertFalse(mySet.setAdd(one));
        Assert.assertEquals(mySet.size(), 1);
    }

}
