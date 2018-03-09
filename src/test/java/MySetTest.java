import org.junit.Assert;
import org.junit.Test;

public class MySetTest {


    @Test
    public void testAdd(){
        // Given
        MySet<Integer> testSet = new MySet<>();
        // When
        testSet.add(12);
        testSet.add(2);
        testSet.add(2);
        testSet.add(12);
        // Then
        Assert.assertTrue(testSet.size() == 2);
    }

    @Test
    public void testAddAll(){
        // Given
        // When
        // Then
    }

    @Test
    public void testClear() {
        // Given
        MySet<Integer> testSet = new MySet<>();
        // When
        testSet.clear();
        // Then
        Assert.assertTrue(testSet.size() == 0);

    }

    @Test
    public void testContains() {
        // Given
        MySet<Integer> testSet = new MySet<>();
        // When
        testSet.add(212);
        testSet.add(112);
        testSet.add(231);
        Integer valueToBeFound = 231;
        // Then
        Assert.assertTrue(testSet.contains(231));
    }

    @Test
    public void testContainsAll() {
        // Given
        // When
        // Then
    }

    @Test
    public void testEquals() {
        // Given
        // When
        // Then
    }

    @Test
    public void testHashCode() {
        // Given
        // When
        // Then
    }

    @Test
    public void testIsEmpty() {
        // Given
        // When
        // Then
    }

    @Test
    public void testIterator() {
        // Given
        // When
        // Then
    }

    @Test
    public void testRemove() {
        // Given
        // When
        // Then
    }

    @Test
    public void testRemoveAll() {
        // Given
        // When
        // Then
    }

    @Test
    public void testRetainAll() {
        // Given
        // When
        // Then
    }

    @Test
    public void testSize() {
        // Given
        MySet<Integer> testSet = new MySet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(2);
        testSet.add(4);
        // When
        int expected = 3;
        int actual = testSet.size();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray() {
        // Given
        // When
        // Then
    }

    @Test
    public void testToArrayTwoArgs() {
        // Given
        // When
        // Then
    }

}
