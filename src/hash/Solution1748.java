package hash;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count == 1) {
                res = res + num;
            }
        }
        return res;
    }
}
