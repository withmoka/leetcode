package hard;


import java.util.Arrays;

public class Solution1658 {
    public int minOperations(int[] nums, int x) {
        int s = Arrays.stream(nums).sum();
        if (s < x) {
            return -1;
        }
        if (s == x) {
            return nums.length;
        }
        int ans = nums.length + 1;
        int right = 0;
        int sumL = 0;
        int sumR = s;

        for (int left = -1; left < nums.length; left++) {
            if (left != -1) {
                sumL += nums[left];
            }
            while (right < nums.length && (sumL + sumR) > x) {
                sumR -= nums[right];
                right++;
            }
            if ((sumL + sumR) == x) {
                ans = Math.min(ans, left + 1 + nums.length - right);
            }
        }
        if (ans > nums.length) {
            return -1;
        }
        return ans;
    }
}
