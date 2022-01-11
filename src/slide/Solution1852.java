package slide;

import java.util.HashMap;
import java.util.Map;

public class Solution1852 {
    public int[] distinctNumbers(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        res[0] = map.size();
        if (k == nums.length) {
            return res;
        }
        int left = 0;
        for (int i = k; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            map.put(nums[left], map.get(nums[left]) - 1);
            if (map.get(nums[left]) == 0) {
                map.remove(nums[left]);
            }
            left++;
            res[left] = map.size();
        }
        return res;
    }
}
