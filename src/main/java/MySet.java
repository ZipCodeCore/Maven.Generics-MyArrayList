public class MySet <T> extends MyCollection{

    @SuppressWarnings("unchecked")
    public MySet(){
        this.data = (T[]) new Object[0];
    }

    public boolean setAdd(T t){
        if (!this.contains(t)) {
            super.add(t);
            return true;
        }
        return false;
    }

}
