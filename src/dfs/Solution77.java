package dfs;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), n, k, 1);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> temp, int n, int k, int index) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = index; i <= n; i++) {
                temp.add(i);
                helper(res, temp, n, k, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
