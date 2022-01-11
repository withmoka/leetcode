package exam;

import java.util.List;

public class Solution120Third {
    public int helper(List<List<Integer>> triangle) {
        int n = triangle.size();//一共有n行n列
        int[] dp = new int[n];//先初始化最下面一行的元素
        for (int col = 0; col < n; col++) {
            dp[col] = triangle.get(n - 1).get(col);
        }
        //从倒数第二行开始，往上走
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                //第i行的元素一共有i个（即i列），从原先对应的2个中选择最小值与当前值合并，更新dp[j]
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}
