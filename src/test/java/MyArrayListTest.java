import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
   MyArrayList test;

    @Test
    public void testAdd() {
        MyArrayList<Integer> test = new MyArrayList<>();
        Integer elementToAdd = 10;
        test.add(elementToAdd);

        Integer expected = 1;
        Integer actual = test.size();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testAddAtIndex(){
        MyArrayList<String> test = new MyArrayList<>();
        test.add("Hey Bo, Jess");
        test.add("Tomorrow");
        test.add("is");
        test.add("only");
        test.add("Found");
        test.add("In");
        test.add("Calander");
        test.add("of");
        test.add("Fools");
        test.add("Get Back To Work");

        test.add(6,"The");

        String expected = "The";
        String actual = test.get(6);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testAddAll1(){
        MyArrayList<Integer>test = new MyArrayList<>();
        test.add(10);
        test.add(33);
        test.add(40);
        Integer[] arrayOfElementsToAdd = {50,25,4,77};

        test.addAll(arrayOfElementsToAdd);

        Integer expected = 7;
        Integer actual = test.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testAddAll2(){
        MyArrayList<String> test = new MyArrayList<>();

        String[] expected = {"Joshua","Luis","Kibret"};
        test.addAll(expected);
        String[]actual = test.toArray(new String[0]);

    }

    @Test
    public void testRemove() {
        MyArrayList<Double>test =new MyArrayList<>();
        test.add(2.0);
        test.add(4.75);
        test.remove(0);
    }

    @Test
    public void testRetIndex1() {
        MyArrayList<Integer> test = new MyArrayList<>();
        test.add(new Integer(1));
        test.add(new Integer(2));
        test.add(new Integer(3));

        Integer expected  = 3;
        Integer actual =test.get(2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetIndex2(){
        MyArrayList<String> test = new MyArrayList<>();
       test.add("Hey Joe");
        test.add("Tomorrow");
        test.add("is");
        test.add("only");
        test.add("Found");
        test.add("In");
        test.add("The");
        test.add("Calander");
        test.add("of");
        test.add("Fools");
        test.add("Get Back To Work");

        String expected ="Tomorrow";
        String actual = test.get(1);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSet() {
        MyArrayList<String> test = new MyArrayList<>();
        test.add("Coding");
        test.add("Sucks");
        test.set(1,"is Fun");

        String expected = "is Fun";
        String actual = test.get(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testClear1() {
        MyArrayList<Integer> test = new MyArrayList<>();
        test.add(new Integer(1));
        test.add(new Integer(2));
        test.add(new Integer(3));

        test.clear();

        boolean actual = test.contains(3);
        Assert.assertFalse(actual);

    }
    @Test
    public void testClear2() {
        MyArrayList<Long> test = new MyArrayList<>();
        test.add(14L);
        test.add(55L);
        test.add(33L);

        test.clear();
        Integer expected = 0;
        Integer actual = test.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testIsEmpty1(){
        MyArrayList<String> test = new MyArrayList<>(0);
        boolean actual = test.isEmpty();
        Assert.assertTrue(actual);
    }
    @Test
    public void testIsEmpty2(){
        MyArrayList<Character> test = new MyArrayList<>(10);
        boolean actual = test.isEmpty();

        Assert.assertTrue(actual);
    }
    @Test
    public void testIsEmpty3(){
        MyArrayList<String> test = new MyArrayList<>();
        test.add(null);
        boolean actual = test.isEmpty();
        Assert.assertFalse(actual);
    }
    @Test
    public void testGetCapacity(){
        MyArrayList<Integer>test = new MyArrayList<>(20);
        test.add(33);
        test.add(55);
        test.add(100);
        Integer actual = test.getCapacity();
        Integer expected =20;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testTrimToSize2(){
        MyArrayList<Integer>test = new MyArrayList<>(20);
        test.add(33);
        test.add(55);
        test.add(100);
        test.trimToSize();
        Integer actual = test.getCapacity();
        Integer expected =3;
        Assert.assertEquals(expected,actual);
    }

}