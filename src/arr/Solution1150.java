package arr;

public class Solution1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        int len = nums.length;
        int num = nums[len / 2];
        if (num != target) {
            return false;
        }
        int count = 1;
        for (int i = len / 2 + 1; i < len && nums[i] == num; i++) {
            count++;
        }
        for (int i = len / 2 - 1; i >= 0 && nums[i] == num; i--) {
            count++;
        }
        return count > len / 2;
    }
}
