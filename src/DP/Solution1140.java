package DP;

public class Solution1140 {
    public int stoneGameII(int[] piles) {
        int N = piles.length;
        int[] sum = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            if (i == N - 1) {
                sum[i] = piles[i];
            } else {
                sum[i] = sum[i + 1] + piles[i];
            }
        }
        int[][] memo = new int[N][N * 2];
        return helper(piles, 0, 1, memo, sum);
    }

    public int helper(int[] piles, int index, int M, int[][] memo, int[] sum) {
        if (index == piles.length) {
            return 0;
        }
        if ((piles.length - index) <= 2 * M) {
            return sum[index];
        }
        if (memo[index][M] != 0) {
            return memo[index][M];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 2 * M; i++) {
            min = Math.min(min, helper(piles, index + i, Math.max(M, i), memo, sum));
        }
        return memo[index][M] = sum[index] - min;
    }
}
