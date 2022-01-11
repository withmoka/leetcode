package slide;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1100 {
    public int numKLenSubstrNoRepeats(String s, int k) {
        char[] arr = s.toCharArray();
        if (k > arr.length) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        if (map.size() == k) {
            count++;
        }
        if (k == arr.length) {
            return count;
        }
        int left = 0;
        for (int i = k; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            map.put(arr[left], map.get(arr[left]) - 1);
            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
            if (map.size() == k) {
                count++;
            }
            left++;
        }
        return count;
    }
}
