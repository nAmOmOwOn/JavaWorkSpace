package My_Set_List_etc;

import java.util.*;

public class GenListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("second");
        list.add("3rd");
//        list.add(new Integer(4));
        list.add("second");
        System.out.println(list);
    }
}
