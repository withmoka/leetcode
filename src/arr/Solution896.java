package arr;

public class Solution896 {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i + 1] < nums[i])) {
                inc = false;
            } else if (nums[i + 1] > nums[i]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
