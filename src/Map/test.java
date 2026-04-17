package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        /*V put(K key,V value)        添加元素
        V remove(Object key)        根据键制除键值对元素
        void clear()                移除所有的键值对元素
        boolean containsKey(Object key)  判断集合是否包含指定的键
        boolean containsValue(Object value) 判断集合是否包含指定的值
        boolean isEmpty()判断集合是否为空
        int size() 集合的长度, 也就是集合中键值对的个数
*/
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        System.out.println(map);
        map.put("a",5);
        System.out.println(map);
        Integer i = map.put("b",6);
        System.out.println(i);
        //put方法的细节:
        //添加/覆盖
        //在添加数据的时候,如果键不存在,那么直接把鍵值对对象添加到map集合当中,方法返回nu1l
        //在添加数据的时候,如果键是存在的,那么会把原有的键值对对象覆盖,会把被覆盖的值进行返回。
        System.out.println("<----------------------------------------------->");

        //map集合遍历第一种方式
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("<----------------------------------------------->");
        //map集合遍历第二种方式
        Set<String> key = map.keySet();
        for (String string : key) {
            System.out.println(string + "=" + map.get(string));//利用map集合的string找对应的值
        }

    }
}
