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
    public void getTest(){
        //given

        //when

        //then

    }

    @Test
    public void removeTest(){
        //given

        //when

        //then

    }

    @Test
    public void setTest(){
        //given

        //when

        //then

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
