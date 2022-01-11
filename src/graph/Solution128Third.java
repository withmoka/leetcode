package graph;

import java.util.HashMap;
import java.util.Map;

class Solution128Third {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        DSU128 dsu = new DSU128(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (map.containsKey(cur)) {
                continue;
            }
            map.put(cur, i);
            if (map.containsKey(cur + 1)) {
                dsu.union(i, map.get(cur + 1));
            }
            if (map.containsKey(cur - 1)) {
                dsu.union(i, map.get(cur - 1));
            }
        }
        return dsu.getMax();
    }
}
