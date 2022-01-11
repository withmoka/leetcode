package arr;

import java.util.Arrays;

public class Solution1710 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cur = nums[nums.length / 2];
        int count = 1;
        for (int i = nums.length / 2 + 1; i < nums.length && nums[i] == cur; i++) {
            count++;
        }
        for (int i = nums.length / 2 - 1; i >= 0 && nums[i] == cur; i--) {
            count++;
        }
        if (count > nums.length / 2) {
            return cur;
        }
        return -1;
    }
}
