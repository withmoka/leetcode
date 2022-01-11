package prefix;

public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
        int[] preSum = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (preSum[i] - preSum[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
