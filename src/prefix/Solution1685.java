package prefix;

public class Solution1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        int[] left = new int[len + 1];
        int[] right = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < len + 1; i++) {
            right[i] = right[i - 1] + nums[len - i];
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = nums[i] * i - left[i] + right[len - i] - nums[i] * (len - i);
        }
        return res;
    }
}
