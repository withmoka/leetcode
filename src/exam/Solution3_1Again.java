package exam;

// 为了便于计算数组元素从i=1开始存储
// j从0取到sum，sum为如果由a独立完成任务，所需要花费的总时间
// 一个任务要么给A做，要么给B做，设dp[i][j]表示前i个任务，在a花费时间小于等于j的前提下，b花费的最少时间
// 当j<a[i]时，只能由b完成这项任务；dp[i][j]=dp[i-1][j]+b[i];
// 否则，考虑由a或b完成这项任务,dp[i][j] = Math.min(dp[i - 1][j] + b[i], dp[i - 1][j - a[i]]);

// 最后遍历j
public class Solution3_1Again {
    public static int helper(int[] a, int[] b) {
        int sum = 0;
        for (int ele : a) {
            sum += ele;
        }
        int n = a.length - 1;//实际有n个元素
        int[][] dp = new int[100][100];
        //dp[i][j]表示前i个任务，在机器a花费时间不超过j的前提下，机器b花费的最少时间
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j < a[i]) {
                    //这个任务只能由b完成
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
        int[] a = {0, 2, 5, 7, 10, 5, 2};
        int[] b = {0, 3, 8, 4, 11, 3, 4};
        int res = helper(a, b);
        System.out.println(res);
    }
}
