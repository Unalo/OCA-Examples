package list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("100");
        list.add("200");
        list.add("100");
        list.remove("100");
        System.out.println(list);
    }
}
