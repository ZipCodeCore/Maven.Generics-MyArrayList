import org.junit.Assert;
import org.junit.Test;

public class TestMyArrayList {

    @Test
    public void intAddTest(){
        //given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer expected = 5;
        //when
        myArrayList.add(expected);
        //then
        Integer actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void strAddTest(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        String expected = "Cat";
        //when
        myArrayList.add(expected);
        //then
        String actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void doubleAddTest(){
        //given
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        Double expected = 1234.000;
        //when
        myArrayList.add(expected);
        //then
        Double actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intGetTest(){
        //given
        Integer expected = 7;
        MyArrayList<Integer>myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(9);
        myArrayList.add(8);
        myArrayList.add(expected);
        myArrayList.add(6);
        //when
        Integer actual =  myArrayList.get(3);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strGetTest(){
        //given
        String expected = "Cat";
        MyArrayList<String>myArrayList = new MyArrayList<>();
        myArrayList.add("Horse");
        myArrayList.add("Duck");
        myArrayList.add("Dog");
        myArrayList.add(expected);
        myArrayList.add("Bunny");
        //when
        String actual =  myArrayList.get(3);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intRemoveTest(){
        //given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(9);
        myArrayList.add(8);
        myArrayList.add(5);
        Integer expected = 5;
        //when
        myArrayList.remove(8);
        //then
        Integer actual = myArrayList.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strRemoveTest(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.add("Duck");
        myArrayList.add("Horse");
        String expected = "Horse";
        //when
        myArrayList.remove("Duck");
        //then
        String actual = myArrayList.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intSetTest(){
        //given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(9);
        myArrayList.add(8);
        myArrayList.add(5);
        Integer expected = 25;
        //when
        myArrayList.set(2, expected);
        //then
        Integer actual = myArrayList.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void strSetTest(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Cat");
        myArrayList.add("Horse");
        myArrayList.add("fdgkjhdfgkjhdgkjhf");
        myArrayList.add("Dog");
        String expected = "Duck";
        //when
        myArrayList.set(2, expected);
        //then
        String actual = myArrayList.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Cat");
        myArrayList.add("Horse");
        myArrayList.add("Bird");
        myArrayList.add("Dog");

        //when
        myArrayList.clear();
        boolean expected = true;
        //then
        boolean actual = myArrayList.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        //when
        myArrayList.isEmpty();
        //then
        Assert.assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void isEmptyTestTWO(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Ducky");
        //when
        myArrayList.isEmpty();
        //then
        Assert.assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void containsTest(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Ducky");
        //when
        myArrayList.contains("Dog");
        //then
        Assert.assertFalse(false);
    }

    @Test
    public void containsTestTWO(){
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Ducky");
        myArrayList.add("Dog");
        //when
        myArrayList.contains("Dog");
        //then
        Assert.assertTrue(true);
    }


}
