package arr;

public class Solution1752 {
    public boolean check(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        if (count == 0) {
            return true;
        }
        return nums[len - 1] <= nums[0];
    }
}
