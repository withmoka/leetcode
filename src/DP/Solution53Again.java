package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution53Again {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            list.add(sum);
        }
        return Collections.max(list);
    }
}
