import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);


        Integer expected = 5;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add1() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");

        Integer expected = 3;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void add2() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);

        list.add(5, 8);

        Integer expected = 6;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addAll() {
        String[] list = {"Kevin", "Blase", "Luke"};
        MyArrayList<String> update = new MyArrayList<>();
        update.addAll(list);

        Integer expected = 3;
        Integer actual = update.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);

        list.clear();

        Integer expected = 0;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void contains() {
        String[] list = {"Kevin", "Blase", "Luke"};
        MyArrayList<String> update = new MyArrayList<>();
        update.addAll(list);

        Assert.assertTrue(update.contains("Luke"));
    }

    @Test
    public void get() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);


        Integer expected = 5;
        Integer actual = list.get(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);


        Integer expected = 1;
        Integer actual = list.indexOf(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);

        list.clear();

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void removeObj() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");
        list.removeObj("Blase");

        String[] expected = {"Kevin", "Luke"};
        String[] actual = list.toArray(new String[0]);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeObj1() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");
        list.removeObj("Tom");

        String[] expected = {"Kevin", "Blase", "Luke"};
        String[] actual = list.toArray(new String[0]);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void set() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);

        list.set(2, 8);

        Integer expected = 8;
        Integer actual = list.get(2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toArray() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");

        String[] expected = {"Kevin", "Blase", "Luke"};
        String[] actual = list.toArray(new String[0]);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void toArray1() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");

        String[] expected = {"Kevin", "Blase", "Luke"};
        Object[] actual = list.toArray();

        Assert.assertEquals(expected, actual);


    }
}