package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionOffer84Again {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        // 开头一定是老三样 res,temp,sort,如果是需要记录有没有访问过，再加一个visited
        // 开始dfs
        dfs(res, tmp, nums, visited);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> tmp, int[] nums, boolean[] visited) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
            tmp.add(nums[i]);
            visited[i] = true;
            dfs(res, tmp, nums, visited);
            tmp.remove(tmp.size() - 1);
            visited[i] = false;
        }
    }
}
