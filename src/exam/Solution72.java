package exam;

public class Solution72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        // dp[i][j]表示word1的前i个字母转换成word2的前j个字母所使用的最少操作。
        // 目标dp[m][n]
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;//word1中的前3个字母转换成word2中的前0个字母所需要的操作数为3，删除
        }
        for (int j = 0; j < n + 1; j++) {
            dp[0][j] = j;//word1中的前0个字母转换成word2中的前3个字母所需要的操作数为3，插入
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[m][n];
    }
}
