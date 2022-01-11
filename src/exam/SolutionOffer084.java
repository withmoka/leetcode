package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionOffer084 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(res, list, nums, visited);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素已经访问过了，
            // 或者，当前元素和前一个元素相同并且前一个元素还没访问过的话 跳过
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
            list.add(nums[i]);
            visited[i] = true;
            dfs(res, list, nums, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
