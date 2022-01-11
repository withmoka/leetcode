package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> temp = new ArrayList<>();
        for (int[] row : grid) {
            for (int ele : row) {
                temp.add(ele);
            }
        }
        for (int i = 0; i < k; i++) {
            int last = temp.get(m * n - 1);
            temp.add(0, last);
            temp.remove(m * n);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(temp.get(i * n + j));
            }
            res.add(list);
        }
        return res;
    }
}
