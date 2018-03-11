import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMySet {

    private MySet testObject;

    @Before
    public void setup() {
        testObject = new MySet();
    }

    //---------------test MySet constructor
    @Test
    public void testConstructorIntialArrayCapacity() {
        MySet<Integer> testOb = new MySet<>(3);
        Integer[] expected = {null, null, null};
        Integer[] actual = testOb.toArray(new Integer[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testConstructorIntegerArray() {
        Integer[] expected = {50, 60, 70};
        MySet<Integer> testOb = new MySet<>(expected);
        Integer[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testConstructorLongArray() {
        Long[] expected = {50L, 60L, 70L};
        MySet<Long> testOb = new MySet<>(expected);
        Long[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testConstructorStringArray() {
        String[] expected = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(expected);
        String[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testConstructorObjectArray() {
        Object[] expected = {"this", "that", "andTheOtherThing"};
        MySet<Object> testOb = new MySet<>(expected);
        String[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testConstructorIgnoresDups() {
        Object[] input = {"this", "that", "this", "andTheOtherThing", "this", "this"};
        MySet<Object> testOb = new MySet<>(input);
        Object[] expected = {"this", "that", "andTheOtherThing"};
        String[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    //---------------test MySet size()

    /**
     * Returns:
     * the number of elements in this set (its cardinality)
     */
    @Test
    public void testSizeReturnsDefaultElementCount() {
        MySet<Integer> testOb = new MySet<>();
        int expected = 0;
        int actual = testOb.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeReturnsElementCountIfLessThanCapacity() {
        MySet<Integer> testOb = new MySet<>(20);
        testOb.add("this");
        testOb.add("that");
        testOb.add("andTheOtherThing");
        int expected = 3;
        int actual = testOb.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeReturnsElementCountIfMaxCapacity() {
        MySet<Integer> testOb = new MySet<>(5);
        testOb.add("this");
        testOb.add("that");
        testOb.add("andTheOtherThing");
        testOb.add("allTheThings");
        testOb.add("SomeThings");
        int expected = 5;
        int actual = testOb.size();
        Assert.assertEquals(expected, actual);
    }


    //---------------test MySet isEmpty()

    /**
     * isEmpty
     * returns true if this set contains no elements
     */
    @Test
    public void testIsSizeEmptyReturnsFalse() {
        testObject.add("this");
        testObject.add("that");
        testObject.add("andTheOtherThing");
        Boolean actualElements = testObject.isEmpty();
        Assert.assertEquals(false, actualElements);
    }

    @Test
    public void testIsSizeEmptyReturnsTrue() {
        Boolean actualElements = testObject.isEmpty();
        Assert.assertEquals(true, actualElements);
    }

    //---------------test MySet contains()

    /**
     * boolean contains(Object o)
     * Returns true if this set contains the specified element.
     * Returns:
     * true if this set contains the specified element
     * Throws:
     * ClassCastException - if the type of the specified element is incompatible with this set (optional)
     * NullPointerException - if the specified element is null and this set does not permit null elements (optional)
     */
    @Test
    public void testContainsTrue() {
        MySet<Integer> testOb = new MySet<>(20);
        testObject.add("thisThing");
        testObject.add("thatThing");
        testObject.add("theOtherThing");

        Boolean actual = testObject.contains("something");

        Assert.assertEquals(true, actual);

    }

    @Test
    public void testContainsFalse() {
        testObject.add("thisThing");
        testObject.add("thatThing");
        testObject.add("theOtherThing");

        Boolean actual = testObject.contains("SoManyThings");

        Assert.assertEquals(false, actual);

    }

    @Test(expected = NullPointerException.class)
    public void testContainsThrowsExceptionIfNullFound() {
        testObject.add("thisThing");
        testObject.add("thatThing");
        testObject.add("theOtherThing");
        testObject.add("null");
        testObject.add("null");

        Boolean actual = testObject.contains(null);
    }

    //---------------test MySet toArray() Object[] toArray()
    /**
     * Returns an array containing all of the elements in this set
     * the returned array will be "safe" in that no references to it are maintained by this set
     * meaning this method must allocate a new array if if this set is backed by an array
     * user should be free to modify the returned array
     */

    //--------------test Myset toArray() <T> T[] toArray(T[] a)

    //------------test Myset Bool add(E e)

    /**
     * Parameters:
     * e - element to be added to this set
     * Returns:
     * true if this set did not already contain the specified element
     * If this set already contains the element, the call leaves the set
     * unchanged and returns false. In combination with the restriction on constructors, this ensures that sets
     * never contain duplicate elements.
     * NullPointerException - if the specified element is null and this set does not permit null elements
     */
    @Test
    public void testAdd_SetContainsElementAfterAdd_True() {
        String[] input = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(input);
        testOb.add("So many things");
        String[] expected = {"this", "that", "andTheOtherThing", "So many things"};
        String[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd_DoesNotContainElement_True() {
        String[] expected = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(expected);
        Boolean actual = testOb.add("something");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testAdd_AlreadyContainsElement_False() {
        String[] input = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(input);
        Boolean actual = testOb.add("thatThing");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void testAdd_MultipleDuplicates_False() {
        MySet<Integer> testOb = new MySet<>(5);
        testOb.add(10);
        testOb.add(10);
        testOb.add(20);
        testOb.add(10);
        testOb.add(20);
        Integer[] expected = {10, 20, null, null, null};
        Integer[] actual = testOb.toArray(new Integer[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd_AlreadyContainsElement_AddDoesNotAlterSet_True() {
        String[] expected = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(expected);
        testObject.add("that");
        String[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testAdd_Null_Exception() {
        String[] expected = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(10);
        testObject.add(null);
    }


    //------------test Myset Bool remove(Object o)
    /**
     *  Removes the specified element from this set if it is present (optional operation).
     *  o - object to be removed from this set, if present
     Returns:
     true if this set contained the specified element
     NullPointerException - if the specified element is null and this set does not permit null elements (optional)*/

    @Test
    public void testRemove_SetDoesNotContainElementAfterRemove_True() {
        String[] input = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(input);
        testObject.remove("that");
        String[] expected  = {"this","andTheOtherThing", null};
        String[] actual = testOb.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemove_ContainsElementAndRemoves_True() {
        String[] input = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(input);
        Boolean actual = testObject.remove("that");
        Assert.assertEquals(true, actual);

    }

    @Test
    public void testRemove_DoesNotContainElementAndRemoves_False() {
        String[] input = {"this", "that", "andTheOtherThing"};
        MySet<String> testOb = new MySet<>(input);
        Boolean actual = testObject.remove("stuff");
        Assert.assertEquals(false, actual);
    }



    //------------test Myset Bool containsAll(Collection<?> c)
    /**  Returns true if this set contains all of the elements of the specified collection.
     If the specified collection is also a set, this method returns true if it is a subset of this set.
     c - collection to be checked for containment in this set
     Returns:
     true if this set contains all of the elements of the specified collection
     NullPointerException - if the specified collection contains one or more null elements and
     this set does not permit null elements (optional), or if the specified collection is null*/




    //------------test Myset Bool addAll(Collection<? extends E> c)
    /**Adds all of the elements in the specified collection to
     this set if they're not already present (optional operation).
     If the specified collection is also a set, the addAll operation effectively
     modifies this set so that its value is the union of the two sets. The behavior of this
     operation is undefined if the specified collection is modified while the operation is in progress.
     Parameters:
     c - collection containing elements to be added to this set
     Returns:
     true if this set changed as a result of the call
     NullPointerException - if the specified collection contains one or more null elements
     and this set does not permit null elements, or if the specified collection is null*/
    @Test
    public void testAddAll_Union2Sets() {
        Integer[] array1 = {10, 20, 30, 40};
        Integer[] array2 = {50, 60, 70, 80};
        MySet<Integer> testOb = new MySet<>();
        testOb.addAll(array1);
        testOb.addAll(array2);

        Integer[] expected = {10, 20, 30, 40, 50, 60, 70, 80};
        Integer[] actual = testOb.toArray(new Integer[0]);
        Assert.assertArrayEquals(expected, actual);
    }


    //------------test Myset boolean retainAll(Collection<?> c)
    /**Retains only the elements in this set that are contained in the specified collection
     (optional operation). In other words, removes from this set all of its elements that are not
     contained in the specified collection. If the specified collection is also a set, this operation
     effectively modifies this set so that its value is the intersection of the two sets.
     Parameters:
     c - collection containing elements to be retained in this set
     Returns:
     true if this set changed as a result of the call
     NullPointerException - if this set contains a null element and the specified
     collection does not permit null elements (optional), or if the specified collection is null
     */



    //------------test Myset boolean removeAll(Collection<?> c)
    /** Removes from this set all of its elements that are contained in the specified collection (optional operation).
     If the specified collection is also a set, this operation effectively modifies this set so that its value is
     the asymmetric set difference of the two sets.
     Parameters:
     c - collection containing elements to be removed from this set
     Returns:
     true if this set changed as a result of the call
     NullPointerException - if this set contains a null element and the specified collection does not permit null
     elements (optional), or if the specified collection is null
     See Also:
     remove(Object), contains(Object)*/



    //------------test Myset void clear()
    /** Removes all of the elements from this set (optional operation).
     * The set will be empty after this call returns. */

    @Test
    public void testClear_SetEmpty() {
        Integer[] input = {50, 60, 70};
        MySet<Integer> testOb = new MySet<>(input);
        testOb.clear();
        String[] expected  = {null,null,null,null};
        String [] actual = test.toArray(new String[0]);
        Assert.assertArrayEquals(expected, actual);
    }


    //------------test boolean equals(Object o)
    /**Compares the specified object with this set for equality.
     Returns true if the specified object is also a set, the two sets have the same size,
     and every member of the specified set is contained in this set (or equivalently, every member
     of this set is contained in the specified set). This definition ensures that the equals method
     works properly across different implementations of the set interface.
     Overrides:
     equals in class Object
     Parameters:
     o - object to be compared for equality with this set
     Returns:
     true if the specified object is equal to this set
     See Also:
     Object.hashCode(), HashMap*/



    //------------test int hashCode()
    /**Returns the hash code value for this set. The hash code of a set is defined to be the sum of the
     hash codes of the elements in the set, where the hash code of a null element is defined to be zero.
     This ensures that s1.equals(s2) implies that s1.hashCode()==s2.hashCode() for any two sets s1 and s2, as
     required by the general contract of Object.hashCode().
     Overrides:
     hashCode in class Object
     Returns:
     the hash code value for this set
     See Also:
     Object.equals(Object), equals(Object)*/

}





