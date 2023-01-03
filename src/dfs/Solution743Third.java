package dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution743Third {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            // 这一步很重要
            Map<Integer, Integer> temp = map.getOrDefault(time[0], new HashMap<Integer, Integer>());
            temp.put(time[1], time[2]);
            map.put(time[0], temp);
        }
        Map<Integer, Integer> distances = new HashMap<>();
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{k, 0});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0];
            int curCost = cur[1];
            if (distances.containsKey(node)) {
                int before = distances.get(node);
                if (curCost < before) {
                    distances.put(node, curCost);
                } else {
                    continue;
                }
            } else {
                distances.put(node, curCost);
            }
            Map<Integer, Integer> temp = map.getOrDefault(node, new HashMap<>());
            // 怎样获得map的键值对
            for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
                int next = entry.getKey();
                int weight = entry.getValue();
                q.offer(new int[]{next, weight + curCost});
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (!distances.containsKey(i)) {
                return -1;
            }
            res = Math.max(res, distances.get(i));
        }
        return res;
    }
}
