import org.junit.Assert;
import org.junit.Test;

public class myMapTest {

    @Test
    public void sizeIntTest() {
        //Given
        MyMap mapTest = new MyMap();
        mapTest.put(0, "Pax");
        mapTest.put(1, "Joe");
        mapTest.put(2, "Kay");

        //When
        int expected = 3;
        int actual = mapTest.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        //Given
        MyMap mapTest = new MyMap();
        mapTest.put("Pax", 1);
        mapTest.put("Kay", 2);
        mapTest.put("Joe", 3);

        //When
        boolean expected = false;
        boolean actual = mapTest.isEmpty();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void containsKey() {
        //Given
        MyMap mapTest = new MyMap();
        mapTest.put("Pax", 1);
        mapTest.put("Kay", 2);
        mapTest.put("Joe", 3);

        //When
        boolean expected = true;
        boolean actual = mapTest.containsKey("Pax");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsValue() {
        //Given
        MyMap mapTest = new MyMap();
        mapTest.put("Pax", 1);
        mapTest.put("Kay", 2);
        mapTest.put("Joe", 3);

        //When
        boolean expected = true;
        boolean actual = mapTest.containsValue(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clear() {
        //Given
        MyMap mapTest = new MyMap();
        mapTest.put("Pax", 1);
        mapTest.put("Kay", 2);
        mapTest.put("Joe", 3);

        //When
        mapTest.clear();

        int expected = 0;
        int actual = mapTest.size();

        //Then
        Assert.assertEquals(expected,actual);
    }
//
//    @Test
//    public void put() {
//    }
//
//    @Test
//    public void putAll() {
//    }
//
//    @Test
//    public void remove() {
//    }
//
//
//    @Test
//    public void keySet() {
//    }
//
//    @Test
//    public void entrySet() {
//    }
//
//    @Test
//    public void values() {
//    }
//
//    @Test
//    public void equals() {
//    }
//
}
