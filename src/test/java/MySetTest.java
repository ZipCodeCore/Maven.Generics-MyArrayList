import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    private MySet mySet;

    @Test
    public void MySetDefaultConstructor() {

    }

    @Test
    public void MySetConstructorCollectionWildcardExtendsE() {

    }

    @Test
    public void MySetConstructorInitialCapacity() {

    }

    @Test
    public void addTest() {
        // Given
        int expectedSize = 1;
        String expectedStringToAdd0 = "0";
        String expectedStringToAdd1 = "0";
        mySet = new MySet<>();
        // When
        mySet.add(expectedStringToAdd0);
        mySet.add(expectedStringToAdd1);
        // Then
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
