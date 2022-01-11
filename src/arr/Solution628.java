package arr;

import java.util.Arrays;

public class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int temp1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int temp2 = nums[0] * nums[1] * nums[len - 1];
        return Math.max(temp1, temp2);
    }
}
