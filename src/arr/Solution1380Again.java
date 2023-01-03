package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution1380Again {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        for (int[] row : matrix) {
            int min = Integer.MAX_VALUE;
            for (int ele : row) {
                if (ele < min) {
                    min = ele;
                }
            }
            rows.add(min);
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            if (rows.contains(max)) {
                res.add(max);
            }
        }
        return res;
    }
}
