package InnerClass;

public class test {
    public static void main(String[] args) {
        //获取成员内部类对象的两种方式:
        //方式一:外部类编写方法,对外提供内部类对象
        //方式二:直接创建
        //格式:外部类名,内部类名 对象名=外部类对象,内部类对象;
        //例子: Outer. Inner oi = new Outer().new Inner();
        Outer.Inner oi = new Outer().new Inner();


        Outer o = new Outer();
        o.getinstance();


        //匿名内部类
       new Swim(){
           @Override
           public void swim() {                                 //1,把前面的class删掉,剩余的内容就变成了一个没有名字的类
               System.out.println("重写方法");                   //这个没有名字的类想要实现Swim接口。
                                                               //把Swim写在了大括号的前面,表示这个没有名字的类实现了
                                                              // Swim接口,所以需要在类中重写接口里面所有的抽象方法。
           }
       };//仅仅创建类，没有调用方法

    }
}
