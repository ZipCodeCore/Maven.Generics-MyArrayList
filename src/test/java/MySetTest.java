import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {

    @Test
    public void add() {
        MySet<Integer> list = new MySet<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(9);


        Integer expected = 5;
        Integer actual = list.size();
        System.out.println(list.toArray());
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void add1() {
        MySet<String> list = new MySet<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");
        list.add("Luke");

        Integer expected = 3;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clear() {
            MySet<Integer> list = new MySet<>();
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
        MySet<String> list = new MySet<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");
        list.add("Luke");
        Assert.assertTrue(list.contains("Luke"));
    }

    @Test
    public void isEmpty() {
        MySet<Integer> list = new MySet<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(8);

        list.clear();

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void remove() {
        MySet<String> list = new MySet<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Blase");
        list.add("Blase");
        list.add("Blase");
        list.add("Luke");
        list.remove("Blase");

        Integer expected = 2;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void toArray() {
    }


    @Test
    public void toArray1() {
        MySet<String> list = new MySet<>();
        list.add("Kevin");
        list.add("Blase");
        list.add("Luke");

        String[] expected = {"Kevin", "Blase", "Luke"};
        Object[] actual = list.toArray(new String[0]);

        Assert.assertEquals(expected, actual);

    }
}