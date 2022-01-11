package str;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1436 {
    public String destCity(List<List<String>> paths) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (List<String> list : paths) {
            String start = list.get(0);
            String end = list.get(1);
            set1.add(start);
            set2.add(end);
        }
        for (String str : set2) {
            if (!set1.contains(str)) {
                return str;
            }
        }
        return "";
    }
}
