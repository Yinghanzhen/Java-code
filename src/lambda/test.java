package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Integer[] a = {1,5,2,0,1,8,4,6,100,100,60,60,500,9,320};
       Arrays.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });


        Arrays.sort(a,(Integer o1, Integer o2)->{
            return o1-o2;
        });
        System.out.println(Arrays.toString(a));
       /* Lambda表达式的注意点:
        1.Lambda表达式可以用来简化匿名内部类的书写
        2.Lambda表达式只能简化函数式接口的匿名内部类的写法
        3.函数式按口:
        有且仅有一个抽象方法的接口叫做函数式接口,接口上方可以加@FunctionalInterface注解*/



        //举例
        method(()->{
            System.out.println("swimming~~~");
                }
                );
    }
    public static void method(swim s) {
        s.swimming();
    }
}

interface swim{
    public void swimming();
}