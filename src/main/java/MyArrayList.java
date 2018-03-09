
public class MyArrayList <T> extends MyCollection {

    @SuppressWarnings("unchecked")
    public MyArrayList(){
        this.data = (T[]) new Object[0];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int n){
        this.data = (T[]) new Object[n];
    }

}
