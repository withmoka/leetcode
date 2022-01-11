package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution1168 {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        DSUConnected dsu = new DSUConnected(n + 1);
        int count = 0;
        int cost = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < wells.length; i++) {
            int[] cur = new int[3];
            cur[1] = i + 1;
            cur[2] = wells[i];
            list.add(cur);
        }
        Collections.addAll(list, pipes);
        list.sort((o1, o2) -> o1[2] - o2[2]);
        for (int[] edge : list) {
            if (count == n) {
                break;
            }
            int v1 = edge[0];
            int v2 = edge[1];
            if (dsu.isConnected(v1, v2)) {
                continue;
            }
            int value = edge[2];
            dsu.union(v1, v2);
            count++;
            cost = cost + value;
        }
        return cost;
    }
}
