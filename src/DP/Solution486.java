package DP;

public class Solution486 {
    public boolean PredictTheWinner(int[] nums) {
        Integer[][] memo = new Integer[nums.length][nums.length];
        return dfs(nums, 0, nums.length - 1, memo) >= 0;
    }

    public int dfs(int[] nums, int i, int j, Integer[][] memo) {
        if (i > j) {
            return 0;
        }
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        memo[i][j] = Math.max(nums[i] - dfs(nums, i + 1, j, memo), nums[j] - dfs(nums, i, j - 1, memo));
        return memo[i][j];
    }
}
