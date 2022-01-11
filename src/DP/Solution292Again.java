package DP;

public class Solution292Again {
    public boolean canWinNim(int n) {
        if (n < 4) {
            return true;
        }
        boolean[] dp = new boolean[n + 1];
        dp[1] = dp[2] = dp[3] = true;
        for (int i = 4; i <= n; i++) {
            dp[i] = (!dp[i - 1]) || (dp[i - 1] && !dp[i - 2]) || dp[i - 1] && dp[i - 2] && !dp[i - 3];
        }
        return dp[n];
    }
}
