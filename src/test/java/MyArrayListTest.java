import org.junit.Test;
import org.junit.Assert;

public class MyArrayListTest {

    private MyArrayList<Integer> mal;

    @Test
    public void MyArrayListConstructorLengthTest() {
        // Given
        int expectedArrayLength = 1;
        mal = new MyArrayList<>(expectedArrayLength);
        // When
        int actualArrayLength = mal.length();
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
        System.out.println(mal.length());
//        int actualIntAtIndex1 = mal.get(1);
        // Then
//        Assert.assertEquals(expectedIntAtIndex1, actualIntAtIndex1);
    }

    @Test
    public void getTest() {
        // Given
        int expectedArrayLength = 1;
        mal = new MyArrayList<>(1);
        // When
        int actualArrayLength = mal.length();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

//    @Test
//    public void removeTest() {
//        // Given
//        int expectedIntAtIndex0 = 0;
//        int expectedIntAtIndex1 = 1;
//        int startingLength = 1;
//        // When
//        mal = new MyArrayList<>(startingLength);
//        mal.add(expectedIntAtIndex0);
//        mal.add(expectedIntAtIndex1);
//        int actualIntAtIndex1 = mal.get(1);
//        // Then
//        Assert.assertEquals(expectedIntAtIndex1, actualIntAtIndex1);
//    }

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
    public void ensureCapacityTest() {
        // Given
        int expectedArrayLength = 2;
        int startingArrayLength = 1;
        mal = new MyArrayList<>(startingArrayLength);
        // When
        mal.add(7);
        mal.add(8);
        int actualArrayLength = mal.length();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

}
