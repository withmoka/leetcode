package arr;

public class Solution1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for (int i = 0; i < n; i++) {
                arr[row][i]++;
            }
            for (int i = 0; i < m; i++) {
                arr[i][col]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
