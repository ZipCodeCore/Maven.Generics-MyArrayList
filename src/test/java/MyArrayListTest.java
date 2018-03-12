import org.junit.Test;
import org.junit.Assert;

public class MyArrayListTest {

    private MyArrayList<Integer> mal;

    @Test
    public void MyArrayListDefaultConstructorTest() {
        // Given
        int expectedArrayLength = 10;
        mal = new MyArrayList<>();
        // When
        int actualArrayLength = mal.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    public void MyArrayListConstructorInitialCapacityTest() {
        // Given
        int expectedArrayLength = 0;
        mal = new MyArrayList<>(expectedArrayLength);
        // When
        int actualArrayLength = mal.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    public void addElementTest() {
        // Given
        int expectedIntAtIndex0 = 0;
        int expectedIntAtIndex1 = 1;
        int startingLength = 0;
        // When
        mal = new MyArrayList<>(startingLength);
        mal.add(expectedIntAtIndex0);
        mal.add(expectedIntAtIndex1);
        int actualIntAtIndex1 = mal.get(1);
        // Then
        Assert.assertEquals(expectedIntAtIndex1, actualIntAtIndex1);
    }

    @Test
    public void addIndexElementTest() {
        // Given
        int expectedIndex0 = 0;
        int expectedIntAtIndex0 = 0;
        int expectedIndex1 = 1;
        int expectedIntAtIndex1 = 1;
        int startingLength = 3;
        // When
        mal = new MyArrayList<>(startingLength);
        mal.add(expectedIndex0, expectedIntAtIndex0);
        mal.add(expectedIndex1, expectedIntAtIndex1);
        int actualIntAtIndex1 = mal.get(1);
        // Then
        Assert.assertEquals(expectedIntAtIndex1, actualIntAtIndex1);
    }

    @Test
    public void getTest() {
        // Given
        int expectedArrayLength = 1;
        mal = new MyArrayList<>(1);
        // When
        int actualArrayLength = mal.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removeElementWhenArrayLengthIsZeroExceptionTest() throws ArrayIndexOutOfBoundsException {
        // Given
        int startingLength = 0;
        // When
        mal = new MyArrayList<>(startingLength);
        mal.remove(0);
    }

    @Test
    public void removeElementWhenArrayLengthIsOneTest() {
        // Given
        int originalIntAtIndex0 = 0;
        int startingLength = 1;
        Integer expectedIntAtIndex0 = null;
        // When
        mal = new MyArrayList<>(startingLength);
        mal.add(originalIntAtIndex0);
        mal.remove(0);
        Integer actualIntAtIndex0 = mal.get(0);
        // Then
        Assert.assertEquals(expectedIntAtIndex0, actualIntAtIndex0);
    }

    @Test
    public void removeElementWhenItsIndexIsSizeMinusOneTest() {
        // Given
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int originalIntAtIndex2 = 2;
        int startingLength = 0;
        Integer expectedIntAtIndex2 = null;
        // When
        mal = new MyArrayList<>(startingLength);
        mal.add(originalIntAtIndex0);
        mal.add(originalIntAtIndex1);
        mal.add(originalIntAtIndex2);
        mal.remove(2);
        Integer actualIntAtIndex1 = mal.get(2);
        // Then
        Assert.assertEquals(expectedIntAtIndex2, actualIntAtIndex1);
    }

    @Test
    public void removeElementWhenArrayLengthIsThreeTest() {
        // Given
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int originalIntAtIndex2 = 2;
        int startingLength = 1;
        int expectedIntAtIndex1 = originalIntAtIndex2;
        // When
        mal = new MyArrayList<>(startingLength);
        mal.add(originalIntAtIndex0);
        mal.add(originalIntAtIndex1);
        mal.add(originalIntAtIndex2);
        mal.remove(1);
        int actualIntAtIndex1 = mal.get(1);
        // Then
        Assert.assertEquals(expectedIntAtIndex1, actualIntAtIndex1);
    }

    @Test
    public void setTest() {
        // Given
        int expectedArrayLength = 1;
        int expectedInteger = 7;
        mal = new MyArrayList<>(1);
        // When
        mal.set(0, expectedInteger);
        int actualInteger = mal.get(0);
        // Then
        Assert.assertEquals(expectedInteger, actualInteger);
    }

    @Test
    public void clearTest() {
        // Given
        int expectedArrayLength = 0;
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int startingArrayLength = 2;
        mal = new MyArrayList<>(startingArrayLength);
        // When
        mal.add(originalIntAtIndex0);
        mal.add(originalIntAtIndex1);
        mal.clear();
        int actualArrayLength = mal.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    public void isEmptyTest() {
        // Given
        boolean expectedIsEmpty = true;
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int startingArrayLength = 2;
        mal = new MyArrayList<>(startingArrayLength);
        // When
        mal.add(originalIntAtIndex0);
        mal.add(originalIntAtIndex1);
        mal.clear();
        boolean actualIsEmpty = mal.isEmpty();
        // Then
        Assert.assertEquals(expectedIsEmpty, actualIsEmpty);
    }

    @Test
    public void containsTest() {
        // Given
        boolean expectedContains = true;
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int startingArrayLength = 2;
        mal = new MyArrayList<>(startingArrayLength);
        // When
        mal.add(originalIntAtIndex0);
        mal.add(originalIntAtIndex1);
        boolean actualContains = mal.contains(originalIntAtIndex1);
        // Then
        Assert.assertEquals(expectedContains, actualContains);
    }

    @Test
    public void capacityTest() {
        // Given
        int expectedIndex0 = 0;
        int expectedIntAtIndex0 = 0;
        int expectedIndex1 = 1;
        int expectedIntAtIndex1 = 1;
        int expectedLength = 3;
        int expectedSize = 2;
        // When
        mal = new MyArrayList<>(expectedLength);
        mal.add(expectedIndex0, expectedIntAtIndex0);
        mal.add(expectedIndex1, expectedIntAtIndex1);
        int actualLength = mal.capacity();
        // Then
        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void sizeTest() {
        // Given
        int expectedIndex0 = 0;
        int expectedIntAtIndex0 = 0;
        int expectedIndex1 = 1;
        int expectedIntAtIndex1 = 1;
        int expectedLength = 3;
        int expectedSize = 2;
        // When
        mal = new MyArrayList<>(expectedLength);
        mal.add(expectedIndex0, expectedIntAtIndex0);
        mal.add(expectedIndex1, expectedIntAtIndex1);
        int actualSize = mal.size();
        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void ensureCapacityTest() {
        // Given
        int expectedArrayLength = 2;
        int startingArrayLength = 1;
        mal = new MyArrayList<>(startingArrayLength);
        // When
        mal.add(7);
        mal.add(8);
        int actualArrayLength = mal.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

}
