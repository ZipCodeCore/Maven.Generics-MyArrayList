import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void nullaryConstructorTest(){
        //Given
        MySet<Character> test = new MySet<>();

        //When
        int expected = 0;
        int actual = test.size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void capacityConstructorTest(){
        //Given
        MySet<Character> test = new MySet<>(5);

        //When
        Character[] expected  = {null,null,null,null,null};
        Character [] actual = test.toArray(new Character[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size()==0);
    }

    @Test
    public void arrayConstructorTest(){
        //Given
        String[] testInput = {"This", "is", "a", "test"};
        MySet<String> test = new MySet<>(testInput);

        //When
        String[] expected  = {"This", "is", "a", "test"};
        String [] actual = test.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size()==4);
    }

    @Test
    public void arrayConstructorWithDuplicateTest(){
        //Given
        String[] testInput = {"This", "is", "a", "test", "This", "is", "a", "test"};
        MySet<String> test = new MySet<>(testInput);

        //When
        String[] expected  = {"This", "is", "a", "test"};
        String [] actual = test.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size()==4);
    }

    @Test
    public void addTest(){
        //Given
        MySet<Character> test = new MySet<>(5);
        test.add('a');
        test.add('b');

        //When
        Character[] expected  = {'a','b',null,null,null};
        Character [] actual = test.toArray(new Character[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void dontAddDuplicatesTest(){
        //Given
        MySet<Integer> test = new MySet<>(5);
        test.add(1);
        test.add(2);
        test.add(1);
        test.add(2);

        //When
        Integer[] expected  = {1,2,null,null,null};
        Integer [] actual = test.toArray(new Integer[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size()==2);
    }

    @Test
    public void clearTest(){
        //Given
        String[] testInput = {"This", "is", "a", "test"};
        MySet<String> test = new MySet<>(testInput);

        //When
        test.clear();
        String[] expected  = {null,null,null,null};
        String [] actual = test.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size()==0);
    }

    @Test
    public void containsTest(){
        //Given
        Double[] testInput = {5d,9d,3.14,8d};
        MySet<Double> test = new MySet<>(testInput);

        //Then
        Assert.assertTrue(test.contains(3.14));
    }

    @Test
    public void isEmptyTest(){
        //Given
        MySet<Character> test = new MySet<>(5);

        //Then
        Assert.assertTrue(test.isEmpty());
    }

    @Test
    public void removeTest(){
        //Given
        String[] testInput = {"This", "is", "a", "test"};
        MySet<String> test = new MySet<>(testInput);

        //When
        test.remove("This");
        String[] expected  = {"is", "a", "test",null};
        String [] actual = test.toArray(new String[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);
        Assert.assertTrue(test.size()==3);
    }

}
