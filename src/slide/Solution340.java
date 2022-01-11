package slide;

import java.util.HashMap;
import java.util.Map;

public class Solution340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int left = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            while (map.size() > k) {
                char ch = arr[left];
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
                left++;
            }
            res = Math.max(i - left + 1, res);
        }
        return res;
    }
}
