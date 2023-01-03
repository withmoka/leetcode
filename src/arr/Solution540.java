package arr;

public class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i + 1] != nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}
