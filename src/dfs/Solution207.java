package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length <= 1) {
            return true;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] pre : prerequisites) {
            if (map.containsKey(pre[0])) {
                List<Integer> temp = map.get(pre[0]);
                temp.add(pre[1]);
                map.put(pre[0], temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(pre[1]);
                map.put(pre[0], temp);
            }
        }
        // 只考虑错误的情况：一对对取。取完为止。
        // pre[0]去找
        return true;
    }
}
