package arr;

//nums中的整数互不相同，所以一定会在子序列中的第一个数的位置就产生差异，就能找到最大的
public class Solution1708 {
    public int[] largestSubarray(int[] nums, int k) {
        int[] res = new int[k];
        int cur = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (nums[i] > cur) {
                index = i;
                cur = nums[i];
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = nums[i + index];
        }
        return res;
    }
}
