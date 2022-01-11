package DP;

import java.util.ArrayList;
import java.util.List;

public class Solution1981 {
    public static int minimizeTheDifference(int[][] mat, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(mat, 0, mat[0].length, new ArrayList<>(), res);
        int sub = Integer.MAX_VALUE;
        for (List<Integer> list : res) {
            sub = Math.min(sub, Math.abs(getSum(list) - target));
        }
        return sub;
    }

    public static void dfs(int[][] mat, int row, int n, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == mat.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int col = 0; col < n; col++) {
            temp.add(mat[row][col]);
            dfs(mat, row + 1, n, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public static int getSum(List<Integer> temp) {
        int sum = 0;
        for (int ele : temp) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 13;
        int res = minimizeTheDifference(mat, target);
        System.out.println(res);
    }
}
