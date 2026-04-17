package InnerClass;

public class Outer {
    public String name;
    public int age;
    public Inner getinstance(){
        return new Inner();
    }


    class Inner {
        public String iname;
        public int iage;
    }
}
