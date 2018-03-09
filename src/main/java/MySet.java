import java.util.Arrays;

public class MySet<E> {
    private E[] set;
    private E value;

    //Constructors
    public MySet() {
        set = (E[]) new Object[0];
    }

    public MySet(int setSize){
        set = (E[]) new Object[setSize];
    }

    //Methods
    public void add(E thing) {

        E[] newSet = Arrays.copyOf(set, set.length + 1);
        newSet[newSet.length-1] = thing;
        set = newSet;
    }


    public E get(Integer i){
        this.value = this.set[i];
        return this.value;
    }

    public void remove(E thing) {
        if ( set.length > 0){
            E[] newSet = Arrays.copyOf(set, set.length - 1);
            for (int i = 0, j = 0; i < set.length; i++) {
                if (set[i] != thing) {
                    newSet[j] = set[i];
                    j++;
                }
            }
            set = newSet;
        }
    }
    public void set(Integer i, E thing){
        this.value = this.set[i];
        set[i] = thing;

    }

    public void clear(){
        this.set = (E[]) new Object[0];
    }

    public boolean isEmpty(){
        if (set.length == 0)
            return true;
        else return false;
    }

    public boolean contains(E valueToCheck){
        for (int i = 0; i < set.length; i++){
            if (set[i] == valueToCheck){
                return true;
            }
        }
        return false;
    }

}

















