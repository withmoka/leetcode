package exam;

import java.util.Arrays;

public class Solution3_2Again {
    public static int helper(int[] time, int[] cost, int S) {
        //先计算后缀和，tt[i]表示完成第i项及之后的任务所需要的时间，cc[i]表示完成第i项及之后所需要的花费
        int n = time.length - 1;//实际的作业数量
        int[] tt = new int[n + 10];
        int[] cc = new int[n + 10];
        for (int i = n; i >= 1; i--) {
            tt[i] = tt[i + 1] + time[i];
            cc[i] = cc[i + 1] + cost[i];
        }
        int[] dp = new int[n + 10];//dp[i]表示目前在处理i项任务，当前所要花费的最小时间
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n + 1] = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = i + 1; j <= n + 1; j++) {
                int tmp = dp[j] + (S + tt[i] - tt[j]) * cc[i];
                dp[i] = Math.min(dp[i], tmp);
            }
        }
        return dp[1];
    }

    public static void main(String[] args) {
        int[] time = {0, 1, 3, 4, 2, 1};
        int[] cost = {0, 3, 2, 3, 3, 4};
        int S = 1;
        int res = helper(time, cost, S);
        System.out.println(res);
    }
}
