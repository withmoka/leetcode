package slide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1839 {
    public int longestBeautifulSubstring(String word) {
        int res = 0;
        char[] arr = word.toCharArray();
        List<Character> window = new ArrayList<>();
        Set<Character> map = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if ((window.size() == 0 && arr[i] == 'a') || (window.size() != 0 && arr[i] >= window.get(window.size() - 1))) {
                window.add(arr[i]);
                map.add(arr[i]);
                if (map.size() == 5) {
                    res = Math.max(res, window.size());
                }
            } else {
                window.clear();
                map.clear();
                window.add(arr[i]);
                map.add(arr[i]);
            }
        }
        return res;
    }
}
