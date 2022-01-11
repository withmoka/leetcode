package slide;

import java.util.HashMap;
import java.util.Map;

public class Solution1876 {
    public int countGoodSubstrings(String s) {
        int res = 0;
        int len = s.length();
        if (len < 3) {
            return res;
        }
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        if (map.size() == 3) {
            res++;
        }
        if (len == 3) {
            return res;
        }
        int left = 0;
        for (int i = 3; i < len; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.put(arr[left], map.get(arr[left]) - 1);
            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
            left++;
            if (map.size() == 3) {
                res++;
            }
        }
        return res;
    }
}
