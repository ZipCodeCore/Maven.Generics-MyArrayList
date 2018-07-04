import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

    MyArrayList<Integer> testArray;


    @Before
    public void setup(){
       // Integer[] input = {1,4,3,2,2};
        testArray = new MyArrayList();
        testArray.add(1);
        testArray.add(4);
        testArray.add(3);
        testArray.add(2);
        testArray.add(2);

    }


    @Test
    public void removeTest(){
        Integer valueToRemove = 3;
        testArray.remove(valueToRemove);
        Assert.assertFalse(testArray.contains(valueToRemove));


//        Integer[] expected = {1,4,2,2};
//
//        Integer[] actual = testArray.remove(valueToRemove);
//        Assert.assertEquals(expected,actual);

    }

    @Test
    public void addtoEndTest(){

        Integer expected = 4;
        Integer actual = testArray.get(1);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void addWithIndexTest(){
        Integer index = 2;
        Integer expected = 7;
        Integer oldValue = testArray.get(index);

        testArray.add(index, expected);
        Integer actual = testArray.get(index);
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(oldValue, testArray.get(index + 1));

//        for  (int i = 0; i <testArray.size(); i++){
//            System.out.println(testArray.get(i));
//        }

    }

    @Test
    public void getTest(){
        //Given
        Integer testInteger = 1;
        //When
        Integer expected = 4;
        Integer actual = testArray.get(testInteger);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest(){
        Integer testIndex = 2;
        Integer newValue = 7;

        Integer expected = newValue;
        testArray.set(testIndex,newValue);
        Integer actual = testArray.get(testIndex);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyTest(){
        Boolean expected = false;
        Boolean actual = testArray.isEmpty();
        Assert.assertFalse(actual);
    }

    @Test
    public void clearTest(){
        testArray.clear();
        //Boolean expected = true;
        Boolean actual = testArray.isEmpty();
        Assert.assertTrue(actual);

    }

    @Test
    public void containsTest(){
        Integer valWereLookingFor = 4;
        Assert.assertTrue(testArray.contains(valWereLookingFor));

    }

    @Test
    public void sizeTest(){
        Integer expected = 5;
        Integer actual = testArray.size();

        Assert.assertEquals(expected,actual);
    }
}
