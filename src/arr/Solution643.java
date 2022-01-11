package arr;

public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < len; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum * 1.0 / k;
    }
}
