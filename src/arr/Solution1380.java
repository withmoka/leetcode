package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int[] row : matrix) {
            int min = Arrays.stream(row).min().getAsInt();
            list.add(min);
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            if (list.contains(max)) {
                res.add(max);
            }
        }
        return res;
    }
}
