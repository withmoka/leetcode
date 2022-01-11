package slide;

import java.util.HashMap;
import java.util.Map;

public class Solution3OnePass {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                left = Math.max(map.get(arr[i]), left);
            }
            map.put(arr[i], i + 1);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
