import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {
    //public MySet test;

    @Test
    public void TestAdd1() {
       MySet<Integer> test = new MySet<Integer>();

       boolean expected = true;
       boolean actual = test.add(10);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAdd2() {
        MySet<Integer> test = new MySet<>();
        test.add(10);
        test.add(50);
        test.add(100);

        boolean actual = test.add(50);
        Assert.assertFalse(actual);

    }
    @Test
    public void testAdd3() {
        MySet<Double> test = new MySet<>();
        test.add(10.0);
        test.add(50.0);
        test.add(100.55);

        boolean actual = test.add(100.54);
        Assert.assertTrue(actual);
    }
    @Test
    public void testAdd4() {
        MySet<String> test = new MySet<>();
        test.add("Vince");
        test.add("Don");
        test.add("Bryan");
        test.add("Laurence");

        boolean actual = test.add("Bo");
        Assert.assertTrue(actual);

    }
    @Test
    public void testAdd5() {
        MySet<String> test = new MySet<>();
        test.add("Vince");
        test.add("Don");
        test.add("Bryan");
        test.add("Laurence");

        boolean actual = test.add("Laurence");
        Assert.assertFalse(actual);

    }


    @Test
    public void testRemove1() {
        MySet<String> test = new MySet<>();
        test.add("Vince");
        test.add("Don");
        test.add("Bryan");
        test.add("Laurence");
        test.add("Bo");

        boolean actual  = test.remove("Micheal");

        Assert.assertFalse(actual);
    }
    @Test
    public void testRemove2() {
        MySet<String> test = new MySet<>();
        test.add("Vince");
        test.add("Micheal");
        test.add("Bryan");
        test.add("Laurence");
        test.add("Bo");
        test.add("Don");

        boolean actual  = test.remove("Micheal");

        Assert.assertTrue(actual);
    }


    @Test
    public void testRemove3() {
        MySet<Double> test = new MySet<>();
        test.add(33.35);
        test.add(13.78);
        test.add(45.32);
        boolean actual = test.remove(13.78);
        Assert.assertTrue(actual);

    }

    @Test
    public void testContains1() {
        MySet<Float> test = new MySet<>();
        test.add(10F);
        test.add(15.555F);
        test.add(33.1F);

        boolean actual = test.contains(15.555F);
        Assert.assertTrue(actual);


    }
    @Test
    public void testContains2(){
        MySet<Long> test = new MySet<>();
        test.add(100L);
        test.add(55555L);
        test.add(378L);

        boolean actual = test.contains(5555L);
        Assert.assertFalse(actual);


    }

    @Test
    public void testGet() {

    }
    @Test
    public void testSize(){
        MySet<String> test = new MySet<>();
        test.add("Thomas");
        test.add("John");
        test.add("Joshua");

        int expected = 3;
        int actual = test.size();

        Assert.assertEquals(expected,actual);

    }
//    @Test
//    public void testEquals(){
//        MySet<Integer>test1 = new MySet<>();
//        MySet<Integer>test2 = new MySet<>();
//
//        test1.add(10);
//        test1.add(12);
//        test1.add(34);
//
//        test2.add(10);
//        test2.add(12);
//        test2.add(34);
//        boolean expected = true;
//        boolean actual = test2.equals(test1);
//
//        Assert.assertEquals(expected,actual);
//    }
}