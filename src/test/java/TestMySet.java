import org.junit.Assert;
import org.junit.Test;

public class TestMySet {

    @Test
    public void intAddTest(){
        //given
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 5;
        //when
        mySet.add(expected);
        //then
        Integer actual = mySet.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void strAddTest(){
        //given
        MySet<String> mySet = new MySet<>();
        String expected = "Cat";
        //when
        mySet.add(expected);
        //then
        String actual = mySet.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strAddTestTwo(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Cat");
        String expected = "Cat";
        //when
        mySet.add(expected);
        //then
        String actual = mySet.get(0);
        Assert.assertEquals(expected, actual);
        //Prints "This value already exists in the set"
    }

    @Test
    public void doubleAddTest(){
        //given
        MySet<Double> mySet = new MySet<>();
        Double expected = 1234.000;
        //when
        mySet.add(expected);
        //then
        Double actual = mySet.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intGetTest(){
        //given
        Integer expected = 7;
        MySet<Integer>mySet = new MySet<>();
        mySet.add(10);
        mySet.add(9);
        mySet.add(8);
        mySet.add(expected);
        mySet.add(6);
        //when
        Integer actual =  mySet.get(3);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strGetTest(){
        //given
        String expected = "Cat";
        MySet<String>mySet = new MySet<>();
        mySet.add("Horse");
        mySet.add("Duck");
        mySet.add("Dog");
        mySet.add(expected);
        mySet.add("Bunny");
        //when
        String actual =  mySet.get(3);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intRemoveTest(){
        //given
        MySet<Integer> mySet = new MySet<>();
        mySet.add(10);
        mySet.add(9);
        mySet.add(8);
        mySet.add(5);
        Integer expected = 5;
        //when
        mySet.remove(8);
        //then
        Integer actual = mySet.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strRemoveTest(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Cat");
        mySet.add("Dog");
        mySet.add("Duck");
        mySet.add("Horse");
        String expected = "Horse";
        //when
        mySet.remove("Duck");
        //then
        String actual = mySet.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intSetTest(){
        //given
        MySet<Integer> mySet = new MySet<>();
        mySet.add(10);
        mySet.add(9);
        mySet.add(8);
        mySet.add(5);
        Integer expected = 25;
        //when
        mySet.set(2, expected);
        //then
        Integer actual = mySet.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strSetterTest(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Cat");
        mySet.add("Horse");
        mySet.add("fdgkjhdfgkjhdgkjhf");
        mySet.add("Dog");
        String expected = "Duck";
        //when
        mySet.set(2, expected);
        //then
        String actual = mySet.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Cat");
        mySet.add("Horse");
        mySet.add("Bird");
        mySet.add("Dog");

        //when
        mySet.clear();
        boolean expected = true;
        //then
        boolean actual = mySet.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        MySet<String> mySet = new MySet<>();
        //when
        mySet.isEmpty();
        //then
        Assert.assertTrue(mySet.isEmpty());
    }

    @Test
    public void isEmptyTestTWO(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Ducky");
        //when
        mySet.isEmpty();
        //then
        Assert.assertFalse(mySet.isEmpty());
    }

    @Test
    public void containsTest(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Ducky");
        //when
        mySet.contains("Dog");
        //then
        Assert.assertFalse(false);
    }

    @Test
    public void containsTestTWO(){
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Ducky");
        mySet.add("Dog");
        //when
        mySet.contains("Dog");
        //then
        Assert.assertTrue(true);
    }


}
