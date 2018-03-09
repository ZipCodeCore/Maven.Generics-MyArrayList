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

    public void add(T... ts){
        for (T t:ts) {
            add(t);
        }
    }

    public int getHash(){
        int hash = 0;
        for (T t:this.data) {
            hash += t.hashCode();
        }
        return hash;
    }

}
