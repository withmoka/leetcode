package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int ele : map.keySet()) {
            if (map.get(ele) == 1) {
                res += ele;
            }
        }
        return res;
    }
}
