package slide;

public class Solution487 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        int res = 0;
        while (right < nums.length) {
            while (right < nums.length && count <= 1) {
                if (nums[right] == 0) {
                    count++;
                }
                right++;
                if (count <= 1) {
                    res = Math.max(res, right - left);
                }
            }
            while (count > 1) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }
        }
        return res;
    }
}
