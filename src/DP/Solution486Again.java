package DP;

public class Solution486Again {
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        // gain表示对于一个左边界为0，又边界为len-1的nums数组，先手一方的净胜分
        int gain = dfs(nums, dp, 0, len - 1);
        return gain >= 0;
    }

    public int dfs(int[] nums, int[][] dp, int i, int j) {
        if (i > j) {
            return 0;
        } else if (i == j) {
            return nums[i];
        }
        //dp[i][j]表示左边界为i，右边界为j的数组，先手的胜率，要往回靠，一直靠到i
        //1、i==j，此时分别代入
        //2、继续靠，发现i>j，说明先手已经没有石子可以选择，返回0
        //3、返回，i==j时，其实就是取到nums[i]，因为先手只能取走这一个石子
        dp[i][j] = Math.max(nums[i] - dfs(nums, dp, i + 1, j), nums[j] - dfs(nums, dp, i, j - 1));
        return dp[i][j];
    }
}
