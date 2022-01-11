package graph;

import java.util.HashMap;
import java.util.Map;

class DSU {
    int[] parent;

    public DSU(int N) {
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

    public void union(int x, int y) {
        parent[find(x)] = find(y);
    }

    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    public int numOfUnion() {
        int num = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == i) {
                num++;
            }
        }
        return num;
    }
}
