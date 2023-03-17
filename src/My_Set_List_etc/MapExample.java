package My_Set_List_etc;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {


        Map map = new HashMap();
        map.put("one", "1st");
        map.put("second", new Integer(2));
        map.put("thrid", "3rd");
        map.put("thrid", "III");

        Set set1 = map.keySet();

        Collection collection = map.values();

        Set set2 = map.entrySet();
        System.out.println(set1 + "\n" + collection + "\n" + set2);

    }
}