package Set集合;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {

        //哈希值:对象的整数表现形式
        //1. 如果没有重写hashCode方法,不同对象计算出的哈希值是不同的
        //2.如果已经重写hashcode方法,不同的对象只要属性值相同,计算出的哈希值就是一样的
        //3. 但是在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰掩)
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",25);
        Student s3 = new Student("wangwu",22);
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());


        HashSet<Student> has = new HashSet<>();
        System.out.println(has.add(s1));
        System.out.println(has.add(s2));
        System.out.println(has.add(s3));
        System.out.println(has);


        LinkedHashSet<Student> ls = new LinkedHashSet<>();
        System.out.println(ls.add(s1));
        System.out.println(ls.add(s2));
        System.out.println(ls.add(s3));
        System.out.println(has);


        TreeSet<Integer> ts = new TreeSet<>();//自动排序，内部数据结构为红黑树
        ts.add(9);
        ts.add(7);
        ts.add(5);
        ts.add(12);
        ts.add(8);
        System.out.println(ts);

        for (Integer t : ts) {
            System.out.println(t);
        }

        TreeSet<Student> ts1 = new TreeSet<>();//默认排序法
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        System.out.println(ts1);
    }
}
