import org.junit.Test;
import org.junit.Assert;

public class MySetTest {

    @Test
    public void addTest(){
        //Given
        MySet<Integer> mySet = new MySet<>();
        //When
        Integer expected = 4;
        mySet.add(expected);
        //Then
        Integer actual = mySet.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //Given
        Integer removedAtIndex = 2;
        Integer expected = 3;
        MySet<Integer> mySet = new MySet<>();
        //When
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.remove(removedAtIndex);
        //Then
        Integer actual = mySet.get(removedAtIndex);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest(){
        //Given
        Integer indexValue = 3;
        Integer expected = 4;
        MySet<Integer> mySet = new MySet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        //When
        Integer actual = mySet.get(indexValue);
        //Then
        Assert.assertEquals(actual, expected);

        }
    @Test
    public void setTest() {
        //Given
        MySet<String> mySet = new MySet<>();
        String expected = "you";
        mySet.add("got way to much");
        mySet.add("time");
        mySet.add("I'm the **** I ain't even in my prime");
        mySet.set(expected, 2);
        //When
        String actual = mySet.get(2);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addTest2() {
        //Given
        MySet<Integer> mySet = new MySet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        mySet.add(3, 7);

        //When
        Integer expected = 7;
        Integer actual = mySet.get(3);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clearTest() {

        //Given
        MySet<Integer> mySet = new MySet<>();
        //When
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.clear();
        Assert.assertEquals(mySet.size(), 0);
        Assert.assertTrue(mySet.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        //Given
        MySet<Character> mySet = new MySet<>();
        Boolean expected = true;
        //When
        Boolean actual = mySet.isEmpty();
        //Then
        Assert.assertEquals(expected, actual);
        }

    @Test
    public void containsTest() {
        //Given
        MySet<String> mySet = new MySet<>();
        String valueToContain = "I";
        mySet.add("accept your challenge");
        mySet.add(valueToContain);
        mySet.add("M'Baku");
        Boolean expected = true;

        //When
        Boolean actual = mySet.contains(valueToContain);

        //Then
        Assert.assertEquals(expected, actual);
        }

}
