package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Map<Integer, Integer> map = new HashMap();
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }
        int len = Integer.MAX_VALUE;
        for (int target : map.keySet()) {
            if (map.get(target) == max) {
                int start = list.indexOf(target);
                int end = list.lastIndexOf(target);
                len = Math.min(len, end - start + 1);
            }
        }
        return len;
    }
}
