package DP;

public class Solution1981Second {
    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        int MAX = 5000;
        boolean[][] dp = new boolean[m][MAX];
        for (int ele : mat[0]) {
            dp[0][ele] = true;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cur = mat[i][j];
                for (int k = cur; k <= MAX; k++) {
                    if (dp[i - 1][k - cur]) {
                        dp[i][k] = true;//考查，第i行能够取到和为k，若想为true则需要i-1行取到k-当前值;如果k比当前值还小，肯定取不到
                    }
                }
            }
        }
        // 第m-1行能够取到的值
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < MAX; j++) {
            if (dp[m - 1][j]) {
                res = Math.min(res, Math.abs(target - j));
            }
        }
        return res;
    }
}
