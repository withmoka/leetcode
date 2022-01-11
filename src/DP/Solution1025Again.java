package DP;

public class Solution1025Again {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[Math.max(n + 1, 2)];
        dp[1] = false;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i ; j++) {
                dp[i] = i % j == 0 && !dp[i - j];
                if (dp[i]) {
                    break;
                }
            }
        }
        return dp[n];
    }
}
