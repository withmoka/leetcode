package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3_3Again {
    public static int helper(int[] arr) {
        int n = arr.length;
        int[] s = new int[n + 1];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + arr[i];
            dp[i][i] = arr[i];
        }
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
