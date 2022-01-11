package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // 有相同元素时，需要sort
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        //dfs 一般是先停下，在某个条件时先添加进结果，然后再去做选择
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            // 每个重复元素只有在第一次进loop的时候添加一次
            if (i != start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            helper(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
