package str;

import java.util.HashMap;
import java.util.Map;

public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
