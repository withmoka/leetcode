package prefix;

public class Solution1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[][] sums = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                sums[i][j] = sums[i][j - 1] + sums[i - 1][j] - sums[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
        for (int row1 = 0; row1 < m; row1++) {
            for (int row2 = row1; row2 < m; row2++) {
                for (int col1 = 0; col1 < n; col1++) {
                    for (int col2 = col1; col2 < n; col2++) {
                        int res = sums[row2 + 1][col2 + 1] - sums[row2 + 1][col1] - sums[row1][col2 + 1] + sums[row1][col1];
                        if (res == target) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
