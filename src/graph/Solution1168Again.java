package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution1168Again {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        DSU dsu = new DSU(n + 1);
        List<int[]> edges = new ArrayList<>();
        int cost = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int[] edge = new int[]{0, i + 1, wells[i]};
            edges.add(edge);
        }
        Collections.addAll(edges, pipes);
        edges.sort((o1, o2) -> o1[2] - o2[2]);
        for (int[] edge : edges) {
            int v1 = edge[0];
            int v2 = edge[1];
            if (dsu.isConnected(v1, v2)) {
                continue;
            }
            dsu.union(v1, v2);
            count++;
            cost += edge[2];
            if (count == n) {
                break;
            }
        }
        return cost;
    }
}
