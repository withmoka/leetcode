package prefix;

public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                res[i] = nums[i];
            } else {
                res[i] = res[i - 1] + nums[i];
            }
        }
        return res;
    }
}
