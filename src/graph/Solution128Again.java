package graph;

import java.util.HashMap;
import java.util.Map;

public class Solution128Again {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        DSUBySize dsu = new DSUBySize(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            }
            map.put(nums[i], i);
            if (map.containsKey(nums[i] + 1)) {
                dsu.union(map.get(nums[i] + 1), i);
            }
            if (map.containsKey(nums[i] - 1)) {
                dsu.union(map.get(nums[i] - 1), i);
            }
        }
        return dsu.getMax();
    }
}
