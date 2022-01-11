package graph;

import java.util.HashMap;
import java.util.Map;

class Solution128Fourth {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        DSUWithSize dsu = new DSUWithSize(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            }
            map.put(nums[i], i);
            if (map.containsKey(nums[i] + 1)) {
                dsu.union(i, map.get(nums[i] + 1));
            }
            if (map.containsKey(nums[i] - 1)) {
                dsu.union(i, map.get(nums[i] - 1));
            }
        }
        return dsu.getMaxSize();
    }
}
