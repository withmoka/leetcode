package slide;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int res = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            while (set.contains(arr[i])) {
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[i]);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
