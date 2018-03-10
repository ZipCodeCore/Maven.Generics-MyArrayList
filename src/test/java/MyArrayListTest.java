import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
   MyArrayList test;

    @Test
    public void testAdd() {
        MyArrayList<Integer> test = new MyArrayList<Integer>();
        Integer elementToAdd = 10;
        test.add(elementToAdd);
        System.out.println(test.size());

        Integer expected = 1;
        Integer actual = test.size();

        Assert.assertEquals(expected,actual);


    }
    @Test
    public void testAddAtIndex(){
        MyArrayList<String> test = new MyArrayList<String>();
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

        test.printElements();
        System.out.println(test.size());



    }

    @Test
    public void testRemove() {
        MyArrayList<Double>test =new MyArrayList<Double>();
        test.add(2.0);
        test.add(4.75);
        test.remove(0);
    }

    @Test
    public void testRetIndex1() {
        MyArrayList<Integer> test = new MyArrayList<Integer>();
        test.add(new Integer(1));
        test.add(new Integer(2));
        test.add(new Integer(3));

        Integer expected  = 3;
        Integer actual =test.get(2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetIndex2(){
        MyArrayList<String> test = new MyArrayList<String>();
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
        test.printElements();

        String expected ="Tomorrow";
        String actual = test.get(1);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSet() {
        MyArrayList<String> test = new MyArrayList<String>();
        test.add("Coding");
        test.add("Sucks");
        test.set(1,"is Fun");

        String expected = "is Fun";
        String actual = test.get(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testClear() {
        MyArrayList<Integer> test = new MyArrayList<Integer>();
        test.add(new Integer(1));
        test.add(new Integer(2));
        test.add(new Integer(3));

        test.clear();

        boolean expected  = false;
        boolean actual = test.contains(3);

        Assert.assertEquals(expected,actual);

    }

}