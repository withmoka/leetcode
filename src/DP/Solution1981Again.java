package DP;

public class Solution1981Again {
    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        // dp[i][j]表示第i行是否可以取到值为j,i从1开始到m为止。或者-1也不影响
        // 1 <= mat[i][j] <= 70 ，假设每行都取到最大值，不超过70行，所以总和不超过4900。这里取5000
        // 不走 dp[i][j] = dp[i][j]
        // 走 dp[i][j] = dp[i-1][j-val] 当前取到val值。走之前，第i-1行取到[j-当前值]
        boolean[][] dp = new boolean[m + 1][5000];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                int num = mat[i - 1][j]; // 当前值
                for (int k = num; k < 5000; k++) {
                    if (dp[i - 1][k - num]) {
                        dp[i][k] = true; // 更新dp[i][k]第i行可以恰恰取到k？是由dp[i-1][k-num]决定的
                        // num是当前值，一共只能有m*n个当前值，遍历一下就行了
                    }
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int k = 0; k < 5000; k++) {
            if (dp[m][k]) { //  第m行，可以取到的所有值中，去和target做运算
                res = Math.min(res, Math.abs(k - target));
            }
        }
        return res;
    }
}
