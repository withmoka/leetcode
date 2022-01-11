package exam;

public class Solution3_2 {
    public static int helper(int[] time, int[] cost, int S) {
        int n = time.length - 1;//实际作业数量
        int[] tt = new int[n + 10];
        int[] cc = new int[n + 10];
        for (int i = n; i >= 1; i--) {
            tt[i] = tt[i + 1] + time[i];
        }
        for (int i = n; i >= 1; i--) {
            cc[i] = cc[i + 1] + cost[i];
        }
        // 这里还用到后缀和
        int[] dp = new int[n + 10];
        dp[n + 1] = 0;
        for (int i = n; i >= 1; i--) { // i从n取到1，从后往前遍历打包
            dp[i] = -1;
            for (int j = i + 1; j <= n + 1; j++) {
                int temp = dp[j] + cc[i] * (S + tt[i] - tt[j]);
                if (dp[i] == -1) dp[i] = temp;
                else dp[i] = Math.min(dp[i], temp);
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
