package listmethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(1,"e");//在指定位置添加元素
        System.out.println(list);
        String s = list.remove(1);//删除指定位置的元素并返回
        System.out.println(list);

     }
}
