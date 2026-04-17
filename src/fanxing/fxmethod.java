package fanxing;

import java.util.ArrayList;

public class fxmethod {
    private fxmethod(){}
    public static <E> void addall(ArrayList<E> list,E e,E f){
        list.add(e);
        list.add(f);
    }
}
