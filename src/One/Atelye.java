package One;

import java.util.Arrays;

public class Atelye {
    private  Object [] object = {new Futbolka(),new Shtany(),new Plattya(),new Galstuk()};

    public Atelye() {
    }

    public Atelye(Object[] object) {
        this.object = object;
    }

    public Object[] getObject() {
        return object;
    }

    public void setObject(Object[] object) {
        this.object = object;
    }

    public Object CholovichyyVybir(Object x){
        x = new Galstuk();
        return x;
    }
    public Object JinochyyVybir(Object y){
        y= new Plattya();
        return y;
    }

    @Override
    public String toString() {
        return "Atelye{" +
                "object=" + Arrays.toString(object) +
                '}';
    }
}
