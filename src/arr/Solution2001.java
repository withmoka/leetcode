package arr;

import java.util.HashMap;
import java.util.Map;

public class Solution2001 {
    public long interchangeableRectangles(int[][] rectangles) {
        long count = 0;
        Map<Double, Integer> map = new HashMap<>();
        for (int[] rectangle : rectangles) {
            double res = 1.0 * rectangle[0] / rectangle[1];
            map.put(res, map.getOrDefault(res, 0) + 1);
        }
        for (Double ele : map.keySet()) {
            count += (long) map.get(ele) * (map.get(ele) - 1) / 2;
        }
        return count;
    }
}
