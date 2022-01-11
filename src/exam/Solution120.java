package exam;

import java.util.List;

public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        // 一共有n行
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            // 最后一行，取遍该行元素
            dp[i] = triangle.get(n - 1).get(i);
        }
        // 倒数第二行时，i=n-2；
        // 遍历完倒数第二行的所有元素，更新dp，dp的长度会缩小，变成0到i（包含）的长度
        // dp[j] = 刚才下面的和下面右边的，取其中一个 Math.min(dp[j],dp[j+1]),再加上当前值
        // 矩阵的[i][j]
        // 最后return dp[0]
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
