package water;

import java.util.*;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] sortedNum = Arrays.copyOf(nums, len);
        Arrays.sort(sortedNum);
        Map<Integer, Integer> map = helper(sortedNum);
        for (int i = 0; i < len; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }

    public Map<Integer, Integer> helper(int[] sortedNum) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = sortedNum.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(sortedNum[i])) {
                continue;
            }
            int j = i;
            while (j >= 0 && sortedNum[j] == sortedNum[i]) {
                j--;
            }
            if (j < 0) {
                map.put(sortedNum[i], 0);
            } else {
                map.put(sortedNum[i], j + 1);
            }
        }
        return map;
    }
}
