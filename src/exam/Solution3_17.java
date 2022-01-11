package exam;

public class Solution3_17 {
    public static int helper(String a, String b, int k) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][0] = k * i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = k * j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + k, dp[i][j - 1] + k), dp[i - 1][j - 1] + Math.abs(a.charAt(i - 1) - b.charAt(j - 1)));
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String a = "cmc";
        String b = "snmn";
        int k = 2;
        int res = helper(a, b, k);
        System.out.println(res);
    }
}
