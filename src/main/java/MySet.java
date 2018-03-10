import java.util.Set;

public class MySet<E> extends MyCollections<E> {

   public MySet(){
    super(DEFAULT_SIZE);
   }

   @Override
   public boolean add(E theObject){

      return false;
   }
/*It is reflexive: for any non-null reference value x, x.equals(x) should return true.
It is symmetric: for any non-null reference values x and y, x.equals(y) should
 return true if and only if y.equals(x) returns true.
It is transitive: for any non-null reference values x, y, and z, if x.equals(y)
returns true and y.equals(z) returns true, then x.equals(z) should return true.
It is consistent: for any non-null reference values x and y, multiple invocations of
x.equals(y) consistently return true or consistently return false, provided no
information used in equals comparisons on the objects is modified.*/


   @Override
   public boolean equals(Object theObject) {
      return false;
   }
}
