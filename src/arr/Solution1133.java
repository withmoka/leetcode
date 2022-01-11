package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution1133 {
    public int largestUniqueNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int res = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                res = Math.max(res, key);
            }
        }
        return res;
    }
}
