package fanxing;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        fxmethod.addall(list1,"aaa","ccc");
        fxmethod.addall(list1,"bbb","ddd");
        System.out.println(list1);
    }
}
