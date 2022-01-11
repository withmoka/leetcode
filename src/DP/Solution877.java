package DP;

public class Solution877 {
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        Integer[][] memo = new Integer[len][len];
        int gain = dfs(piles, memo, 0, len - 1);
        return gain > 0;
    }

    public int dfs(int[] piles, Integer[][] memo, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        memo[i][j] = Math.max(piles[i] - dfs(piles, memo, i + 1, j), piles[j] - dfs(piles, memo, i, j - 1));
        return memo[i][j];
    }
}
