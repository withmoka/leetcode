package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int num : map.keySet()) {
            count += helper(map.get(num));
        }
        return count;
    }

    public int helper(int ele) {
        return ele * (ele - 1) / 2;
    }
}
