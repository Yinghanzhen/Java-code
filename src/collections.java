import java.util.ArrayList;
import java.util.Collections;

public class collections {
    public static void main(String[] args) {
        //public static <T> boolean addAll(Collection<T> c, T ... elements)     批量添加元素
       // public static void shuffle(List <? > list)      打乱List集合元素的顺序



        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"123","456","789","abc","def");//利用可变参数批量添加元素
        System.out.println(list);
        Collections.shuffle(list);//批量添加元素
        System.out.println(list);
    }
}
