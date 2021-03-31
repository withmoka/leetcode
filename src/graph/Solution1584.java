package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution1584 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        DSUbool dsu = new DSUbool(n);
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new Edge(i, j, dist(points, i, j)));
                //编号为i和编号为j的两个点，之间，权值为dist的一条边
            }
        }
        Collections.sort(edges, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.len - o2.len;
            }
        });
        int sum = 0;
        int edgesNum = 0;
        for (Edge edge : edges) {
            int len = edge.len;
            int p1 = edge.p1;
            int p2 = edge.p2;
            if (dsu.union(p1, p2)) {
                sum = sum + len;
                edgesNum++;
                if (edgesNum == n - 1) {
                    break;
                }
            }
        }
        return sum;
    }

    public int dist(int[][] points, int p1, int p2) {
        return Math.abs(points[p1][0] - points[p2][0]) + Math.abs(points[p1][1] - points[p2][1]);
    }
}


//边，p1和p2，之间距离为len的边
class Edge {
    int p1, p2, len;

    public Edge(int p1, int p2, int len) {
        this.p1 = p1;
        this.p2 = p2;
        this.len = len;
    }
}