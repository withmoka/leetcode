package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution1631 {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //这里的做法是跟它的下方，它的右方的去进行连接
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
        Collections.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        DSUbool dsu = new DSUbool(m * n);
        int value = 0;
        for (int[] edge : edges) {
            if (dsu.find(0)==dsu.find(m*n-1)) {
                break;
            }
            int v1 = edge[1];
            int v2 = edge[2];
            if (dsu.union(v1, v2)) {
                value = edge[0];
            }
        }
        return value;
    }
}
