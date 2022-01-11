package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution5804 {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int target = map.get(arr[0]);
        for (char ch : map.keySet()) {
            if (map.get(ch) != target) {
                return false;
            }
        }
        return true;
    }
}
