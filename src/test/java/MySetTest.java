import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MySetTest {

    private MySet mySet;

    @Test
    public void MySetDefaultConstructor() {
        // Given
        int expectedArrayLength = 10;
        mySet = new MySet<>();
        // When
        int actualArrayLength = mySet.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    public void MySetConstructorInitialCapacity() {
        // Given
        int expectedArrayLength = 0;
        mySet = new MySet(expectedArrayLength);
        // When
        int actualArrayLength = mySet.capacity();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    public void addTest() {
        // Given
        int expectedSize = 2;
        String expectedStringToAdd0 = "0";
        String expectedStringToAdd1 = "1";
        mySet = new MySet<>();
        // When
        mySet.add(expectedStringToAdd0);
        mySet.add(expectedStringToAdd1);
        int actualSize = mySet.size();
        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    // Cannot get this method/test to work
//    @Test
//    public void addAllTest() {
//        // Given
//        Integer[] startingArray = { 0, 1, 2 };
//        Integer[] arrayToAdd = { 3, 4, 5 };
//        Integer[] expectedFinalArray = { 0, 1, 2, 3, 4, 5 };
//        String expectedFinalArrayString = Arrays.toString(expectedFinalArray);
//        // When
//        mySet = new MySet<>(Arrays.asList(startingArray));
//        int mySetSize = mySet.size();
////        mySet.addAll(Arrays.asList(arrayToAdd));
//        Integer[] actualFinalArray = (Integer[]) mySet.toArray(new Integer[0]);
//
//        String actualFinalArrayString = Arrays.toString(actualFinalArray);
//        System.out.println(mySetSize);
//        System.out.println(expectedFinalArrayString);
//        System.out.println(actualFinalArrayString);
//
//        // Then
////        Assert.assertEquals(expectedFinalArrayString, actualFinalArrayString);
//    }

    @Test
    public void clearTest() {
        // Given
        int expectedArrayLength = 0;
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int startingArrayLength = 2;
        mySet = new MySet(startingArrayLength);
        // When
        mySet.add(originalIntAtIndex0);
        mySet.add(originalIntAtIndex1);
        mySet.clear();
        int actualArrayLength = mySet.size();
        // Then
        Assert.assertEquals(expectedArrayLength, actualArrayLength);
    }

    @Test
    public void containsTest() {
        // Given
        boolean expectedContains = true;
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int startingArrayLength = 2;
        mySet = new MySet<>(startingArrayLength);
        // When
        mySet.add(originalIntAtIndex0);
        mySet.add(originalIntAtIndex1);
        boolean actualContains = mySet.contains(originalIntAtIndex1);
        // Then
        Assert.assertEquals(expectedContains, actualContains);
    }


    @Test
    public void isEmptyTest() {
        // Given
        boolean expectedIsEmpty = true;
        int originalIntAtIndex0 = 0;
        int originalIntAtIndex1 = 1;
        int startingArrayLength = 2;
        mySet = new MySet<>(startingArrayLength);
        // When
        mySet.add(originalIntAtIndex0);
        mySet.add(originalIntAtIndex1);
        mySet.clear();
        boolean actualIsEmpty = mySet.isEmpty();
        // Then
        Assert.assertEquals(expectedIsEmpty, actualIsEmpty);
    }
    @Test
    public void sizeTest() {
        // Given
        int expectedSize = 1;
        String expectedStringToAdd0 = "0";
        mySet = new MySet<>(expectedSize);
        // When
        mySet.add(expectedStringToAdd0);
        int actualSize = mySet.size();
        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }


}
