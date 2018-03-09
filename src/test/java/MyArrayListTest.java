import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {
    MyArrayList<Integer> myArrayList;

    @Before
    public void setup(){
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void constructorWithIntTest(){
        int expected = 5;
        myArrayList = new MyArrayList(expected);
        int actual = myArrayList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Integer five = 5;
        myArrayList.add(five);
        Assert.assertEquals(five, myArrayList.get(0));
    }

    @Test
    public void setTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        Integer[] expected = new Integer[]{one, two, three, four, five};
        myArrayList.set(expected);
        Assert.assertEquals(expected, myArrayList.getArray());
    }

    @Test
    public void clearTest(){
        Integer five = 5;
        Integer ten = 10;
        myArrayList.add(five);
        myArrayList.add(ten);
        myArrayList.clear();
        Assert.assertArrayEquals(myArrayList.getArray(), new Integer[0]);
    }

    @Test
    public void removeTObjectTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        myArrayList.add(one);
        myArrayList.add(two);
        myArrayList.add(three);
        myArrayList.add(four);
        myArrayList.add(five);
        myArrayList.remove(two);
        Assert.assertNotEquals(myArrayList.get(1), two);
    }

    @Test
    public void removeIndexTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        myArrayList.add(one);
        myArrayList.add(two);
        myArrayList.add(three);
        myArrayList.add(four);
        myArrayList.add(five);
        myArrayList.remove(1);
        Assert.assertNotEquals(myArrayList.get(1), two);
    }

    @Test
    public void containsTrueTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        myArrayList.add(one);
        myArrayList.add(two);
        myArrayList.add(three);
        myArrayList.add(four);
        myArrayList.add(five);
        Assert.assertTrue(myArrayList.contains(one));
    }

    @Test
    public void containsFalseTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        myArrayList.add(one);
        myArrayList.add(two);
        myArrayList.add(four);
        myArrayList.add(five);
        Assert.assertFalse(myArrayList.contains(three));
    }

    @Test
    public void isEmptyTrueTest(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        myArrayList.add(one);
        myArrayList.add(two);
        myArrayList.add(three);
        myArrayList.add(four);
        myArrayList.add(five);
        Assert.assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void isEmptyFalseTest(){
        Assert.assertTrue(myArrayList.isEmpty());
    }

}
