import org.junit.Assert;
import org.junit.Test;

public class MySetTest {


    @Test
    public void testAdd(){
        // Given
        MySet<Integer> testSet = new MySet<>(0);
        // When
        testSet.add(12);
        testSet.add(2);
        testSet.add(2);
        testSet.add(12);
        int expected = 2;
        // Then
        Assert.assertEquals(expected , testSet.size());
    }

    @Test
    public void testAddAll(){
        // Given
        MySet<String> testSet = new MySet<>(0);
        String[] eray = {"What", "Else", "Can", "I", "Say", "But", "Hey", "You're", "Welcome"};
        // When
        testSet.add("Rock");
        testSet.add("Says,");
        testSet.addAll(eray);
        // Then
        Assert.assertEquals( 11, testSet.size());
    }

    @Test
    public void get() {
        int index =3;
        MySet<String> testSet = new MySet<>(0);
        testSet.add("Hercules");
        testSet.add("Heracles");
        testSet.add("Hermes");
        testSet.add("Hera");

        Assert.assertTrue(testSet.get(3).equals("Hera"));

    }
    @Test
    public void testClear() {
        // Given
        MySet<Integer> testSet = new MySet<>(10);
        // When
        testSet.clear();
        // Then
        Assert.assertTrue(testSet.size() == 0);

    }

    @Test
    public void testContains() {
        // Given
        MySet<Integer> testSet = new MySet<>(0);
        // When
        testSet.add(212);
        testSet.add(112);
        testSet.add(231);
        Integer valueToBeFound = 231;
        // Then
        Assert.assertTrue(testSet.contains(valueToBeFound));
    }

    @Test
    public void testIsEmpty() {
        // Given
        MySet<String> testSet = new MySet<>(0);

        // When
        testSet.add("Hula");
        testSet.add("Hoop");
        testSet.add("Hope");
        testSet.remove("Hope");
        testSet.remove("Hoop");
        testSet.remove("Hula");
        boolean actual = testSet.isEmpty();
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testRemove() {
        // Given
        MySet<String> testSet = new MySet<>(0);
        // When
        testSet.add("Hula");
        testSet.add("Hoop");
        testSet.add("Hope");
        testSet.remove("Hope");
        testSet.remove("Hoop");

        int actual = testSet.size();
        // Then
        Assert.assertTrue(actual == 1);
    }


    @Test
    public void testSize() {
        // Given
        MySet<Integer> testSet = new MySet<>(3);

        // When
        int expected = 3;
        int actual = testSet.size();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray() {
        // Given
        MySet<String> testSet = new MySet<>(0);
        String[] disneyFilms = {"The Fox and the Hound", "The Rescuers Down Under",
                "The Black Cauldron", "Pete's Dragon"};
        testSet.add("Moana");
        testSet.add("The Great Mouse Detective");
        // When

        testSet.addAll(disneyFilms);
        String[] expected = {"Moana", "The Great Mouse Detective",
                "The Fox and the Hound", "The Rescuers Down Under",
                "The Black Cauldron", "Pete's Dragon"};
        // Then
        Assert.assertEquals(expected, testSet.toArray());
    }
}
