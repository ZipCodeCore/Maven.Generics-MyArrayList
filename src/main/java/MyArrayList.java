
public class MyArrayList <T> extends MyCollection <T> {

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        this(0);
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int n){
        this.data = (T[]) new Object[n];
    }

}
