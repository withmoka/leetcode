package arr;

public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i];
            sum += mat[len - 1 - i][i];
        }
        if (len % 2 == 1) {
            sum -= mat[len / 2][len / 2];
        }
        return sum;
    }
}
