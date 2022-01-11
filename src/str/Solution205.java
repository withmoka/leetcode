package str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], arr2[i]);
                if (set.contains(arr2[i])) {
                    return false;
                }
                set.add(arr2[i]);
            } else if (map.get(arr1[i]) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
