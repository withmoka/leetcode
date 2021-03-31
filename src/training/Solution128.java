package training;

import java.util.HashMap;
import java.util.Map;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        int N = nums.length;
        DSUBySize dsu = new DSUBySize(N);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
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
        return dsu.getMax();
    }
}
