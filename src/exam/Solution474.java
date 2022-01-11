package exam;

public class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        // 包包里面最多放m个0和n个1
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int zero = 0;
            int one = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    // 容量足够的话就可以选择放还是不放
                    dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
