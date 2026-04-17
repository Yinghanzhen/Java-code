package fanxing;

import java.util.ArrayList;

public class tongpeifu {
    public static void main(String[] args) {
        ArrayList<ye> list1 = new ArrayList<>();
        ArrayList<fu> list2 = new ArrayList<>();
        ArrayList<zi> list3 = new ArrayList<>();
        //泛型里面是什么类型，也只能传递什么类型的数据，但可以通过通配符来限制  ? extends E 表示可以传递E的子类 ? super E 表示可以传递E的父类
        method(list1);
        method(list2);
        method(list3);

      //应用场景:
        //1.如果我们在定义类、方法、接口的时候,如果类型不确定,就可以定义泛型类、泛型方法、泛型按口。
        //2.如果类型不确定,但是能知道以后只能传递某个继承体系中的,就可以泛型的通配符
        //泛型的通配符:
        //关键点:可以限定类型的范围


    }
    public static void method(ArrayList<? extends ye> list){

    }
}



class ye{}
class fu extends ye{}
class zi extends fu{}