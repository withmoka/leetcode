package slide;

public class Solution1004 {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int r = 0;
        int l = 0;
        int count = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                count++;
            }
            r++;
            while (count > k) {
                if (nums[l] == 0) {
                    count--;
                }
                l++;
            }
            max = Math.max(max, r - l);
        }
        return max;
    }
}
