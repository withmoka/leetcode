package exam;

public class Solution3_1 {
    public static int helper(int[] a, int[] b) {
        int sum = 0;
        for (int ele : a) {
            sum += ele;
        }
        int n = a.length - 1;//实际有多少个元素，数组实际元素从1开始算起
        int[][] dp = new int[100][100];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j < a[i]) {
                    dp[i][j] = dp[i - 1][j] + b[i];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + b[i], dp[i - 1][j - a[i]]);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int j = 0; j <= sum; j++) {
            res = Math.min(res, Math.max(j, dp[n][j]));
        }
        return res;
    }

    public static void main(String[] args) {
        // 为了便于计算，实际下标从1开始
        int[] arr_a = {0, 2, 5, 7, 10, 5, 2};
        int[] arr_b = {0, 3, 8, 4, 11, 3, 4};
        int res = helper(arr_a, arr_b);
        System.out.println(res);
    }
}
