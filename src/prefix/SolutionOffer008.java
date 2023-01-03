package prefix;

// etl写法

public class SolutionOffer008 {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
            for (int j = i - 1; j >= 0; j--) {
                if ((pre[i] - pre[j]) >= target) {
                    int len = i - j;
                    res = Math.min(res, len);
                    break;
                }
            }
        }
        if (pre[n] < target) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 11;
        int res = minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
