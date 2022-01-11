package exam;

import java.util.Map;
import java.util.TreeMap;

public class Solution253Again {
    public int helper(int[][] intervals) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);
        }
        int res = 0;
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
            res = Math.max(res, sum);
        }
        return res;
    }
}
