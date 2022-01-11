package exam;

import java.util.Map;
import java.util.TreeMap;

public class Solution253 {
    public int minMeetingRooms(int[][] intervals) {
        // 一定要用TreeMap 保证在遍历取value的时候是保持key从小到大的顺序
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
            res = Math.max(sum, res);
        }
        return res;
    }
}
