package arr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            Set<Integer> set = map.getOrDefault(log[0], new HashSet<>());
            set.add(log[1]);
            map.put(log[0], set);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int key : map.keySet()) {
            int time = map.get(key).size();
            map2.put(time, map2.getOrDefault(time, 0) + 1);
        }
        int[] res = new int[k];
        for (int time : map2.keySet()) {
            res[time - 1] = map2.get(time);
        }
        return res;
    }
}
