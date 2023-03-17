package My_Set_List_etc;

import java.util.*;

public class GenSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("second");
        set.add("3rd");
//        set.add(new Integer(4));
        set.add("second");
        System.out.println(set);
    }
}
