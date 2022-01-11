package prefix;

public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len + 1];
        int[] suffix = new int[len + 1];
        pre[0] = 1;
        for (int i = 1; i < len + 1; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        suffix[0] = 1;
        for (int i = 1; i < len + 1; i++) {
            suffix[i] = suffix[i - 1] * nums[len - i];
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = pre[i] * suffix[len - i - 1];
        }
        return res;
    }
}
