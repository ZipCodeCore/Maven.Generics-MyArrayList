import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void myArrayListAddTest(){
        MyArrayList<String> testArrayList = new MyArrayList();
        String expected = "Test String";
        testArrayList.add(expected);
        String actual = testArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myArrayListRemoveTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);
        testArrayList.remove(1);
        int expected = 3;
        int actual = testArrayList.get(1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        boolean expected = true;
        boolean actual = testArrayList.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest2(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        boolean expected = false;
        boolean actual = testArrayList.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.clear();
        boolean expected = true;
        boolean actual = testArrayList.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myArrayListSetTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);
        testArrayList.set(3,1);
        int expected = 3;
        int actual = testArrayList.get(1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void myArrayListContainsTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);
        boolean expected = false;
        boolean actual = testArrayList.contains(5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void myArrayListContainsTest2(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);
        boolean expected = true;
        boolean actual = testArrayList.contains(3);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void myArrayListAddAtIndexTest(){
        MyArrayList<Integer> testArrayList = new MyArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);
        testArrayList.add(3,1);
        int expected = 3;
        int actual = testArrayList.get(1);
        Assert.assertEquals(expected,actual);
    }
}
