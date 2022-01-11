package arr;

public class Solution1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int start = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                count++;
            } else {
                if (start != -1 && count < k) {
                    return false;
                }
                count = 0;
                start = i;
            }
        }
        return true;
    }
}
