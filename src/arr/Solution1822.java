package arr;

public class Solution1822 {
    public int arraySign(int[] nums) {
        int temp = 0;
        if (nums[0] > 0) {
            temp = 1;
        } else if (nums[0] < 0) {
            temp = -1;
        } else {
            return temp;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] > 0) {
                temp *= 1;
            } else {
                temp *= -1;
            }
        }
        return temp;
    }
}
