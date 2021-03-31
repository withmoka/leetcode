package graph;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1135MyDemo {
    public int minimumCost(int N, int[][] connections) {
        DSU1135 dsu1135 = new DSU1135(N + 1);
        Arrays.sort(connections, Comparator.comparingInt(a -> a[2]));
        int cost = 0;
        int count = 0;
        for (int[] edge : connections) {
            if (dsu1135.union(edge[0], edge[1])) {
                cost = cost + edge[2];
                count++;
            }
            if (count == N - 1) {
                break;
            }
        }
        if (count < N - 1) {
            return -1;
        }
        return cost;
    }
}

class DSU1135 {
    int[] parent;

    public DSU1135(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean union(int x, int y) {
        if (find(x) == find(y)) {
            return false;
        } else {
            parent[find(x)] = find(y);
            return true;
        }
    }
}
