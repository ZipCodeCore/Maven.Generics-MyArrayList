import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MyArrayListTest<T> {

    public MyArrayListTest() {
    }

    @Test
    public void getAddTest() {
        //Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer expected = 3;
        myArrayList.add(expected);
        Integer actual = myArrayList.get(0);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        //given
        Integer indexToRemove = 2;
        Integer expected = 8;
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(2);
        myArrayList.add(4);
        myArrayList.add(6);
        myArrayList.add(8);
        myArrayList.remove(indexToRemove);
        //when
        Integer actual = myArrayList.get(indexToRemove);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest() {
        //given
        Integer indexValue = 3;
        Integer expected = 4;
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        //when
        Integer actual = myArrayList.get(indexValue);
        //then
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void addAnywhereTest() {
        //given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        myArrayList.addAnywhere(20, 3);

        //when
        Integer expected = 20;
        Integer actual = myArrayList.get(3);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clearTest() {
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Jess");
        myArrayList.add("Bo");
        myArrayList.add("Kibret");

        myArrayList.clear();
        //when
        String expected = null;
        String actual = myArrayList.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //given
        MyArrayList<Character> myArrayList = new MyArrayList<>();
        Boolean expected = true;
        //when
        Boolean actual = myArrayList.isEmpty();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        //given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        String valueToContain = "Hola";
        myArrayList.add("Como estas");
        myArrayList.add(valueToContain);
        myArrayList.add("muy bien y tu");
        Boolean expected = true;

        //when
        Boolean actual = myArrayList.contains(valueToContain);

        //then
        Assert.assertEquals(expected, actual);
    }

}
