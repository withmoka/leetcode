package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("nihao",0);
        map.put("zaijian",1);
        map.put("chifanlema",2);
        System.out.println(map);
        map.computeIfAbsent("chibuchiwanfan",x->3);
//        System.out.println(num);
        System.out.println(map);
        System.out.println(map.computeIfAbsent("wanan",key->4));
    }
}
