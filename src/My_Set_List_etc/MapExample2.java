package My_Set_List_etc;

import java.util.*;
import java.util.Map.Entry;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("one","1st");

//        map.put("second", new Integer(2));
        map.put("third", "3rd");
        map.put("third", "III");

        Set<String> set1 = map.keySet();

        Collection<String> collection = map.values();

        Set<Entry<String, String>> set2 = map.entrySet();
        System.out.println(set1 + "\n" + collection + "\n" + set2);
    }
}
