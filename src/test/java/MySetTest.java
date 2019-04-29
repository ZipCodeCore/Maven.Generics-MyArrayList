import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {
    private MySet<Integer> theSet;

    @Before
    public void setUp() throws Exception {
        theSet = new MySet<>();
        for (int i = 0; i <= 10; i++) {
            theSet.add(i);
        }
    }

    @Test
    public void addTest() {
        theSet.add(11);
        int expected = 12;
        int acutal = theSet.getSize();

        Assert.assertEquals(expected, acutal);
    }

    @Test
    public void addNoDuplicatesTest() {
        theSet.add(10);
        int expected = 11;
        int acutal = theSet.getSize();

        Assert.assertEquals(expected, acutal);
    }


    @Test
    public void equals() {
    }
}