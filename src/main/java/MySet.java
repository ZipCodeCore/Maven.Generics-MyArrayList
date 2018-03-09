public class MySet <T> extends MyCollection <T>{

    @SuppressWarnings("unchecked")
    public MySet(){
        this.data = (T[]) new Object[0];
    }

    @Override
    public void add(T t){
        if (!this.contains(t)) {
            super.add(t);
        }
    }

}
