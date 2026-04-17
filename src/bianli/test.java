package bianli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {

        //迭代器遍历
        Collection<String> coll = new ArrayList();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        coll.add("e");
        Iterator<String> iterator = coll.iterator();//获取迭代器对象
        while (iterator.hasNext()) {//判断当前位置是否有元素
            String str = iterator.next();//获取元素并移动指针到下一个元素
            System.out.println(str);
        }


        //增强for遍历
        Collection<String> coll2 = new ArrayList();
        coll2.add("aaa");
        coll2.add("bbb");
        coll2.add("ccc");
        coll2.add("ddd");
        coll2.add("eee");
        for (String str : coll2) {
            System.out.println(str);
        }
    }
}
