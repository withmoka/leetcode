package arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(cp);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(cp[0], 0);
        for (int i = 1; i < cp.length; i++) {
            if (cp[i] == cp[i - 1]) {
                continue;
            }
            map.put(cp[i], i);
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}
