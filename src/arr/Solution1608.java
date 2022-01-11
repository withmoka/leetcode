package arr;

public class Solution1608 {
    public int specialArray(int[] nums) {
        int len = nums.length;
        for (int i = len; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                int number = nums[j];
                if (number >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }
}
