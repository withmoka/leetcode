package prefix;

public class Solution525Again {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int[] pre = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
        int res = 0;
        for (int i = 0; i < pre.length; i++) {
            for (int j = 0; j < pre.length; j++) {
                if (pre[i] == pre[j]) {
                    res = Math.max(res, Math.abs(j - i) + 1);
                }
            }
        }
        return res;
    }
}
