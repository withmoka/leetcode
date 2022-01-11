package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution1168Third {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int count = 0;
        int cost = 0;
        DSU dsu = new DSU(n + 1);
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new int[]{0, i + 1, wells[i]});
        }
        Collections.addAll(edges, pipes);
        edges.sort((o1, o2) -> o1[2] - o2[2]);
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            if (dsu.isConnected(v1, v2)) {
                continue;
            } else {
                dsu.union(v1, v2);
            }
            cost += edge[2];
            count++;
            if (count == n) {
                break;
            }
        }
        return cost;
    }
}
