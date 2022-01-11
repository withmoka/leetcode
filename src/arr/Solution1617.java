package arr;

public class Solution1617 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            if (sum <= 0) {
                sum = num;
            } else {
                sum = sum + num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
