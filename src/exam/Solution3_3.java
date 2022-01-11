package exam;

public class Solution3_3 {
    public static int helper(int[] arr) {
        int n = arr.length;
        // 一共有n块石头
        int[] s = new int[n + 1];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + arr[i];
            dp[i][i] = arr[i];
        }
        // dp[l][r]
        // 前缀和s[i]表示前i个元素的总和
        for (int j = 1; j < n; j++) {
            for (int i = j - 1; i >= 0; i--) {
                dp[i][j] = dp[i][i] + dp[i + 1][j];
                for (int cut = i + 1; cut < j; cut++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][cut] + dp[cut + 1][j]);
                }
                dp[i][j] += s[j + 1] - s[i];
            }
        }
        return dp[0][n - 1] - s[n];
    }


    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 9};
        int res = helper(arr);
        System.out.println(res);
    }
}
