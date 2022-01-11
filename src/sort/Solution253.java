package sort;

import java.util.*;

public class Solution253 {
    public int minMeetingRooms(int[][] intervals) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals) {
            int startTime = interval[0];
            int endTime = interval[1];
            map.merge(startTime, 1, Integer::sum);
            map.merge(endTime, -1, Integer::sum);
        }
        int sum = 0, minRooms = 0;
        for (Integer value : map.values()) {
            sum += value;
            minRooms = Math.max(minRooms, sum);
        }
        return minRooms;
    }
}
