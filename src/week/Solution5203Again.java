package week;

public class Solution5203Again {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int count = 0;
        int[][] matrix = new int[n][n];
        for (int[] d : dig) {
            matrix[d[0]][d[1]] = 1;
        }
        for (int[] art : artifacts) {
            boolean flag = true;
            int r1 = art[0];
            int c1 = art[1];
            int r2 = art[2];
            int c2 = art[3];
            for (int i = r1; i <= r2; i++) {
                for (int j = c1; j <= c2; j++) {
                    if (matrix[i][j] == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
