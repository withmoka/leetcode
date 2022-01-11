package dfs;

import java.util.ArrayList;
import java.util.List;

public class Solution46Again {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            helper(res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
