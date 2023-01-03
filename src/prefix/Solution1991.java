package prefix;

public class Solution1991 {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            int right = sum - left + nums[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
