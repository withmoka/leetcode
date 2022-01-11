package prefix;

public class Solution1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int r = Math.max(0, i - k); r <= Math.min(i + k, m - 1); r++) {
                    for (int c = Math.max(0, j - k); c <= Math.min(j + k, n - 1); c++) {
                        sum += mat[r][c];
                    }
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}
