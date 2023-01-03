package prefix;

import java.util.HashMap;
import java.util.Map;

public class Solution974 {
    public int subarraysDivByK(int[] nums, int k) {
        int[] pre = new int[nums.length + 1];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < pre.length; i++) {
            if (pre[i] < 0) {
                pre[i] = (k - (-pre[i]) % k) % k;
            } else {
                pre[i] = pre[i] % k;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < pre.length; i++) {
            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
        }
        int count = 0;
        for (int key : map.keySet()) {
            int value = map.get(key);
            count += (1 + value - 1) * (value - 1) / 2;
            if (key == 0) {
                count += value;
            }
        }
        return count;
    }
}
