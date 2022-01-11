package arr;

public class Solution1351 {
    public int countNegatives(int[][] grid) {
        int n = grid[0].length;
        int count = 0;
        for (int[] row : grid) {
            for (int i = 0; i < n; i++) {
                if (row[i] < 0) {
                    count += n - i;
                    break;
                }
            }
        }
        return count;
    }
}
