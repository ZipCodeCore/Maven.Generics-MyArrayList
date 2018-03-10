import org.junit.Assert;
import org.junit.Test;

public class MySetTest {
    @Test
    public void addTest() {
        //Given
        MySet<Integer> mySet = new MySet<>();
        Integer expected = 3;
        mySet.add(expected);
        //when
        Integer actual = mySet.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        //given
        Integer indexToRemove = 2;
        Integer expected = 8;
        MySet<Integer> mySet = new MySet<>();
        mySet.add(2);
        mySet.add(4);
        mySet.add(6);
        mySet.add(8);
        mySet.remove(indexToRemove);
        //when
        Integer actual = mySet.get(indexToRemove);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest() {
        //given
        Integer indexValue = 3;
        Integer expected = 4;
        MySet<Integer> mySet = new MySet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        //when
        Integer actual = mySet.get(indexValue);
        //then
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void setTest() {
        //given
        MySet<String> mySet = new MySet<>();
        String expected = "cervezas";
        mySet.add("Yo");
        mySet.add("Quiero");
        mySet.add("Tacos");
        mySet.set(expected, 2);
        //when
        String actual = mySet.get(2);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addTest2() {
        //given
        MySet<Integer> mySet = new MySet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        mySet.add(20, 3);

        //when
        Integer expected = 20;
        Integer actual = mySet.get(3);
        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clearTest() {
        //given
        MySet<String> mySet = new MySet<>();
        mySet.add("Jess");
        mySet.add("Bo");
        mySet.add("Kibret");

        mySet.clear();
        //when
        String expected = null;
        String actual = mySet.get(0);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        //given
        MySet<Character> mySet = new MySet<>();
        Boolean expected = true;
        //when
        Boolean actual = mySet.isEmpty();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        //given
        MySet<String> mySet = new MySet<>();
        String valueToContain = "Hola";
        mySet.add("Como estas");
        mySet.add(valueToContain);
        mySet.add("muy bien y tu");
        Boolean expected = true;

        //when
        Boolean actual = mySet.contains(valueToContain);

        //then
        Assert.assertEquals(expected, actual);
    }
}
