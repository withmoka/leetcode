package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int ele : map.values()) {
            if (set.contains(ele)) {
                return false;
            } else {
                set.add(ele);
            }
        }
        return true;
    }
}
