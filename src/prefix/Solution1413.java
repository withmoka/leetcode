package prefix;

public class Solution1413 {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
            min = Math.min(min, pre[i]);
        }
        if (min >= 1) {
            return 1;
        }
        return (1 - min);
    }
}
