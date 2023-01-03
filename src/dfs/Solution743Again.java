package dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution743Again {
    public int networkDelayTime(int[][] times, int n, int k) {
        // 用map，已知起点，可以立刻得到下一个点和耗时
        // 因为有两个map，起点和next的组合是唯一的，所以不会有重复
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            Map<Integer, Integer> temp = map.getOrDefault(time[0], new HashMap<Integer, Integer>());
            temp.put(time[1], time[2]);
            map.put(time[0], temp);
        }
        Map<Integer, Integer> distance = new HashMap<>();
        // 链表做队列
        Queue<int[]> q = new LinkedList<>();
        // k是起点,到起点的时间为0
        q.offer(new int[]{k, 0});
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0], time = curr[1];
            if (distance.containsKey(node)) {
                // 先看看存储的时间是多少
                int prevTime = distance.get(node);
                // 如果当前时间更短，就更新
                if (prevTime > time) {
                    distance.put(node, time);
                } else {
                    continue;
                }
            } else {
                // 到起点的时间为0
                distance.put(node, time);
            }
            // 当前结点更新完了，到当前node的距离更新完了
            // 去找下一个结点，根据索引node找到node对应的map
            Map<Integer, Integer> temp = map.getOrDefault(node, new HashMap<>());
            // 把这个map变成set（dict）的样式，可以用key value来取值，应该只是写法上更加方便一点
            for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
                int next = entry.getKey(), usedTime = entry.getValue();
                // 把之前的time（实际当前time给加上）
                q.offer(new int[]{next, usedTime + time});
            }
        }
        int res = 0;
        for (int i = 1; i <= n; ++i) {
            if (!distance.containsKey(i)) {
                return -1;
            }
            res = Math.max(res, distance.get(i));
        }
        return res;
    }
}
