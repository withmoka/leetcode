package sort;

import java.util.Map;
import java.util.TreeMap;

public class Solution253Again {
    public int minMeetingRooms(int[][] intervals) {
        int res = 0;
        int temp = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);
        }
        for (int value : map.values()) {
            temp = temp + value;
            res = Math.max(res, temp);
        }
        return res;
    }
}
