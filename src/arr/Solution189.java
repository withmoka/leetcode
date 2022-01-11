package arr;

import java.util.Arrays;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        while (k >= len) {
            k = k % len;
        }
        for (int i = 0; i < len - k; i++) {
            res[i + k] = nums[i];
        }
        for (int i = len - k; i < len; i++) {
            res[i - len + k] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, len);
    }
}
