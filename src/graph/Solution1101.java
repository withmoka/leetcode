package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution1101 {
    public int earliestAcq(int[][] logs, int N) {
        DSU1101 dsu = new DSU1101(N);
        List<int[]> edges = new ArrayList<>();
        Collections.addAll(edges, logs);
        edges.sort(((o1, o2) -> o1[0] - o2[0]));
        int date = 0;
        for (int[] edge : edges) {
            int v1 = edge[1];
            int v2 = edge[2];
            dsu.union(v1, v2);
            date = edge[0];
            if (dsu.isCircle()) {
                return date;
            }
        }
        return -1;
    }
}
