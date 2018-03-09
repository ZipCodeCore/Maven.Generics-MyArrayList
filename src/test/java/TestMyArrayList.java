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
    public void integerGetTest(){
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
    public void stringGetTest(){
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
    public void integerRemoveTest(){
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
    public void stringRemoveTest(){
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
    public void integerSetTest(){
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
    public void stringSetTest(){
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

        //when

        //then

    }

    @Test
    public void isEmptyTest(){
        //given

        //when

        //then

    }

    @Test
    public void containsTest(){
        //given

        //when

        //then

    }


}
