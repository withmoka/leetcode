package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution1631Again {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        DSU1631 dsu = new DSU1631(m * n);
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < m) {
                    int[] cur = new int[3];
                    cur[0] = Math.abs(heights[i][j] - heights[i + 1][j]);
                    cur[1] = i * n + j;
                    cur[2] = (i + 1) * n + j;
                    edges.add(cur);
                }
                if (j + 1 < n) {
                    int[] cur = new int[3];
                    cur[0] = Math.abs(heights[i][j] - heights[i][j + 1]);
                    cur[1] = i * n + j;
                    cur[2] = i * n + j + 1;
                    edges.add(cur);
                }
            }
        }
        Collections.sort(edges, (o1, o2) -> o1[0] - o2[0]);
        int value = 0;
        for (int[] edge : edges) {
            if (dsu.isConnected(0, m * n - 1)) {
                break;
            }
            value = edge[0];
            dsu.union(edge[1], edge[2]);
        }
        return value;
    }
}
