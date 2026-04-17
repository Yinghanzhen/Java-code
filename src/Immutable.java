import java.util.ArrayList;
import java.util.List;

public class Immutable {
    public static void main(String[] args) {
        //不可变集合，一旦创建无法修改
        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

        list.add("a");
    }
}
