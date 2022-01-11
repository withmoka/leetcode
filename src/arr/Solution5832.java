package arr;

import java.util.Arrays;

public class Solution5832 {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.sort(nums);
        int left = 0;
        int right = len - 1;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                res[i] = nums[left++];
            } else {
                res[i] = nums[right--];
            }
        }
        return res;
    }
}
