package slide;

import java.util.HashMap;
import java.util.Map;

public class Solution159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        char[] arr = s.toCharArray();
        int res = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            while (map.size() > 2) {
                char ch = arr[left];
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
