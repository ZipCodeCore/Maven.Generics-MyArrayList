import org.junit.Assert;
import org.junit.Test;

public class MySetTest {
    @Test
    public void add()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();
        stringMySet.add("I");
        stringMySet.add("love");
        stringMySet.add("code");

        Integer expected = 3;

        //When
        Integer actual = stringMySet.size();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getTest()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();
        stringMySet.add("I");
        stringMySet.add("love");
        stringMySet.add("you");

        String expected = "love";

        //When
        String actual = stringMySet.get(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();
        stringMySet.add("I");
        stringMySet.add("hate");
        stringMySet.add("vegetables");

        String expected = "love";
        stringMySet.set("love", 1);

        //When
        String actual = stringMySet.get(1);

        //Then
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void clear()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();
        stringMySet.add("I");
        stringMySet.add("love");
        stringMySet.add("myself");

        stringMySet.clear();

        Integer expected = 0;

        //When
        Integer actual = stringMySet.size();

        //Then
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void containsTest1()
    {
        //Given
        MySet<Integer> integerMySet = new MySet<>();
        integerMySet.add(1);
        integerMySet.add(2);
        integerMySet.add(3);

        //When
        integerMySet.contains(3);

        //Then
        Assert.assertTrue(integerMySet.contains(3));
    }

    @Test
    public void containsTest2()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();

        stringMySet.add("I");
        stringMySet.add("love");
        stringMySet.add("you");

        //When
        stringMySet.contains("hate");

        //Then
        Assert.assertFalse(stringMySet.contains("hate"));
    }



    @Test
    public void removeTest()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();
        stringMySet.add("Chocolate");
        stringMySet.add("Chocolate");
        stringMySet.add("Vanilla");
        stringMySet.add("Strawberry");
        stringMySet.add("Pecan");
        stringMySet.add("Chocolate");

        stringMySet.remove("Chocolate");

        Integer expected = 3;

        //When
        Integer actual = stringMySet.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest()
    {
        //Given
        MySet<String> stringMySet = new MySet<>();
        stringMySet.add("I");
        stringMySet.add("love");
        stringMySet.add("myself");

        //When
        stringMySet.clear();

        //Then
        Assert.assertTrue(stringMySet.isEmpty());

    }




}
